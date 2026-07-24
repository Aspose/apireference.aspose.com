---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> 클래스"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "C++용 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> 클래스. 대리자 컬렉션을 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 4500
url: /ko/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


대리자 컬렉션을 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| 매개변수 | 설명 |
| --- | --- |
| ReturnType | 컬렉션 내 각 대리자가 가리키는 호출 가능한 엔터티의 반환 타입 |
| ArgumentTypes | 컬렉션 내 각 대리자가 가리키는 호출 가능한 엔터티의 인수 목록 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | 구현되지 않음. |
| [connect](./connect/)(Callback) | 지정된 대리자를 컬렉션에 추가합니다. |
| [connect](./connect/)(std::function\<R(Args...)>) | 지정된 함수 객체를 대리자 컬렉션에 추가합니다. 함수 객체는 컬렉션에 추가되기 전에 [Callback](./callback/) 대리자 타입으로 변환됩니다. |
| [connect](./connect/)(MulticastDelegate\&) | 지정된 MulticastDelegate 객체를 대리자 컬렉션에 추가합니다. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | 지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에 추가합니다. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에 추가합니다. |
| [disconnect](./disconnect/)(Callback) | 지정된 대리자를 대리자 컬렉션에서 제거합니다. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | 지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에서 제거합니다. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에서 제거합니다. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | 지정된 MulticastDelegate 객체를 대리자 컬렉션에서 제거합니다. |
| [disconnect_all_slots](./disconnect_all_slots/)() | 대리자 컬렉션에서 모든 대리자를 제거합니다. |
| [empty](./empty/)() const | 대리자 컬렉션이 비어 있는지 확인합니다. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | 구현되지 않음. |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | 현재 대리자 컬렉션에 존재하는 모든 대리자를 호출합니다. 대리자는 컬렉션에 추가된 순서대로 호출됩니다. 메서드는 대리자가 실행되는 동안 차단됩니다. |
| [IsNull](./isnull/)() const | 대리자 컬렉션이 비어 있는지 확인합니다. |
| [MulticastDelegate](./multicastdelegate/)() | 빈 컬렉션을 생성합니다. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | 기본 생성자와 동일합니다. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | 대리자 컬렉션의 얕은 복사를 수행합니다. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | 이동 생성자. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | 인스턴스를 생성하고 지정된 대리자를 대리자 컬렉션에 추가합니다. |
| [MulticastDelegate](./multicastdelegate/)(T) | 인스턴스를 생성하고 지정된 값을 대리자 컬렉션에 추가합니다. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | 인스턴스를 생성하고 지정된 값을 대리자 컬렉션에 추가합니다. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | 대리자 컬렉션이 비어 있지 않은지 확인합니다. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | 두 개의 MulticastDelegate 인스턴스(현재 객체와 지정된 객체)가 서로 같지 않은지 확인합니다. |
| [operator()](./operator()/)(ArgumentTypes...) const | 현재 대리자 컬렉션에 존재하는 모든 대리자를 호출합니다. 대리자는 컬렉션에 추가된 순서대로 호출됩니다. 연산자는 대리자가 실행되는 동안 차단됩니다. |
| [operator+=](./operator+=/)(Callback) | 지정된 대리자를 컬렉션에 추가합니다. |
| [operator-=](./operator-=/)(Callback) | 지정된 대리자를 대리자 컬렉션에서 제거합니다. |
| [operator=](./operator=/)(const MulticastDelegate\&) | 지정된 객체가 나타내는 대리자 컬렉션을 현재 객체에 할당합니다. 그 결과 두 객체는 동일한 대리자 컬렉션을 가리키게 됩니다. |
| [operator=](./operator=/)(MulticastDelegate\&&) | 이동 할당 연산자. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | 대리자 컬렉션이 비어 있는지 확인합니다. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | 두 개의 MulticastDelegate 인스턴스(현재 객체와 지정된 객체)가 같은지 확인합니다. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | 비어 있는(실제로 호출하지 않는) 포함된 콜백을 정리합니다. |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | MulticastDelegate 클래스 타입 정보를 나타내는 [TypeInfo](../typeinfo/) 객체에 대한 참조를 반환합니다. |
| [~MulticastDelegate](./~multicastdelegate/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Callback](./callback/) | MulticastDelegate 클래스가 나타내는 대리자의 유형입니다. |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
