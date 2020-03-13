package com.org.building.admin.domain.contracts;

import com.org.building.admin.domain.model.MaterialType;

import java.util.Map;
import java.util.Set;

public interface InventoryRepository {

    public Map<MaterialType, Integer> findExistences(Set<MaterialType> materialType);
}
