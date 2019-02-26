package ru.ilka.miumodernweb.entity;

public enum ContentEnum {
    WEB_SERVER("Веб-сервер — сервер, принимающий HTTP-запросы от клиентов, обычно веб-браузеров, и выдающий им HTTP-ответы, как правило, вместе с HTML-страницей, изображением, файлом, медиа-потоком или другими данными. " +
            "Веб-сервером называют как программное обеспечение, выполняющее функции веб-сервера, так и непосредственно компьютер (см.: Сервер (аппаратное обеспечение)), на котором это программное обеспечение работает. " +
            "Клиент, которым обычно является веб-браузер, передаёт веб-серверу запросы на получение ресурсов, обозначенных URL-адресами. Ресурсы — это HTML-страницы, изображения, файлы, медиа-потоки или другие данные, " +
            "  которые необходимы клиенту. В ответ веб-сервер передаёт клиенту запрошенные данные. Этот обмен происходит по протоколу HTTP.", "A web server (or Web server) is server software, or hardware dedicated to running said software, that can satisfy World Wide Web client requests. A web server can, in general, contain one or more websites. A web server processes incoming network requests over HTTP and several other related protocols.\\\n" +
            "The primary function of a web server is to store, process and deliver web pages to clients.[2] The communication between client and server takes place using the Hypertext Transfer Protocol (HTTP). Pages delivered are most frequently HTML documents, which may include images, style sheets and scripts in addition to the text content.\\\n" +
            "Multiple web servers may be used for a high traffic website; here, Dell servers are installed together being used for the Wikimedia Foundation.\\\n" +
            "A user agent, commonly a web browser or web crawler, initiates communication by making a request for a specific resource using HTTP and the server responds with the content of that resource or an error message if unable to do so. The resource is typically a real file on the server's secondary storage, but this is not necessarily the case and depends on how the web server is implemented.\\\n" +
            "While the primary function is to serve content, a full implementation of HTTP also includes ways of receiving content from clients. This feature is used for submitting web forms, including uploading of files.\\\n" +
            "Many generic web servers also support server-side scripting using Active Server Pages (ASP), PHP (Hypertext Preprocessor), or other scripting languages. This means that the behaviour of the web server can be scripted in separate files, while the actual server software remains unchanged. Usually, this function is used to generate HTML documents dynamically (\"on-the-fly\") as opposed to returning static documents. The former is primarily used for retrieving or modifying information from databases. The latter is typically much faster and more easily cached but cannot deliver dynamic content.\\\n" +
            "Web servers can frequently be found embedded in devices such as printers, routers, webcams and serving only a local network. The web server may then be used as a part of a system for monitoring or administering the device in question. This usually means that no additional software has to be installed on the client computer since only a web browser is required (which now is included with most operating systems).", "Web server", "Веб-сервер");

    private final String contentRus;
    private final String contentEng;
    private final String titleEng;
    private final String titleRus;


    ContentEnum(String contentRus, String contentEng, String titleEng, String titleRus) {
        this.contentRus = contentRus;
        this.contentEng = contentEng;
        this.titleEng = titleEng;
        this.titleRus = titleRus;
    }

    public String getContent(LanguageEnum language) {
        switch (language) {
            case ENG:
                return contentEng;
            case RUS:
                return contentRus;
            default:
                return contentRus;
        }
    }

    public String getTitle(LanguageEnum language) {
        switch (language) {
            case ENG:
                return titleEng;
            case RUS:
                return titleRus;
            default:
                return titleRus;
        }
    }


}
