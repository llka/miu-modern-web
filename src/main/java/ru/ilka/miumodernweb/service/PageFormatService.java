package ru.ilka.miumodernweb.service;

import org.springframework.stereotype.Service;

@Service
public class PageFormatService {
    public String format(String content, String title) {
        return "<!doctype html>\n" +
                "\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta content=\"text/html; charset=UTF-8\" http-equiv=\"Content-Type\">\n" +
                "\n" +
                "  <title>" + title + "</title>\n" +
                "\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n <div>" +
                content +
                "</div> </body>\n" +
                "</html>";
    }
}
