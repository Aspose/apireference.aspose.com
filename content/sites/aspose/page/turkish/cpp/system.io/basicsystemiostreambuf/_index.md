---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page için C++"
description: "System::IO::BasicSystemIOStreamBuf class. C++'da System::IO::Stream benzeri akışları saran bir tamponu temsil eder ve bunların bir std::iostream benzeri akışın dahili tamponu olarak kullanılmasına izin verir."
type: docs
weight: 400
url: /tr/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Bir tamponu temsil eder; bu tampon [System::IO::Stream](../stream/)-benzeri akışları sarar ve bunların bir std::iostream-benzeri akışın dahili tamponu olarak kullanılmasına izin verir.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | İşaretçileri sıfırlamak ve [swap()](./swap/) çağırmak için taşıma yapıcı ve taşıma atama operatöründe kullanılır. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | [BasicSystemIOStreamBuf](./) yeni bir örnek oluşturur. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | [BasicSystemIOStreamBuf](./) yeni bir örnek oluşturur. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Kopya yapıcı. Silinmiş. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Kopya atama operatörü. Silinmiş. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Taşıma atama operatörü. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Eşit değilse *this* ve right öğelerini takas etme çağrısı. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
