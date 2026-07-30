---
title: "System::IO::BasicSystemIStreamWrapper sınıfı"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSystemIStreamWrapper sınıfı. C++'ta dahili tampon olarak BasicSystemIOStreamBuf kullanan bir std::istream benzeri sarmalayıcıyı temsil eder."
type: docs
weight: 600
url: /tr/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Bir std::istream benzeri sarmalayıcıyı temsil eder ve dahili tampon olarak [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) kullanır.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | İşaretçileri sıfırlamak ve [swap()](./swap/) çağırmak için taşıma yapıcı ve taşıma atama operatöründe kullanılır. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Yeni bir [BasicSystemIStreamWrapper](./) örneği oluşturur. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Kopya yapıcı. Silindi. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Kopya atama operatörü. Silindi. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Taşıma atama operatörü. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Eşit değillerse *this ve **right** öğelerini takas etme çağrısı. |
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
