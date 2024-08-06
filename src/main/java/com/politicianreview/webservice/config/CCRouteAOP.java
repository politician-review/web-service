package com.politicianreview.webservice.config;

import com.politicianreview.webservice.common.GlobalURI;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class CCRouteAOP {

    @Pointcut("execution(public org.springframework.web.servlet.ModelAndView com.politicianreview.webservice.controller..*(..) )")
    public void allCCRouteController() {
    }

    @AfterReturning(pointcut = "allCCRouteController()", returning = "viewModel")
    public void addGlobalPropertiesDetail(ModelAndView viewModel) {

        // added globalUrls data
        viewModel.addObject("GlobalURI", new GlobalURI());
    }
}
