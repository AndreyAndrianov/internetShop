package service.impl;

import form.AddWarehouseForm;
import model.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WarehouseRepository;
import util.AddWarehouseFormToWarehouse;

import java.util.List;

/**
 * Created by Andrey on 27.04.2017.
 */
@Service
public class WarehouseService implements service.WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepository;

    @Override
    public void saveNewWarehouse(AddWarehouseForm form) {
        Warehouse warehouse = AddWarehouseFormToWarehouse.transform(form);
        warehouseRepository.save(warehouse);
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
}
