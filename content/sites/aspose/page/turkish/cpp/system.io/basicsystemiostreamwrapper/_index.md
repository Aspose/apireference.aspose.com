---
title: "System::IO::BasicSystemIOStreamWrapper sınıfı"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page için C++"
description: "System::IO::BasicSystemIOStreamWrapper sınıfı. C++'ta iç tampon olarak BasicSystemIOStreamBuf kullanan bir std::iostream benzeri sarmalayıcıyı temsil eder."
type: docs
weight: 500
url: /tr/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


İç tampon olarak [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) kullanan bir std::iostream benzeri sarmalayıcıyı temsil eder.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | İşaretçileri sıfırlamak ve [swap()](./swap/) çağırmak için taşıma yapıcı ve taşıma atama operatöründe kullanılır. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemIOStreamWrapper](./) yeni bir örnek oluşturur. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Kopya yapıcı. Silinmiş. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Kopya atama operatörü. Silinmiş. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Taşıma atama operatörü. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Eşit değilse *this* ve **right** öğelerini takas etme çağrısı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
