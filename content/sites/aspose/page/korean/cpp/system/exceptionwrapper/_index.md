---
title: "System::ExceptionWrapper 클래스"
linktitle: "ExceptionWrapper"
second_title: "C++용 Aspose.Page"
description: "System::ExceptionWrapper 클래스. C++에서 Exception 클래스를 상속받은 예외의 래퍼를 나타내는 템플릿입니다."
type: docs
weight: 2600
url: /ko/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


예외를 래핑하는 템플릿으로, [Exception](../exception/) 클래스로부터 파생됩니다.

```cpp
template<typename T>class ExceptionWrapper
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | [ExceptionWrapper](./) 클래스의 null 인스턴스를 생성하며, 이는 어떤 예외도 나타내지 않습니다. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | 전달된 포인터를 포함하는 [ExceptionWrapper](./) 클래스의 인스턴스를 생성합니다. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | 복사 생성자. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | 이동 생성자. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | [Exception](../exception/) 클래스 생성자에 매개변수를 전달하고 새로운 [Exception](../exception/) 클래스 인스턴스를 보유하는 스마트 포인터를 생성하는 생성자입니다. |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | [SharedPtr<Object>](../sharedptr/)에 대한 암시적 캐스트 연산자 |
| [operator->](./operator-_/)() const | [Exception](../exception/) 객체의 멤버에 접근할 수 있게 합니다. |
| [operator=](./operator=/)(const ExceptionWrapper\&) | 할당 연산자. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | 이동 할당 연산자. |
| static [Type](./type/)() | [Exception](../exception/) 타입에 대한 [System::TypeInfo](../typeinfo/) 객체를 얻는 바로 가기입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ExceptionType](./exceptiontype/) | 캐스팅 함수에 사용됩니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
