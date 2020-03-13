package com.org.building.admin.domain.services;

import com.org.building.admin.domain.model.BuildingType;
import com.org.building.admin.domain.model.MaterialType;

import java.util.Map;

public class InventoryService {

    public Boolean validateExistences(BuildingType buildingType, Map<MaterialType, Integer> availableMaterials) {
        return true;
    }
}
