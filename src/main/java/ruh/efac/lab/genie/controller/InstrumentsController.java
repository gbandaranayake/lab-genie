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
import ruh.efac.lab.genie.domain.Instrument;
import ruh.efac.lab.genie.repository.InstrumentsRepository;

import java.util.List;

@Controller
public class InstrumentsController {
    private static final Logger logger = LogManager.getLogger(LaboratoryController.class);

    @Autowired
    private InstrumentsRepository instrumentsRepository;

    @RequestMapping(value = "/instruments/list", produces = "application/json")
    public @ResponseBody List<Instrument> getInstrumentsForInventory(@RequestParam(name = "inventoryNo") Integer inventoryNo) {
        logger.info("Request received to get list of all instruments for inventoryNo [{}]", inventoryNo);
        return instrumentsRepository.getInstrumentsByInventory(inventoryNo);
    }

    public void setInstrumentsRepository(InstrumentsRepository instrumentsRepository) {
        this.instrumentsRepository = instrumentsRepository;
    }
}
