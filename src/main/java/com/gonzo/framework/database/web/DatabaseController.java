package com.gonzo.framework.database.web;

import com.gonzo.framework.database.web.command.QueryCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/database",method = RequestMethod.POST)
public class DatabaseController {

    @RequestMapping("/query")
    public ModelAndView jmeterStart(QueryCommand request) throws Exception {

        ModelAndView mav = new ModelAndView("databaseQuery");
        return mav;
    }
}
