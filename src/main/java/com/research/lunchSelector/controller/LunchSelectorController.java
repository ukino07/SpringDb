package com.research.lunchSelector.controller;

import com.research.lunchSelector.service.LunchSelectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by u_kino07 on 2018. 5. 22..
 */
@RestController
@RequestMapping("lunch")
public class LunchSelectorController {
    @Autowired
    private LunchSelectorService lunchSelectorService;

    @RequestMapping("notice")
    public String notice() {
        return lunchSelectorService.getMessage();
    }
}
