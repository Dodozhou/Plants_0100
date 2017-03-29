package com.star.controller;

import com.star.domain.Material;
import com.star.domain.Plant;
import com.star.repository.MaterialRepository;
import com.star.repository.PlantRepository;
import com.star.util.ImgPathUtil;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by hp on 2017/3/21.
 */
@Controller
public class PlantController {
    @Autowired
    PlantRepository repository;
    @Autowired
    MaterialRepository materialRepository;
    @Autowired
    ImgPathUtil imgPathUtil;

    @RequestMapping({"/","/index"})
    public String index(Model model){
        List<Plant> plants=repository.findByCategoryOrderByPriceDesc("景天科");
        List<Material> penqis=materialRepository.findByCategoryOrderByPriceDesc("盆器");
        List<Material> decors=materialRepository.findByCategoryOrderByPriceDesc("装饰");
        List<Material> seeds=materialRepository.findByCategoryOrderByPriceDesc("种子");
        List<Material> soils=materialRepository.findByCategoryOrderByPriceDesc("土壤");
        List<Material> huafeis=materialRepository.findByCategoryOrderByPriceDesc("化肥");
        List<Material> tools=materialRepository.findByCategoryOrderByPriceDesc("工具");
        model.addAttribute("plants",plants);
        model.addAttribute("penqis",penqis);
        model.addAttribute("decors",decors);
        model.addAttribute("seeds",seeds);
        model.addAttribute("soils",soils);
        model.addAttribute("huafeis",huafeis);
        model.addAttribute("tools",tools);
        return "index";
    }

    @RequestMapping(value = "/find/{category}",produces = "application/json")
    public @ResponseBody List<Plant> findByCategory(@PathVariable("category") String category){
        return repository.findByCategoryOrderByPriceDesc(category);
    }

    @RequestMapping(value = "/detail/{id}",produces = "application/json")
    public String plant_detail(@PathVariable("id") int id,Model model){
        Plant plant=repository.findOne(id);
        model.addAttribute("p",plant);
        return "plant_detail";
    }

    @RequestMapping(value = "/add_plant",method = RequestMethod.GET)
    public String addForm(Model model){
        Plant plant=new Plant();
        model.addAttribute("plant",plant);
        return "add_plant";
    }

    @RequestMapping(value = "/plant_upload",method = RequestMethod.POST)
    public String upload(@RequestPart("image") MultipartFile image,Plant plant,HttpServletRequest request,Model model) throws IOException {
        String url=imgPathUtil.saveImgs(request,image);
        plant.setImgs(url);
        repository.save(plant);
        model.addAttribute("plant",plant);
        return "success";
    }

}
