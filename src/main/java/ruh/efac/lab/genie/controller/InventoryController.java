/*
 * (C) Copyright 2010-2015 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package ruh.efac.lab.genie.controller;
/*
 * Created by GayanB
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ruh.efac.lab.genie.domain.Inventory;
import ruh.efac.lab.genie.repository.InventoryRepository;

import java.util.List;

@Controller
public class InventoryController {
    private static final Logger logger = LogManager.getLogger(LaboratoryController.class);

    @Autowired
    InventoryRepository inventoryRepository;

    @RequestMapping(value = "/inventory", produces = "application/json")
    public @ResponseBody List<Inventory> getAllInventories(@RequestParam(value = "labName") Integer labId) {
        logger.info("Request received to get all inventories for lab id [{}]", labId);
        return inventoryRepository.getAllForLab(labId);
    }

    public void setInventoryRepository(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
}
