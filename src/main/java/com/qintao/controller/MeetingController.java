package com.qintao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meeting")
public class MeetingController {

    @GetMapping("list")
    public String list() {
        return "/meeting/list";
    }

    @GetMapping("apply")
    public String apply() {
        return "/meeting/apply";
    }

    @GetMapping("history")
    public String history() {
        return "/meeting/history";
    }
}
