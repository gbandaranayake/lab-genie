package ruh.efac.lab.genie.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

/*
 * Created by GayanB on
 */
@Controller
public class LabController {
    private static final Logger logger = LogManager.getLogger(LabController.class);

    @RequestMapping("/lab")
    public ModelAndView openEditSourceConfigurationPage() {
        logger.info("Request received to open the laboratory view page");
        return new ModelAndView("index", Collections.emptyMap());
    }

}