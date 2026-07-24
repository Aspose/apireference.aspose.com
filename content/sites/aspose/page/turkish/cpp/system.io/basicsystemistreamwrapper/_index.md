---
title: "System::IO::BasicSystemIStreamWrapper sınıfı"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Page için C++"
description: "System::IO::BasicSystemIStreamWrapper sınıfı. C++'ta iç tampon olarak BasicSystemIOStreamBuf kullanan std::istream benzeri bir sarmalayıcı temsil eder."
type: docs
weight: 600
url: /tr/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


İç tampon olarak [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) kullanan std::istream benzeri bir sarmalayıcı temsil eder.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | İşaretçileri sıfırlamak ve [swap()](./swap/) çağırmak için taşıma yapıcı ve taşıma atama operatöründe kullanılır. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemIStreamWrapper](./) sınıfının yeni bir örneğini oluşturur. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Kopya yapıcı. Silinmiş. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Kopya atama operatörü. Silinmiş. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Taşıma atama operatörü. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Eşit değilse *this* ve **right** öğelerini takas etme çağrısı. |
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
