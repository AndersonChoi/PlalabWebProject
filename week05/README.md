# Plalab Web Study

## Week 5. iBatis, MyBatis

### 1. 개념

#### 영속성 프레임워크 (Persistence Framework)

- 프로그램 데이터를 데이터베이스에 저장하는 일을 도와주고 자동화시켜주는 미들웨어
- 어플리케이션과 데이터베이스 사이의 추상적인 계층

#### ORM (Object Relational Mapping)

- 영속성 프레임워크의 한 종류
- 어플리케이션 도메인의 객체와 데이터베이스 데이터간의 매핑시켜주는 툴
- 예시 : Hibernate, MyBatis, Slick

#### MyBatis

- custom SQL, Stored Proceduer, advanced mappings을 지원하는 영속성 프레임워크
- 장점 : JDBC code를 거의 짤 필요가 없고, 파라미터를 수동으로 세팅할 필요가 없고, 쿼리 결과를 일일이 가져올 필요가 없다(retrieval of results). 간단한 XML or Annotations 세팅만 하면 된다.
- 튜토리얼 : http://www.mybatis.org/mybatis-3/ko/getting-started.html

### References
- https://en.wikipedia.org/wiki/Persistence_framework
- https://en.wikipedia.org/wiki/Object-relational_mapping
- http://www.mybatis.org/mybatis-3/
