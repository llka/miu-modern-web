package ru.ilka.miumodernweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ilka.miumodernweb.entity.ContentEnum;
import ru.ilka.miumodernweb.entity.LanguageEnum;
import ru.ilka.miumodernweb.service.PageFormatService;

@RestController
@RequestMapping("server/")
public class ServerController {
    @Autowired
    private PageFormatService pageFormatService;

    @GetMapping(value = "web-server", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getWebServerInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                           String language) {
        return pageFormatService.format(ContentEnum.WEB_SERVER.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.WEB_SERVER.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

}
