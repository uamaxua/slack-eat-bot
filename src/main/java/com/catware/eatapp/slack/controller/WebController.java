package com.catware.eatapp.slack.controller;


import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class WebController extends SlackAppServlet {

    public WebController(App app) {
        super(app);
    }

    @PostMapping("/slack")
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        super.doPost(req, resp);
    }
}
