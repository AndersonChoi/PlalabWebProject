# Week02
### Web architedcture에 대해서 알아보고 실습합니다.


## Apache Struts 2 vs. SpringMVC

Java 기반 오픈소스 Web MVC Framework

### Struts 2
- In Struts 2 MVC components can be configured via struts.xml file
- Struts 2 action classes are simple POJO class
- Struts 2 provides the support for Ajax
- It can be integrated with the Hibernate, Spring, Tiles, Velocities etc...
- Many different formats are support for result construction such as JSP, freemarker, Velocity etc...
- Many different types of tags are available for the JSP, such as UI tags, Data tags, control tags etc...
- Struts 2 provides support for themes are templates

### SpringMVC
- using the DispatcherServlet and it supports configurable handler mappings, view resolution, locale, time zone and theme resolution, uploading the files
- @Controller and @RequestMapping annotations

### Diff.
- 디자인 측면

Struts 2 Actions are newly instantiated every time a request is made. 필요할 때 새로운 객체를 매번 생성한다.

Spring MVC the default behavior is to act as a Singleton (=Controllers are created once and held in memory/shared across all requests) 객체를 한번만 생성한다.

- 요청 파라미터 핸들링

struts는 다양한 커스텀태그(Struts specific tags)를 제공함. request parameters가 Action Form fields에 제대로 바인드 되어 있는지 확인하며, show binding/validation errors.

Spring MVC에서는 one simple bind tag가 모두 핸들함. 따라서 struts에서의 JSP는 더 짧아지고 더 pure 한 HTML content를 담고 있을 것임

- 구현 및 검증

Struts는 validate method of an Action Form. clearly hints another form or tools during its validation

Spring MVC에서는 validators는 NOT dependent on the Servlet API인 business objects이다. validators to be reused in your business logic



## References
https://www.slideshare.net/Intertech/spring-mvc-training
http://www.devmanuals.com/tutorials/java/struts/Struts-2-Vs-Spring-MVC.html
