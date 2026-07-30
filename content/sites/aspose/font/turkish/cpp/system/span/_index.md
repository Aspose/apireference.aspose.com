---
title: "System::Span class"
linktitle: "Span"
second_title: "Aspose.Font için C++"
description: "System::Span class. C++'daki C++20'nin std::span'ına benzer, rastgele belleğin ardışık bir bölgesini temsil eder."
type: docs
weight: 5700
url: /tr/cpp/system/span/
---
## Span class


C++20'nin std::span'ına benzer, keyfi bir belleğin bitişik bir bölgesini temsil eder.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parametre | Açıklama |
| --- | --- |
| T | Span içindeki öğelerin türü. Bu sınıf, nesnelerin ardışık dizileriyle tip güvenli bir şekilde çalışmayı sağlar. Dizileri, yığın dizilerini veya ham göstericileri, sınır kontrolünü koruyarak sarmak için kullanılabilir. [Span](./) işaret ettiği belleği sahiplenmez - sadece mevcut belleğe bir görünüm sağlar. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() const | Span içindeki tüm öğeleri varsayılan değere ayarlayarak içeriğini temizler. |
| [Fill](./fill/)(const T\&) const | Span'i belirtilen değerle doldurur. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Bir diziyi bir [Span](./) nesnesine dönüştürür. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
