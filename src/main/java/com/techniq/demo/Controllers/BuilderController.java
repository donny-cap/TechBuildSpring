package com.techniq.demo.Controllers;

import com.techniq.demo.Models.Kind_material;
import com.techniq.demo.Models.Material;
import com.techniq.demo.Models.Object;
import com.techniq.demo.Services.BuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/builder")
public class BuilderController {

    @Autowired
    BuilderService builderService;

    @GetMapping("")
    public String getMaterials(Model model) {
        List<Material> materials = builderService.getMaterials();
        model.addAttribute("materials", materials);

        List<Object> objects = builderService.getObjects();
        model.addAttribute("objects", objects);

        List<Kind_material> kind_materials = builderService.getKind_materials();
        model.addAttribute("kind_materials", kind_materials);

        return "builder";

    }

//    @GetMapping("/objects")
//    public String getObjects(Model model){
//        List<Object> objects = builderService.getObjects();
//        model.addAttribute("objects", objects);
//        return "builder";
//
//    }

}
