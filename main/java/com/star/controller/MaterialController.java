package com.star.controller;

import com.star.domain.Material;
import com.star.domain.Plant;
import com.star.repository.MaterialRepository;
import com.star.util.ImgPathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by hp on 2017/3/26.
 */
@Controller
public class MaterialController {
    @Autowired
    MaterialRepository materialRepository;
    @Autowired
    ImgPathUtil imgPathUtil;
    /*---------------------------盆器控制器：开始--------------------------------*/

    @RequestMapping(value = "/material/detail/{id}")
    public String material_detail(@PathVariable("id") int id, Model model){
        Material material=materialRepository.findOne(id);
        model.addAttribute("p",material);
        return "material_detail";
    }

    @RequestMapping(value = "/add_material",method = RequestMethod.GET)
    public String addForm(Model model){
        Material material=new Material();
        model.addAttribute("material",material);
        return "add_material";
    }

    @RequestMapping(value = "/material_upload",method = RequestMethod.POST)
    public String upload(@RequestPart("image") MultipartFile image, Material material, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        material.setImgs(url);
        materialRepository.save(material);
        return "redirect:/";
    }

    /*---------------------------盆器控制器：结束--------------------------------*/


}
