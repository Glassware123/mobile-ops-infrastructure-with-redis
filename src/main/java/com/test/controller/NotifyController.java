package com.test.controller;

import com.test.service.XMobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NotifyController {

    @Autowired
    private XMobileService xMobileService;

    @RequestMapping(value = "/")
    public ModelAndView showMainPage() {
        ModelAndView model = new ModelAndView("mainPage");
        return model;
    }

    @RequestMapping(value = "/sms", method = RequestMethod.GET)
    public ModelAndView smsPublisher() {
        ModelAndView model = new ModelAndView("sms");
        xMobileService.controlSMS();
        return model;
    }

    @RequestMapping(value = "/internet", method = RequestMethod.GET)
    public ModelAndView internetPublisher() {
        ModelAndView model = new ModelAndView("sms");
        xMobileService.controlInternet();
        return model;
    }

    @RequestMapping(value = "/credit", method = RequestMethod.GET)
    public ModelAndView creditPublisher() {
        ModelAndView model = new ModelAndView("sms");
        xMobileService.controlCredit();
        return model;
    }

    @RequestMapping(value = "/minute", method = RequestMethod.GET)
    public ModelAndView minutePublisher() {
        ModelAndView model = new ModelAndView("sms");
        xMobileService.controlMinute();
        return model;
    }
}
