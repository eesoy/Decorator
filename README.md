# Decorator

정의  

데코레이터 패턴에서는 객체에 추가적인 요건을 동적으로 첨가한다. 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공한다.


패턴 활용처 
	1. 다른 객체에 영향을 주기 않고, 특정 객체에게 동적으로 새로운 기능을 추가 또는 삭제하고자 할 때 특히 client 측에서 이렇게 새로운 기능이 추가된 객체와 그렇지 않은 객체를 따로 구분하고 싶지 않을 때
	2. 클래스 상속을 통한 기능 확장이 불가능하거나 어려울 때

장점 
	1. Decorator 패턴은 객체에 기능을 추가하고자 할 때 동적으로 중간중간 원하는 객체에게 기능을 추가하거나 삭제할 수 있다
	2. 동일한 기능을 반복하는 것이 간편해진다. 반복 수행하고 싶은 횟수만큼 객체를 생성한 후 이들을 하나의 연결고리로 연결하면 되기 때문이다.
	3. 처음부터 복잡하게 구조를 정의하는 것이 아니고, 간단한 클래스만을 정의해 두었다가 필요할 경우 새로운 클래스들을 조금씩 확장시켜나가는 방식이다.

단점
	1. Decorator 패턴을 적용시킬 경우 클래스 수는 줄지만 객체의 수는 많아질 수 있다. 또한 객체가 비슷비슷 하게 보여서 Decorator 패턴에 대해 잘 이해하지 못할 경우 디버깅하기가 쉽지 않다.

