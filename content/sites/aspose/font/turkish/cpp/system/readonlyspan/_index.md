---
title: "System::ReadOnlySpan sınıfı"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Font için C++"
description: "System::ReadOnlySpan sınıfı. C++'da Span sınıfı içinde kullanılmak üzere yönlendirme."
type: docs
weight: 5300
url: /tr/cpp/system/readonlyspan/
---
## ReadOnlySpan class


[Span](../span/) sınıfı içinde kullanılmak üzere yönlendirme.

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parametre | Açıklama |
| --- | --- |
| T | Span içindeki öğelerin türü. Bu sınıf, nesnelerin ardışık dizileriyle yalnızca okuma modunda çalışmak için tip-güvenli bir yol sağlar. Dizileri, yığın dizilerini veya ham işaretçileri, sınır kontrolünü koruyarak sarmak için kullanılabilir. [ReadOnlySpan](./) işaret ettiği belleği sahiplenmez - sadece mevcut belleğe bir görünüm sağlar. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Normal bir span'den yalnızca okuma span'i oluşturur. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Bir diziyi [ReadOnlySpan](./) biçimine dönüştürür. |
## Açıklamalar


Keyfi bir belleğin yalnızca okuma amaçlı ardışık bölgesini temsil eder.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
