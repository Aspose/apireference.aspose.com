---
title: "System::IO::BasicSystemIOStreamBuf 클래스"
linktitle: "BasicSystemIOStreamBuf"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSystemIOStreamBuf 클래스. System::IO::Stream와 유사한 스트림을 래핑하는 버퍼를 나타내며, 이를 C++에서 std::iostream과 유사한 스트림 내부 버퍼로 사용할 수 있게 합니다."
type: docs
weight: 400
url: /ko/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


[System::IO::Stream](../stream/)-와 유사한 스트림을 래핑하는 버퍼를 나타내며, 이를 std::iostream과 유사한 스트림 내부 버퍼로 사용할 수 있게 합니다.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | 포인터를 재설정하고 [swap()](./swap/)을 호출하기 위해 이동 생성자와 이동 대입 연산자에서 사용됩니다. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | [BasicSystemIOStreamBuf](./)의 새 인스턴스를 생성합니다. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | [BasicSystemIOStreamBuf](./)의 새 인스턴스를 생성합니다. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | 복사 생성자. 삭제됨. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | 이동 생성자. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | 복사 할당 연산자. 삭제됨. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | 이동 할당 연산자. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | 같지 않을 경우 *this과 right를 교환하는 호출입니다. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
