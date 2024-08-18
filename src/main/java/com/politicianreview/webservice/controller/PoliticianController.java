package com.politicianreview.webservice.controller;

import com.politicianreview.webservice.common.GlobalURI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PoliticianController {

    @GetMapping(GlobalURI.POLITICIAN_ROOT_URI)
    public ModelAndView detailView() {
        return new ModelAndView("main/politician-detail");
    }

    @GetMapping(GlobalURI.POLITICIAN_LIST)
    public ModelAndView listView() {
        return new ModelAndView("main/politician-list");
    }
}
