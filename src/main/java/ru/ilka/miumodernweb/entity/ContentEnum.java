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
            "Web servers can frequently be found embedded in devices such as printers, routers, webcams and serving only a local network. The web server may then be used as a part of a system for monitoring or administering the device in question. This usually means that no additional software has to be installed on the client computer since only a web browser is required (which now is included with most operating systems).", "Web server", "Веб-сервер"),

    APPLICATION_SERVER("Сервер приложений (англ. application server) — это программная платформа (фреймворк), предназначенная для эффективного исполнения процедур (программ, скриптов), на которых построены приложения. Сервер приложений действует как набор компонентов, доступных разработчику программного обеспечения через API (интерфейс прикладного программирования), определённый самой платформой.\n" +
            "\n" +
            "Для веб-приложений основная задача компонентов сервера — обеспечивать создание динамических страниц. Однако современные серверы приложений включают в себя и поддержку кластеризации, повышенную отказоустойчивость, балансировку нагрузки, позволяя таким образом разработчикам сфокусироваться только на реализации бизнес-логики.\n" +
            "\n" +
            "В случае Java-сервера приложений, сервер приложений ведёт себя как расширенная виртуальная машина для запуска приложений, прозрачно управляя соединениями с базой данных, с одной стороны, и соединениями с веб-клиентом, с другой.", "An application server is a software framework that provides both facilities to create web applications and a server environment to run them.[1]\n" +
            "\n" +
            "Application Server Frameworks contain a comprehensive service layer model. An application server acts as a set of components accessible to the software developer through a standard API defined for the platform itself. For Web applications, these components are usually performed in the same running environment as their web server(s), and their main job is to support the construction of dynamic pages. However, many application servers target much more than just Web page generation: they implement services like clustering, fail-over, and load-balancing, so developers can focus on implementing the business logic.[2]\n" +
            "\n" +
            "In the case of Java application servers, the server behaves like an extended virtual machine for running applications, transparently handling connections to the database on one side, and, often, connections to the Web client on the other.[citation needed]\n" +
            "\n" +
            "Other uses of the term may refer to the services that a server makes available or the computer hardware on which the services run.", "Application Server", "Сервер приложений"),

    WEB_SERVER_VS_APPLICATION_SERVER("В большинстве случаев эти термины Web Server и сервер приложений используются взаимозаменяемо.\n" +
            "\n" +
            "Ниже перечислены некоторые ключевые отличия в функциях веб-сервера и сервера приложений:\n" +
            "\n" +
            "Веб-сервер предназначен для обслуживания содержимого HTTP. Сервер приложений также может обслуживать HTTP-контент, но не ограничивается только HTTP. Он может быть предоставлен для поддержки других протоколов, таких как RMI/RPC\n" +
            "Веб-сервер в основном предназначен для обслуживания статического контента, хотя большинство веб-серверов имеют плагины для поддержки языков сценариев, таких как Perl, PHP, ASP, JSP и т.д., через которые эти серверы могут генерировать динамический контент HTTP.\n" +
            "Большинство серверов приложений имеют в своем составе Web-сервер, что означает, что сервер приложений может делать все, на что способен веб-сервер. Кроме того, сервер приложений имеет компоненты и функции для поддержки сервисов уровня приложения, таких как пул соединений, объединение объектов, поддержка транзакций, службы обмена сообщениями и т.д.\n" +
            "Поскольку веб-серверы хорошо подходят для статического контента и серверов приложений для динамического контента, большинство производственных сред имеют веб-сервер, выступающий в качестве обратного прокси-сервера для сервера приложений. Это означает, что при обслуживании запроса страницы статическое содержимое (например, изображения/статический HTML) обслуживается веб-сервером, который интерпретирует запрос. Используя какой-то метод фильтрации (в основном расширение запрашиваемого ресурса), веб-сервер идентифицирует запрос динамического содержимого и прозрачно пересылает сервер приложений.\n" +
            "Пример такой конфигурации - сервер HTTP Apache Tomcat и сервер Oracle (ранее BEA) WebLogic. HTTP-сервер Apache Tomcat - это веб-сервер, а Oracle WebLogic - это сервер приложений.\n" +
            "\n" +
            "В некоторых случаях серверы тесно интегрированы, такие как IIS и .NET Runtime. IIS - это веб-сервер. При использовании среды выполнения .NET среда IIS может предоставлять приложения.",
            "Most of the times these terms Web Server and Application server are used interchangeably.\n" +
                    "\n" +
                    "Following are some of the key differences in features of Web Server and Application Server:\n" +
                    "\n" +
                    "Web Server is designed to serve HTTP Content. App Server can also serve HTTP Content but is not limited to just HTTP. It can be provided other protocol support such as RMI/RPC\n" +
                    "Web Server is mostly designed to serve static content, though most Web Servers have plugins to support scripting languages like Perl, PHP, ASP, JSP etc. through which these servers can generate dynamic HTTP content.\n" +
                    "Most of the application servers have Web Server as integral part of them, that means App Server can do whatever Web Server is capable of. Additionally App Server have components and features to support Application level services such as Connection Pooling, Object Pooling, Transaction Support, Messaging services etc.\n" +
                    "As web servers are well suited for static content and app servers for dynamic content, most of the production environments have web server acting as reverse proxy to app server. That means while servicing a page request, static contents (such as images/Static HTML) are served by web server that interprets the request. Using some kind of filtering technique (mostly extension of requested resource) web server identifies dynamic content request and transparently forwards to app server\n" +
                    "Example of such configuration is Apache Tomcat HTTP Server and Oracle (formerly BEA) WebLogic Server. Apache Tomcat HTTP Server is Web Server and Oracle WebLogic is Application Server.\n" +
                    "\n" +
                    "In some cases the servers are tightly integrated such as IIS and .NET Runtime. IIS is web server. When equipped with .NET runtime environment, IIS is capable of providing application services.",
            "Web Server and Application server",
            "Отличия в функциях веб-сервера и сервера приложений"),
    MODEL_DB("База данных model используется в качестве шаблона для всех баз данных, созданных для экземпляра SQL Server. Так как база данных tempdb создается при каждом запуске SQL Server , база данных model всегда должна существовать в системе SQL Server . Содержимое базы данных model (включая параметры базы данных) полностью копируется в новую базу данных. Некоторые параметры базы данных model используются также при создании новой базы данных tempdb во время загрузки, поэтому наличие базы данных model в системе SQL Server обязательно.\n" +
            "Вновь созданные пользовательские базы данных используют ту же модель восстановления , что и база данных model. Пользователь может настроить значение по умолчанию. Дополнительные сведения о текущей модели восстановления см. в разделе Просмотр или изменение модели восстановления базы данных (SQL Server).\n" +
            " Важно!\n" +
            "\n" +
            "В случае изменения базы данных model и внесения в нее пользовательских сведений шаблона рекомендуется сначала создать резервную копию базы данных model. Дополнительные сведения см. в статье Резервное копирование и восстановление системных баз данных (SQL Server).\n" +
            "Использование базы данных model\n" +
            "При выполнении инструкции CREATE DATABASE первая часть базы данных создается путем копирования в нее содержимого базы данных model . Оставшаяся часть новой базы данных заполняется пустыми страницами.\n" +
            "При изменении базы данных model все созданные после этого базы данных унаследуют эти изменения. Например, можно установить разрешения или параметры базы данных или добавить такие объекты, как таблицы, функции или хранимые процедуры. Свойства файлов базы данных model являются исключением и не учитываются (за исключением первоначального размера файла данных). Исходный размер по умолчанию файла журнала и данных для шаблона базы данных составляет 8 МБ.",
            "",
            "",
            "Модель базы данных SQL"),

    DB_AND_WEB("данным из-за того, что:\n" +
            "• Количество пользователей может не только существенно варьироваться, но и изменяться без предупреждения. В обычных клиент/серверных приложениях администраторы могут контролировать число пользователей и возможность их доступа к данным.\n" +
            "\n" +
            "• Пользователей физически невозможно определить, они могут, не закрыв одного приложения, подключиться к другому, что не гарантирует правильного отключения от приложения.\n" +
            "\n" +
            "• В клиент-серверных приложениях при изменении данных несколькими пользователями используются блокировки на уровне записи (пессимистический параллелизм). В Web-приложениях применяется принцип оптимистического параллелизма, предполагающего фактически монопольный доступ для каждого пользователя.\n" +
            "\n" +
            "• Посредником, реализующим доступ от клиента к БД, выступает специальная программа – Web-сервер, обеспечивающая функционирование пользовательского приложения, выполняющего непосредственный запрос к данным и возврат ответа в виде HTML-документа.",
            "The Database Tier\n" +
                    "The database tier is the base of a web database application. Understanding system requirements, choosing database-tier software, designing databases, and building the tier are the first steps in successful web database application development. We discuss techniques for modeling system requirements, converting a model into a database, and the principles of database technology in Appendix C. In this section, we focus on the components of the database tier and introduce database software by contrasting it with other techniques for storing data. Chapter 3 covers the standards and software we use in more detail.\n" +
                    "\n" +
                    "In a three-tier architecture application, the database tier manages the data. The data management typically includes storage and retrieval of data, as well as managing updates, allowing simultaneous, or concurrent, access by more than one middle-tier process, providing security, ensuring the integrity of data, and providing support services such as data backup. In many web database applications, these services are provided by a RDBMS system, and the data stored in a relational database .\n" +
                    "\n" +
                    "Managing relational data in the third tier requires complex RDBMS software. Fortunately, most DBMSs are designed so that the software complexities are hidden. To effectively use a DBMS, skills are required to design a database and formulate commands and queries to the DBMS. For most DBMSs, the query language of choice is SQL. An understanding of the underlying architecture of the DBMS is unimportant to most users.\n" +
                    "\n" +
                    "In this book, we use the MySQL RDBMS to manage data. Much like choosing a middle-tier scripting language, there are often arguments about which DBMS is most suited to an application. MySQL has a well-deserved reputation for speed, and it is particularly well designed for applications where retrieval of data is more common than updates and where small, simple updates are the general class of modifications. These are characteristics typical of most web database applications. Also, like PHP and Apache, MySQL is open source software. However, there are down sides to MySQL we’ll discuss later in this section.\n" +
                    "\n" +
                    "There are other, nonrelational DBMS software choices for storing data in the database tier. These include search engines, document management systems, and simple gateway services such as email software. Our discussions in this book focus on relational database technology in the database tier.\n" +
                    "\n" +
                    "Database Management Systems\n" +
                    "A database management system stores, searches, and manages data.\n" +
                    "\n" +
                    "A database is a collection of related data. The data stored can be a few entries, or rows , that make up a simple address book of names, addresses, and phone numbers. In contrast, the database can also contain millions of records that describe the catalog, purchases, orders, and payroll of a large company. The database behind our case study, Hugh and Dave’s Online Wines, is an example of a medium-sized database that falls between these two extremes.\n" +
                    "\n" +
                    "A DBMS is a set of components for defining, constructing, and manipulating a database. When we refer to a database management system, we generally mean a relational DBMS or RDBMS. Relational databases store and manage relationships between data—for example, customers placing orders, customer orders containing line items, or wineries being part of a wine-growing region.\n" +
                    "\n" +
                    "Figure 1-4 shows the simplified architecture of a typical DBMS.",
            "The Database Tier",
            "Особенности работы СУБД в WEB"),
    CLIENT_SERVER("«Клиент — сервер» (англ. client–server) — вычислительная или сетевая архитектура, в которой задания или сетевая нагрузка распределены между поставщиками услуг, называемыми серверами, и заказчиками услуг, называемыми клиентами. Фактически клиент и сервер — это программное обеспечение. Обычно эти программы расположены на разных вычислительных машинах и взаимодействуют между собой через вычислительную сеть посредством сетевых протоколов, но они могут быть расположены также и на одной машине. Программы-серверы ожидают от клиентских программ запросы и предоставляют им свои ресурсы в виде данных (например, загрузка файлов посредством HTTP, FTP, BitTorrent, потоковое мультимедиа или работа с базами данных) или в виде сервисных функций (например, работа с электронной почтой, общение посредством систем мгновенного обмена сообщениями или просмотр web-страниц во всемирной паутине). Поскольку одна программа-сервер может выполнять запросы от множества программ-клиентов, её размещают на специально выделенной вычислительной машине, настроенной особым образом, как правило, совместно с другими программами-серверами, поэтому производительность этой машины должна быть высокой. Из-за особой роли такой машины в сети, специфики её оборудования и программного обеспечения, её также называют сервером, а машины, выполняющие клиентские программы, соответственно, клиентами.",
            "Client–server model is a distributed application structure that partitions tasks or workloads between the providers of a resource or service, called servers, and service requesters, called clients.[1] Often clients and servers communicate over a computer network on separate hardware, but both client and server may reside in the same system. A server host runs one or more server programs which share their resources with clients. A client does not share any of its resources, but requests a server's content or service function. Clients therefore initiate communication sessions with servers which await incoming requests. Examples of computer applications that use the client–server model are Email, network printing, and the World Wide Web." +
                    "Client and server role\n" +
                    "The client-server characteristic describes the relationship of cooperating programs in an application. The server component provides a function or service to one or many clients, which initiate requests for such services. Servers are classified by the services they provide. For example, a web server serves web pages and a file server serves computer files. A shared resource may be any of the server computer's software and electronic components, from programs and data to processors and storage devices. The sharing of resources of a server constitutes a service.\n" +
                    "\n" +
                    "Whether a computer is a client, a server, or both, is determined by the nature of the application that requires the service functions. For example, a single computer can run web server and file server software at the same time to serve different data to clients making different kinds of requests. Client software can also communicate with server software within the same computer.[2] Communication between servers, such as to synchronize data, is sometimes called inter-server or server-to-server communication.",
            "Client–server model",
            "Клиент — сервер"),
    HTML5("HTML5 (англ. HyperText Markup Language, version 5) — язык для структурирования и представления содержимого всемирной паутины. Это пятая версия HTML. Хотя стандарт был завершён (рекомендованная версия к использованию) только в 2014 году[1][2] (предыдущая, четвёртая, версия опубликована в 1999 году[3]), уже с 2013 года[4] браузерами оперативно осуществлялась поддержка, а разработчиками — использование рабочего стандарта (англ. HTML Living Standard). Цель разработки HTML5 — улучшение уровня поддержки мультимедиа-технологий с одновременным сохранением обратной совместимости, удобочитаемости кода для человека и простоты анализа для парсеров.\n" +
            "\n" +
            "Во всемирной паутине долгое время использовались стандарты HTML 4.01, XHTML 1.0 и XHTML 1.1. Веб-страницы на практике оказывались свёрстаны с использованием смеси особенностей, представленных различными спецификациями, включая спецификации программных продуктов, например веб-браузеров, а также сложившихся общеупотребительных приёмов. HTML5 был создан как единый язык разметки, который мог бы сочетать синтаксические нормы HTML и XHTML. Он расширяет, улучшает и рационализирует разметку документов, а также добавляет единый API для сложных веб-приложений[5].\n" +
            "\n" +
            "CSS3 (англ. Cascading Style Sheets 3 — каскадные таблицы стилей третьего поколения) — активно разрабатываемая спецификация CSS. Представляет собой формальный язык, реализованный с помощью языка разметки. Самая масштабная редакция по сравнению с CSS1, CSS2 и CSS2.1. Главной особенностью CSS3 является возможность создавать анимированные элементы без использования JS[4], поддержка линейных и радиальных градиентов, теней, сглаживания и прочее.\n" +
            "\n" +
            "Преимущественно используется как средство описания и оформления внешнего вида веб-страниц, написанных с помощью языков разметки HTML и XHTML, но может также применяться к любым XML-документам, например, к SVG или XUL.\n" +
            "\n" +
            "Разрабатываемая версия (список всех модулей)[5].\n" +
            "\n" +
            "В отличие от предыдущих версий спецификация разбита на модули, разработка и развитие которых идёт независимо. CSS3 основан на CSS2.1, дополняет существующие свойства и значения и добавляет новые.\n" +
            "\n" +
            "Нововведения, начиная с малых, вроде закругленных углов блоков, заканчивая трансформацией (анимацией) и, возможно, введением переменных[6][7]." +
            "В HTML5 реализовано множество новых синтаксических особенностей. Например, элементы <video>, <audio> и <canvas>, а также возможность использования SVG и математических формул. Эти новшества разработаны для упрощения создания и управления графическими и мультимедийными объектами в сети без необходимости использования сторонних API и плагинов. Другие новые элементы, такие как <section>, <article>, <header> и <nav>, разработаны для того, чтобы обогащать семантическое содержимое документа (страницы). Новые атрибуты были введены с той же целью, хотя ряд элементов и атрибутов был удалён. Некоторые элементы, например <a>, <menu> и <cite>, были изменены, переопределены или стандартизированы. API и DOM стали основными частями спецификации HTML5[5]. HTML5 также определяет некоторые особенности обработки ошибок вёрстки, поэтому синтаксические ошибки должны рассматриваться одинаково всеми совместимыми браузерами[6].",
            "HTML 5 (formerly and commonly spelled HTML5[a]) is a software solution stack that defines the properties and behaviors of web page content by implementing a markup based pattern to it.\n" +

                    "\n" +
                    "HTML 5 is the fifth and current major version of the HTML standard, and subsumes XHTML. It currently exists in two standardized forms: HTML 5.2 Recommendation[4] by the World Wide Web Consortium (W3C, a broad coalition of organizations), intended primarily for Web content developers; and HTML Living Standard[5] by WHATWG (a small consortium of four browser vendors), intended primarily for browser developers, though it also exists in an abridged Web developer version.[6] There are minor conflicts between the two groups' specifications.\n" +
                    "\n" +
                    "HTML 5 was first released in public-facing form on 22 January 2008,[7] with a major update and \"W3C Recommendation\" status in October 2014.[2][8] Its goals are to improve the language with support for the latest multimedia and other new features; to keep the language both easily readable by humans and consistently understood by computers and devices such as Web browsers, parsers, etc., without XHTML's rigidity; and to remain backward-compatible with older software. HTML 5 is intended to subsume not only HTML 4, but also XHTML 1 and DOM Level 2 HTML;[9] the HTML 4 and XHTML specs were announced as superseded by HTML 5.2 on 27 March 2018.[10]\n" +
                    "\n" +
                    "HTML 5 includes detailed processing models to encourage more interoperable implementations; it extends, improves and rationalizes the markup available for documents, and introduces markup and application programming interfaces (APIs) for complex web applications.[11] For the same reasons, HTML 5 is also a candidate for cross-platform mobile applications, because it includes features designed with low-powered devices in mind.\n" +
                    "\n" +
                    "Many new syntactic features are included. To natively include and handle multimedia and graphical content, the new <video>, <audio> and <canvas> elements were added, and support for scalable vector graphics (SVG) content and MathML for mathematical formulas. To enrich the semantic content of documents, new page structure elements such as <main>, <section>, <article>, <header>, <footer>, <aside>, <nav>, and <figure> are added. New attributes are introduced, some elements and attributes have been removed, and others such as <a />, <cite>, and <menu> have been changed, redefined, or standardized.\n" +
                    "\n" +
                    "The APIs and Document Object Model (DOM) are now fundamental parts of the HTML 5 specification[11] and HTML 5 also better defines the processing for any invalid documents.[12]"
            ,
            "HTML5 and CSS3",
            "HTML5 и CSS3"),
    WEB_SOCKET("WebSocket — протокол связи поверх TCP-соединения, предназначенный для обмена сообщениями между браузером и веб-сервером в режиме реального времени.\n" +
            "\n" +
            "В настоящее время в W3C осуществляется стандартизация API Web Sockets. Черновой вариант стандарта этого протокола утверждён IETF.\n" +
            "\n" +
            "WebSocket разработан для воплощения в веб-браузерах и веб-серверах, но он может быть использован для любого клиентского или серверного приложения. Протокол WebSocket — это независимый протокол, основанный на протоколе TCP. Он делает возможным более тесное взаимодействие между браузером и веб-сайтом, способствуя распространению интерактивного содержимого и созданию приложений реального времени.",
            "WebSocket is a computer communications protocol, providing full-duplex communication channels over a single TCP connection. The WebSocket protocol was standardized by the IETF as RFC 6455 in 2011, and the WebSocket API in Web IDL is being standardized by the W3C.\n" +
                    "\n" +
                    "WebSocket is a different protocol from HTTP. Both protocols are located at layer 7 in the OSI model and, as such, depend on TCP at layer 4. Although they are different, RFC 6455 states that WebSocket \"is designed to work over HTTP ports 80 and 443 as well as to support HTTP proxies and intermediaries\" thus making it compatible with the HTTP protocol. To achieve compatibility, the WebSocket handshake uses the HTTP Upgrade header[1] to change from the HTTP protocol to the WebSocket protocol.\n" +
                    "\n" +
                    "The WebSocket protocol enables interaction between a web browser (or other client application) and a web server with lower overheads, facilitating real-time data transfer from and to the server. This is made possible by providing a standardized way for the server to send content to the client without being first requested by the client, and allowing messages to be passed back and forth while keeping the connection open. In this way, a two-way ongoing conversation can take place between the client and the server. The communications are done over TCP port number 80 (or 443 in the case of TLS-encrypted connections), which is of benefit for those environments which block non-web Internet connections using a firewall. Similar two-way browser-server communications have been achieved in non-standardized ways using stopgap technologies such as Comet.\n" +
                    "\n" +
                    "Most browsers support the protocol, including Google Chrome, Microsoft Edge, Internet Explorer, Firefox, Safari and Opera.",
            "WebSocket",
            "WebSocket");


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
