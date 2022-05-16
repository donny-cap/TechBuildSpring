package com.techniq.demo.Services;

import com.techniq.demo.Models.Kind_material;
import com.techniq.demo.Models.Material;
import com.techniq.demo.Models.Object;
import com.techniq.demo.Repositories.Kind_materialRepository;
import com.techniq.demo.Repositories.MaterialRepository;
import com.techniq.demo.Repositories.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuilderService {

    @Autowired
    MaterialRepository materialRepository;

    @Autowired
    ObjectRepository objectRepository;

    @Autowired
    Kind_materialRepository kind_materialRepository;



    public List<Material> getMaterials() {
        List<Material> materials = (List<Material>) materialRepository.findAll();
        return materials;
    }

    public List<Object> getObjects() {
        List<Object> objects = (List<Object>) objectRepository.findAll();
        return objects;
    }
    public List<Kind_material> getKind_materials() {
        List<Kind_material> kind_materials = (List<Kind_material>) kind_materialRepository.findAll();
        return kind_materials;
    }

}
