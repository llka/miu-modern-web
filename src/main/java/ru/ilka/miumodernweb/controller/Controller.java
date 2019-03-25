package ru.ilka.miumodernweb.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/miu-modern-web-technologies")
    public String home(Model model) {
        return "home";
    }

    @GetMapping(value = "/miu-modern-web-technologies/server")
    public String getWebServerInfo() {
        return "server";
    }

    @GetMapping(value = "/miu-modern-web-technologies/database")
    public String getDatabaseModelInfo() {
        return "database";
    }

    @GetMapping(value = "/miu-modern-web-technologies/client-server")
    public String getClientServerInfo() {
        return "client-server";
    }

    @GetMapping(value = "/miu-modern-web-technologies/html5-css3")
    public String getHtmlInfo() {
        return "html5-css3";
    }

    @GetMapping(value = "/miu-modern-web-technologies/web-socket")
    public String getWebSocketInfo() {
        return "web-socket";
    }
}
