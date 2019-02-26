package ru.ilka.miumodernweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ilka.miumodernweb.entity.ContentEnum;
import ru.ilka.miumodernweb.entity.LanguageEnum;
import ru.ilka.miumodernweb.service.PageFormatService;

@RestController
@RequestMapping("modern-web-technologies/")
public class Controller {
    private static final String MEDIA_TYPE = "text/html;charset=UTF-8";
    @Autowired
    private PageFormatService pageFormatService;

    @GetMapping(value = "server/web-server", produces = MEDIA_TYPE)
    public String getWebServerInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                           String language) {
        return pageFormatService.format(ContentEnum.WEB_SERVER.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.WEB_SERVER.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "server/application-server", produces = MEDIA_TYPE)
    public String getAppServerInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                           String language) {
        return pageFormatService.format(ContentEnum.APPLICATION_SERVER.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.APPLICATION_SERVER.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "server/application-server-vs-web-server", produces = MEDIA_TYPE)
    public String getServerDiffInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                            String language) {
        return pageFormatService.format(ContentEnum.WEB_SERVER_VS_APPLICATION_SERVER.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.WEB_SERVER_VS_APPLICATION_SERVER.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "database/model", produces = MEDIA_TYPE)
    public String getDatabaseModelInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                               String language) {
        return pageFormatService.format(ContentEnum.MODEL_DB.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.MODEL_DB.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "database/web", produces = MEDIA_TYPE)
    public String getDatabaseAndWebInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                                String language) {
        return pageFormatService.format(ContentEnum.DB_AND_WEB.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.DB_AND_WEB.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "client-server", produces = MEDIA_TYPE)
    public String getClientServerInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                              String language) {
        return pageFormatService.format(ContentEnum.CLIENT_SERVER.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.CLIENT_SERVER.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "html5-css3", produces = MEDIA_TYPE)
    public String getHtmlInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                      String language) {
        return pageFormatService.format(ContentEnum.HTML5.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.HTML5.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

    @GetMapping(value = "web-socket", produces = MEDIA_TYPE)
    public String getWebSocketInfo(@RequestParam(value = "language", defaultValue = "rus", required = false)
                                           String language) {
        return pageFormatService.format(ContentEnum.WEB_SOCKET.getContent(LanguageEnum.getByDisplayedName(language)),
                ContentEnum.WEB_SOCKET.getTitle(LanguageEnum.getByDisplayedName(language)));
    }

}
