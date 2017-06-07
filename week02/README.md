# Week02
### Web architedcture에 대해서 알아보고 실습합니다.


## Apache Struts 2 vs. SpringMVC

Java 기반 오픈소스 Web MVC Framework

### Struts 2

웹에 특화된 프레임워크.

웹 브라우저(User)가 요청하면, 서블릿에서 해당 요청을 받으면 struts.xml 설정에 맞게 알맞은 Action으로 연결함.

이 과정에서 인터셉터에서 요청을 처리(보안,파일업로드 등) 후 Action에 넘긴다.

- In Struts 2 MVC components can be configured via struts.xml file
중앙집중식 처리방식

- Struts 2 action classes are simple POJO class
POJO(Plain Old Java Object)
상속, 구현, 오버로딩, 오버라이딩 아무것도 없음. 기초적인 자바 코드를 이용해서 클래스 구현하자는 약속. 정말 쉬움. 
그러나 하나하나 직접 설정해줘야 하는 단점 있음.

- Struts 2 provides the support for Ajax
새로고침 없는 데이터 전송 방식. 네이버 실시간 검색어 등 정보를 자동으로 받아와서 띄워주는 것들.

- It can be integrated with the Hibernate, Spring, Tiles, Velocities etc...
- Many different formats are support for result construction such as JSP, freemarker, Velocity etc...
- Many different types of tags are available for the JSP, such as UI tags, Data tags, control tags etc...
- Struts 2 provides support for themes are templates

- Struts는 2000년 등장. Struts2 = Webwork + Struts.
- 국내 시장 속에서 Struts와 Spring의 사용률은 3:7 정도. 전자정부 시스템이 Spring으로 되어있기 때문


### SpringMVC
웹 뿐만 아니라 자바 어플리케이션에도 특화된 프레임워크
bean의 생성/소멸 등 라이프사이클을 관리하는 컨테이너를 제공
xml 설정 뿐 아니라 자바 기반의 annotation을 활용하여 Java bean을 등록 가능

- using the DispatcherServlet and it supports configurable handler mappings, view resolution, locale, time zone and theme resolution, uploading the files
- @Controller and @RequestMapping annotations


### Diff.
- 디자인 측면

Struts 2 Actions are newly instantiated every time a request is made. 필요할 때 새로운 객체를 매번 생성한다.
DI (Dependency Injection, 의존성 주입).. 메모리 낭비를 줄이기 위한 것. 객체를 생성해서 쓰는 것이 아니라 빌려서 쓰는 것
객체 생성하기 위해선 new가 필요하고, MVC 패턴에선 처음에 컨트롤러 돌아가며 모든 프로퍼티 다 객체 생성해주고 그랬는데 사실 이런 식으로 하면 메모리 낭비 심함.

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

http://moondol2525.tistory.com/44
