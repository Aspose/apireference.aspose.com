---
title: "System::IO::BasicSystemOStreamWrapper sınıfı"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSystemOStreamWrapper sınıfı. C++'ta iç tampon olarak BasicSystemIOStreamBuf kullanan std::ostream-benzeri bir sarmalayıcıyı temsil eder."
type: docs
weight: 700
url: /tr/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


İç tampon olarak [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) kullanan std::ostream-benzeri bir sarmalayıcıyı temsil eder.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | İşaretçileri sıfırlamak ve [swap()](./swap/) çağırmak için taşıma yapıcı ve taşıma atama operatöründe kullanılır. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Yeni bir [BasicSystemOStreamWrapper](./) örneği oluşturur. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Kopya yapıcı. Silindi. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Kopya atama operatörü. Silindi. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Taşıma atama operatörü. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Eşit değillerse *this ve **right** öğelerini takas etme çağrısı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
