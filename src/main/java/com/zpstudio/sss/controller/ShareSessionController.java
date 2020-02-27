package com.zpstudio.sss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description share session api
 * @Author Administrator
 * @Date 2020/2/27 0027
 **/
@RestController
public class ShareSessionController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/set")
    public String setSession(HttpSession session) {
        session.setAttribute("user", "PumbaaZp");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session) {
        return session.getAttribute("user") + ":" + port;
    }
}
