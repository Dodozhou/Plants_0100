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

    @RequestMapping(value = "/penqi/detail/{id}")
    public String penqi_detail(@PathVariable("id") int id, Model model){
        Material penqi=materialRepository.findOne(id);
        model.addAttribute("p",penqi);
        return "penqi_detail";
    }

    @RequestMapping(value = "/add_penqi",method = RequestMethod.GET)
    public String addForm(Model model){
        Material penqi=new Material();
        model.addAttribute("penqi",penqi);
        return "add_penqi";
    }

    @RequestMapping(value = "/penqi_upload",method = RequestMethod.POST)
    public String upload(@RequestPart("image") MultipartFile image, Material penqi, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        penqi.setImgs(url);
        penqi.setCategory("盆器");
        materialRepository.save(penqi);
        return "redirect:/";
    }

    /*---------------------------盆器控制器：结束--------------------------------*/

    /*---------------------------装饰控制器：开始--------------------------------*/

    @RequestMapping(value = "/decor/detail/{id}")
    public String decor_detail(@PathVariable("id") int id, Model model){
        Material decor=materialRepository.findOne(id);
        model.addAttribute("p",decor);
        return "decor_detail";
    }

    @RequestMapping(value = "/add_decor",method = RequestMethod.GET)
    public String addDecorForm(Model model){
        Material decor=new Material();
        model.addAttribute("decor",decor);
        return "add_decor";
    }

    @RequestMapping(value = "/decor_upload",method = RequestMethod.POST)
    public String decor_upload(@RequestPart("image") MultipartFile image, Material decor, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        decor.setImgs(url);
        decor.setCategory("装饰");
        materialRepository.save(decor);
        return "redirect:/";
    }

    /*---------------------------装饰控制器：结束--------------------------------*/

     /*---------------------------种子控制器：开始--------------------------------*/

    @RequestMapping(value = "/seed/detail/{id}")
    public String seed_detail(@PathVariable("id") int id, Model model){
        Material seed=materialRepository.findOne(id);
        model.addAttribute("p",seed);
        return "seed_detail";
    }

    @RequestMapping(value = "/add_seed",method = RequestMethod.GET)
    public String addSeedForm(Model model){
        Material seed=new Material();
        model.addAttribute("seed",seed);
        return "add_seed";
    }

    @RequestMapping(value = "/seed_upload",method = RequestMethod.POST)
    public String seed_upload(@RequestPart("image") MultipartFile image, Material seed, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        seed.setImgs(url);
        seed.setCategory("种子");
        materialRepository.save(seed);
        return "redirect:/";
    }

    /*---------------------------种子控制器：结束--------------------------------*/

     /*---------------------------土壤控制器：开始--------------------------------*/

    @RequestMapping(value = "/soil/detail/{id}")
    public String soil_detail(@PathVariable("id") int id, Model model){
        Material soil=materialRepository.findOne(id);
        model.addAttribute("p",soil);
        return "soil_detail";
    }

    @RequestMapping(value = "/add_soil",method = RequestMethod.GET)
    public String addSoilForm(Model model){
        Material soil=new Material();
        model.addAttribute("soil",soil);
        return "add_soil";
    }

    @RequestMapping(value = "/soil_upload",method = RequestMethod.POST)
    public String soil_upload(@RequestPart("image") MultipartFile image, Material soil, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        soil.setImgs(url);
        soil.setCategory("土壤");
        materialRepository.save(soil);
        return "redirect:/";
    }

    /*---------------------------土壤控制器：结束--------------------------------*/

    /*---------------------------化肥控制器：开始--------------------------------*/

    @RequestMapping(value = "/huafei/detail/{id}")
    public String huafei_detail(@PathVariable("id") int id, Model model){
        Material huafei=materialRepository.findOne(id);
        model.addAttribute("p",huafei);
        return "huafei_detail";
    }

    @RequestMapping(value = "/add_huafei",method = RequestMethod.GET)
    public String addHuafeiForm(Model model){
        Material huafei=new Material();
        model.addAttribute("huafei",huafei);
        return "add_huafei";
    }

    @RequestMapping(value = "/huafei_upload",method = RequestMethod.POST)
    public String huafei_upload(@RequestPart("image") MultipartFile image, Material huafei, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        huafei.setImgs(url);
        huafei.setCategory("化肥");
        materialRepository.save(huafei);
        return "redirect:/";
    }

    /*---------------------------花费控制器：结束--------------------------------*/

    /*---------------------------工具控制器：开始--------------------------------*/

    @RequestMapping(value = "/tool/detail/{id}")
    public String tool_detail(@PathVariable("id") int id, Model model){
        Material tool=materialRepository.findOne(id);
        model.addAttribute("p",tool);
        return "tool_detail";
    }

    @RequestMapping(value = "/add_tool",method = RequestMethod.GET)
    public String addToolForm(Model model){
        Material tool=new Material();
        model.addAttribute("tool",tool);
        return "add_tool";
    }

    @RequestMapping(value = "/tool_upload",method = RequestMethod.POST)
    public String tool_upload(@RequestPart("image") MultipartFile image, Material tool, HttpServletRequest request) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        tool.setImgs(url);
        tool.setCategory("工具");
        materialRepository.save(tool);
        return "redirect:/";
    }

    /*---------------------------工具控制器：结束--------------------------------*/

}
