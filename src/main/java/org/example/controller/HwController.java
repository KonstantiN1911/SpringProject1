package org.example.controller;

import org.example.model.RequestScopeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HwController {

    private final RequestScopeBean requestScopeBean;

    @Autowired
    public HwController(RequestScopeBean requestScopeBean) {
        this.requestScopeBean = requestScopeBean;
    }
}


