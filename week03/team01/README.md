
Week 03 
Java Build Tools ( Ant, Maven, Gradle )


## Ant
![Image of Ant](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/ant.png)

#### 특징
- 2000년 출시
- Make와 유사한 면이 많음
- 절차적 프로그래밍 방법에 기반함
- 네트워크를 통한 dependency 관리의 필요성 때문에 Apache Ivy를 도입함

#### 장단점
- XML 사용. Ant가 사용하는 절차적 프로그래밍 방법에 계층적 구조의 성향을 띤 XML은 적합하지 않음
- Ant를 작은 프로젝트에 사용하더라도, XML이 관리하기 어렵게 사이즈가 큰 단점이 있음

#### 코드예시
```
hello
```



## Maven
![Image of Maven](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/maven.jpg)

#### 특징
- 2004년 출시
- Ant 사용 시 생기는 문제점을 개선하기 위해 나옴.
- Ant 처럼 XML을 사용하지만 구조상 차이가 있음. Ant의 경우 특정 작업의 실행을 위해 개발자들이 모든 명령어를 작성해야 하지만, Maven은 규약에 따르며 사용가능한 작업 목표들을 제공함
- 네트워크를 통해 dependency들을 다운로드할 수 있음

#### 장단점
- life-cycle 관리를 쉽게 할 수 있다는 장점이 있음
- 버전이 다른 라이브러리들 사이의 충돌 문제를 잘 해결하지 못하는 단점 존재
- XML 작성 규칙이 매우 엄격함
- build script를 복잡하게 작성하거나 커스터마이징하는 것이 Ant 보다 어려움
- XML 크기가 매우 커질 수 있음

#### 코드예시
```
```


## Gradle
![Image of Gradle](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/gradle.png)

#### 특징
- 2012년 출시
- XML을 사용하지 않음. Groovy(JVM 언어의 한 종류)에 기반한 자체 DSL을 사용. 따라서 Ant/Maven 보다 build script가 더 간결해짐.


#### 장단점
- 
- 

#### 코드예시
```
```


## References
- https://technologyconversations.com/2014/06/18/build-tools/
