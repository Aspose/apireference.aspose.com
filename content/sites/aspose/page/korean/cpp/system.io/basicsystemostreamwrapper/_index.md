---
title: "System::IO::BasicSystemOStreamWrapper 클래스"
linktitle: "BasicSystemOStreamWrapper"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSystemOStreamWrapper 클래스. C++에서 내부 버퍼로 BasicSystemIOStreamBuf를 사용한 std::ostream 유사 래퍼를 나타냅니다."
type: docs
weight: 700
url: /ko/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


내부 버퍼로 [BasicSystemIOStreamBuf](../basicsystemiostreambuf/)를 사용한 std::ostream 유사 래퍼를 나타냅니다.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | 포인터를 재설정하고 [swap()](./swap/)을 호출하기 위해 이동 생성자와 이동 대입 연산자에서 사용됩니다. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemOStreamWrapper](./)의 새 인스턴스를 생성합니다. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | 복사 생성자. 삭제됨. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | 이동 생성자. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | 복사 할당 연산자. 삭제됨. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | 이동 할당 연산자. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | 같지 않을 경우 *this과 **right**를 교환하는 호출입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
