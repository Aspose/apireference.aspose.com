---
title: "System::Delegate< ReturnType(ArgumentTypes...)> 클래스"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "C++용 Aspose.Page"
description: "System::Delegate< ReturnType(ArgumentTypes...)> 클래스. 함수, 메서드 또는 함수 객체에 대한 포인터를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 레퍼런스로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 사용하지 마십시오."
type: docs
weight: 2100
url: /ko/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


함수, 메서드 또는 함수 객체에 대한 포인터를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 레퍼런스로 함수에 전달해야 합니다. [System::SmartPtr](../smartptr/) 클래스를 사용하여 이 유형의 객체를 관리하지 마십시오.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| 매개변수 | 설명 |
| --- | --- |
| ReturnType | 클래스가 나타내는 함수, 메서드 또는 함수 객체 포인터의 반환 유형 |
| ArgumentTypes | 클래스가 나타내는 함수, 메서드 또는 함수 객체 포인터의 인수 목록 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Delegate](./delegate/)() | 기본 생성자. 아무 것도 가리키지 않는 delegate 객체를 생성합니다. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | 이동 복사 생성자. 지정된 delegate가 가리키는 엔티티의 소유권을 가져옵니다. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | 생성자. 지정된 자유 함수 또는 정적 메서드 포인터로부터 delegate 객체를 생성합니다. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | 생성자. std::bind()에 의해 생성된 함수 객체 포인터로부터 delegate를 생성합니다. |
| [Delegate](./delegate/)(int, T\&) | 생성자. 지정된 함수 객체로부터 delegate를 생성합니다. |
| [Delegate](./delegate/)(long, T\&&) | 이동 생성자. 지정된 함수 객체로부터 delegate를 생성합니다. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | 생성자. 지정된 객체의 지정된 비정적 메서드를 가리키는 delegate를 생성합니다. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | 생성자. 지정된 객체의 지정된 비정적 메서드를 가리키는 delegate를 생성합니다. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | std::function 함수 객체를 가리키는 delegate 객체를 생성합니다. |
| [Empty](./empty/)() const | 현재 delegate 객체가 비어 있는지 확인합니다(예: 어떤 엔티티도 가리키지 않음). |
| [operator()](./operator()/)(ArgumentTypes...) const | 현재 delegate 객체가 가리키는 함수, 메서드 또는 함수 객체를 호출합니다. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | 이동 할당 연산자. 지정된 delegate가 가리키는 엔티티의 소유권을 가져옵니다. |
| [operator==](./operator==/)(const Delegate\&) const | 두 delegate 객체를 비교하여 같은 엔티티를 가리키는지 확인합니다. |
## 비고



```cpp
#include "system/delegate.h"
#include <iostream>

// delegate를 선언합니다.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // PrintMessage 함수의 주소를 변수에 할당합니다.
  Message mes = Message(&PrintMessage);

  // 함수를 호출합니다.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
