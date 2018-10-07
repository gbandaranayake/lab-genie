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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ruh.efac.lab.genie.domain.Instrument;
import ruh.efac.lab.genie.repository.InstrumentsRepository;

import java.util.Collections;
import java.util.List;

/*
 * Created by GayanB
 */
@Controller
public class LaboratoryController {
    private static final Logger logger = LogManager.getLogger(LaboratoryController.class);

    InstrumentsRepository instrumentsRepository;

    @RequestMapping("/lab")
    public ModelAndView openEditSourceConfigurationPage() {
        logger.info("Request received to open the laboratory view page");
        return new ModelAndView("welcome", Collections.emptyMap());
    }

    @RequestMapping(value = "/lab/instruments", produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody List<Instrument> getInstrumentsForLab(@RequestParam(value = "labName") String labName) {
        logger.info("Request received to open get the instruments list for lab name [{}]", labName);
        return instrumentsRepository.getInstruments(labName);
    }
}
