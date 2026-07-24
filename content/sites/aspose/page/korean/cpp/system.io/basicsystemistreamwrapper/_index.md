---
title: "System::IO::BasicSystemIStreamWrapper 클래스"
linktitle: "BasicSystemIStreamWrapper"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSystemIStreamWrapper 클래스. C++에서 내부 버퍼로 BasicSystemIOStreamBuf를 사용한 std::istream와 유사한 래퍼를 나타냅니다."
type: docs
weight: 600
url: /ko/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


내부 버퍼로 [BasicSystemIOStreamBuf](../basicsystemiostreambuf/)를 사용한 std::istream와 유사한 래퍼를 나타냅니다.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | 포인터를 재설정하고 [swap()](./swap/)을 호출하기 위해 이동 생성자와 이동 대입 연산자에서 사용됩니다. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | 새 인스턴스를 [BasicSystemIStreamWrapper](./) 로 생성합니다. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | 복사 생성자. 삭제됨. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | 이동 생성자. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | 복사 할당 연산자. 삭제됨. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | 이동 할당 연산자. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | 같지 않을 경우 *this과 **right**를 교환하는 호출입니다. |
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
