package com.star.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by hp on 2017/3/23.
 */
@Component
public class ImgPathUtil {

    public String saveImgs(HttpServletRequest request,MultipartFile image) throws IOException {
        String randomDir=generateRandomDir();
        String fileName=generateRandomFileName(image.getOriginalFilename());
        File dir=new File(request.getSession().getServletContext().getRealPath("/uploads"+randomDir));
        if(!dir.exists()){
            dir.mkdirs();
        }
        String finalFileName=dir.getAbsolutePath()+"/"+fileName;
        image.transferTo(new File(finalFileName));
        return "/uploads"+randomDir+"/"+fileName;
    }

    //获取hashcode生成二级目录
    private static String generateRandomDir(){
        SimpleDateFormat df=new SimpleDateFormat("/yyyy/MM/dd/HH");
        return df.format(new Date());
    }

    //获取随机UUID文件名
    private static String generateRandomFileName(String fileName){
        //获得扩展名
        String ext=fileName.substring(fileName.lastIndexOf("."));
        //UUID+扩展名
        return UUID.randomUUID().toString()+ext;
    }
}
