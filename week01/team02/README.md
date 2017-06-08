# Web study


## Week 1. Web Architectures


![Image of MVC-MVP-MVVM](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week01/team02/img/mvc-mvp-mvvm.png)


### 1. MVVM

- Model-View-**ViewModel**
- 제안 : John Gossman, Microsoft, 2005 : WPF, Silverlight
- 사용자 입력은 뷰에서 받음
- 각 뷰는 뷰모델의 레퍼런스를 가짐. 따라서 뷰모델은 뷰에 대해 알지 못함
- 뷰와 모델은 서로에 대해 알지 못함. 뷰모델이 모델로부터 데이터를 가져와서 뷰에게 제공함.
- 장점 : **커맨드**와 **데이터바인딩**으로 뷰와 뷰모델 간의 의존성 제거 <span style="color:red">=> 뷰모델은 뷰를 추상화 한 것이기 때문에 플랫폼 독립적이고 다양한 플랫폼에서 재사용될 수 있음. 뷰모델 인스턴스는 언제든지 즉시 생성될 수 있기 때문에 테스트케이스를 통해 요구사항을 이른 시점에 검증할 수 있으며 테스트 주도 개발(TDD) 도입도 쉽다.</span>
    - <span style="color:red">커맨드 : 모델의 행위를 실행</span>
    - <span style="color:red">데이터바인딩 : 추상화된 뷰와 물리적인 뷰를 연결해 줄 수단. 뷰와 뷰모델의 상태를 동기화해 줄 구성요소. 데이터 바인딩으로 인해 뷰모델의 상태가 변경되면 뷰의 상태가 함께 변경됨, 그리고 그 역이 보장됨</span>
- 뷰모델은 여러가지 뷰를 제공하는 일반적인 객체가 아니라, 각 뷰에 맞춰서 만들어진 것임. 따라서 뷰는 뷰모델에 대해서만 알고 있으면 되고 그 외의 아키텍처에 대해서는 신경쓰지 않아도 됨
- 단점
    - <span style="color:red">MVVM 패턴은 Microsoft UI 기술의 풍부한 지원이 있었기에 만들어질 수 있었음. 반대로 생각해보면 **비 Microsoft 기술에서 MVVM 패턴을 구현하기 위해서는 프로그래머들이 직접 준비해야할 것들이 많음**</span>
    - <span style="color:red">간단한 UI만 필요한 경우 overspec</span>
    - <span style="color:red">반대로 너무 복잡한 UI가 필요하면 뷰모델이 매우 복잡해짐</span>
    - <span style="color:red">데이터 바인딩이 복잡해지면 디버깅이 어려워짐</span>


![](https://github.com/AndersonChoi/PlalabWebProject/blob/master/week01/team02/img/MVVM_class_interaction.gif)



### 2. MVC

- Model-View-**Controller**
- 사용자 입력은 컨트롤러에서 받음
- 하나의 컨트롤러는 명령(operation)에 따라 여러 뷰를 렌더링 할 수 있음
- 뷰는 컨트롤러에 대해 알지 못함
- 컨트롤러는 모델과 상호작용하고, 모델을 뷰로 넘김. 따라서 모델과 뷰는 서로를 인지함
- 단점 (vs MVP, MVVM) : 뷰는 모델을 이용하기 때문에 서로간의 의존성을 완벽히 피할 수 없음


#### 뷰가 업데이트되는 방식

컨트롤러는 뷰를 선택만하고 업데이트를 시켜주지 않기 때문에, 뷰는 모델을 이용하여 업데이트 하게 됨

1. 모델이 뷰에게 Notify 해주는 방법
2. 뷰에서 Polling을 통해 모델의 변화를 알아채는 방법
3. 기타 등등


### 3. MVP

- Model-View-**Presenter**
- 사용자 입력은 프레젠터에서 받음
- 각 뷰와 프레젠터는 1:1 대응 관계이며, 서로의 레퍼런스를 가짐
- 뷰와 모델은 서로에 대해 알지 못함. 프레젠터는 모델의 레퍼런스를 갖기 때문에 뷰와 모델 사이에서 다리와 같은 역할을 함
- 장점 (vs MVC) : 뷰와 모델의 완전한 분리
- 단점 (vs MVC, MVVM) : 뷰와 프레젠터가 1:1 대응 관계로써 의존성이 매우 강함


#### 정리 필요

- MVC에서 컨트롤러가 프레젠터로 교체된 형태
- 뷰와 프레젠터는 같은 레벨에 있음
- 프레젠터는 뷰와 모델의 이벤트를 모두 받으면서 둘 사이의 상호작용을 조정함


### 기타

1. WPF란? : (Microsoft) Windows Presentation Foundation. 이를 이용해 시각적으로 뛰어난 사용자 환경의 Windows용 데스크톱 클라이언트 응용 프로그램을 만들 수 있음


### References

- https://blog.outsider.ne.kr/672
- https://tomyrhymond.wordpress.com/2011/09/16/mvc-mvp-and-mvvm/
- https://www.tutorialspoint.com/mvvm/mvvm_first_application.htm
- https://justhackem.wordpress.com/2017/03/05/mvvm-architectural-pattern/