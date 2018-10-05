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
 * Created by GayanB on
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public String init(@RequestParam(value = "error", required = false) String error,
                       @RequestParam(value = "logout", required = false) String message, Model model) {


        if ("access_denied".equals(error)) {
            model.addAttribute("error", "You have to login first!");
        }
        if (error != null) {
            model.addAttribute("error", "Username or password Invalid!");
        }
        if (message != null) {
            model.addAttribute("message", "Logout Successful");
        }
        return "welcome";
    }
}
