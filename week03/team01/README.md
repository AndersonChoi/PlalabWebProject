
Week 03 
Java Build Tools ( Ant, Maven, Gradle )


## Ant
![Image of Ant](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/ant.png)

### 특징
- 2000년 출시
- Make와 유사한 면이 많음
- 절차적 프로그래밍 방법에 기반함
- 네트워크를 통한 dependency 관리의 필요성 때문에 Apache Ivy를 도입함

### 장단점
- XML 사용. 명료하며 가독성이 좋음
- Ant가 사용하는 절차적 프로그래밍 방법에 계층적 구조의 성향을 띤 XML은 적합하지 않음
- Ant를 작은 프로젝트에 사용하더라도, XML이 관리하기 어렵게 사이즈가 큰 단점이 있음

### 코드예시
build.xml 
- JAR 파일을 Compile 한다. dependency 결정을 위해 Ivy를 사용하며, clean, compile 후 JAR 파일을 생성함.
```
<project xmlns:ivy="antlib:org.apache.ivy.ant" name="java-build-tools" default="jar">
 
    <property name="src.dir" value="src"/>
    <property name="build.dir" value="build"/>
    <property name="classes.dir" value="${build.dir}/classes"/>
    <property name="jar.dir" value="${build.dir}/jar"/>
    <property name="lib.dir" value="lib" />
    <path id="lib.path.id">
        <fileset dir="${lib.dir}" />
    </path>
 
    <target name="resolve">
        <ivy:retrieve />
    </target>
 
    <target name="clean">
        <delete dir="${build.dir}"/>
    </target>
 
    <target name="compile" depends="resolve">
        <mkdir dir="${classes.dir}"/>
        <javac srcdir="${src.dir}" destdir="${classes.dir}" classpathref="lib.path.id"/>
    </target>
 
    <target name="jar" depends="compile">
        <mkdir dir="${jar.dir}"/>
        <jar destfile="${jar.dir}/${ant.project.name}.jar" basedir="${classes.dir}"/>
    </target>
 
</project>
```
- Ant 작업(위의 코드)을 수행
```
ant jar
```


## Maven
![Image of Maven](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/maven.jpg)

### 특징
- 2004년 출시
- Ant 사용 시 생기는 문제점을 개선하기 위해 나옴.
- Ant 처럼 XML을 사용하지만 구조상 차이가 있음. Ant의 경우 특정 작업의 실행을 위해 개발자들이 모든 명령어를 작성해야 하지만, Maven은 규약에 따르며 사용가능한 작업 목표들을 제공함
- 네트워크를 통해 dependency들을 다운로드할 수 있음

### 장단점
- life-cycle 관리를 쉽게 할 수 있다는 장점이 있음
- 버전이 다른 라이브러리들 사이의 충돌 문제를 잘 해결하지 못하는 단점 존재
- XML 작성 규칙이 매우 엄격함
- build script를 복잡하게 작성하거나 커스터마이징하는 것이 Ant 보다 어려움
- XML 크기가 매우 커질 수 있음

### 코드예시
pom.xml
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
    http://maven.apache.org/maven-v4_0_0.xsd">
 
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.technologyconversations</groupId>
    <artifactId>java-build-tools</artifactId>
    <packaging>jar</packaging>
    <version>1.0</version>
 
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
        </dependency>
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-all</artifactId>
            <version>1.3</version>
        </dependency>
    </dependencies>
 
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.3.2</version>
            </plugin>
        </plugins>
    </build>
 
</project>
```
- Maven 작업(위의 코드)을 수행
```
mvn package
```
- Maven은 Ant와 달리 어떤 작업을 수행해야 할지 명시할 필요가 없다. Parameter들(어떤 Dependency 또는 plugin을 사용하는지...)만 셋팅해주면 된다.


## Gradle
![Image of Gradle](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week03/team01/gradle.png)

### 특징
- 2012년 출시
- Google은 Android OS의 기본 build tool로 Gradle을 사용
- XML을 사용하지 않음. Groovy(JVM 언어의 한 종류)에 기반한 자체 DSL을 사용. 따라서 Ant/Maven 보다 build script가 더 간결해짐.

### 장단점
- Ant의 flexibility라는 장점 + Maven의 life-cycle 관리 및 사용의 용이성이라는 장점을 동시에 갖춤
- Gradle은 Maven보다 더 간결하며 이해하기 쉬움
- Gradle은 다양한 작업들을 제공함 ( 'gradle tasks -all' 을 통해 제공하는 작업 리스트 확인 가능 )

### 코드예시
build.gradle
```
apply plugin: 'java'
apply plugin: 'checkstyle'
apply plugin: 'findbugs'
apply plugin: 'pmd'
 
version = '1.0'
 
repositories {
    mavenCentral()
}
 
dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.11'
    testCompile group: 'org.hamcrest', name: 'hamcrest-all', version: '1.3'
}
```

## References
- https://technologyconversations.com/2014/06/18/build-tools/
