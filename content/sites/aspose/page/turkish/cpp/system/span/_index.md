---
title: "System::Span sınıfı"
linktitle: "Span"
second_title: "Aspose.Page için C++"
description: "System::Span sınıfı. C++'ta C++20'nin std::span'ına benzer şekilde, rastgele belleğin kesintisiz bir bölgesini temsil eder."
type: docs
weight: 5700
url: /tr/cpp/system/span/
---
## Span class


C++20'nin std::span'ına benzer, keyfi bir belleğin kesintisiz bir bölgesini temsil eder.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | Açıklama |
| --- | --- |
| T | Span içindeki öğelerin türü. Bu sınıf, nesnelerin kesintisiz dizileriyle çalışmak için tür güvenli bir yol sağlar. Dizileri, yığıt dizilerini veya ham işaretçileri, sınır denetimini koruyarak sarmak için kullanılabilir. [Span](./) işaret ettiği belleği sahiplenmez - sadece mevcut belleğe bir görünüm sağlar. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() const | Tüm öğeleri varsayılan değere ayarlayarak span'in içeriğini temizler. |
| [Fill](./fill/)(const T\&) const | Span'i belirtilen değerle doldurur. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Bir diziyi bir [Span](./) nesnesine dönüştürür. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
