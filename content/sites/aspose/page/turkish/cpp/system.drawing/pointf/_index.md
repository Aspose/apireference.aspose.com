---
title: "System::Drawing::PointF sınıfı"
linktitle: "PointF"
second_title: "Aspose.Page için C++"
description: "System::Drawing::PointF sınıfı. 2 boyutlu bir düzlemde bir noktanın tek duyarlıklı kayan nokta X ve Y koordinat çiftini temsil eder. Bu tür yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tür nesneleri yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 1800
url: /tr/cpp/system.drawing/pointf/
---
## PointF class


2 boyutlu bir düzlemde bir noktanın tek duyarlıklı kayan nokta X ve Y koordinat çiftini temsil eder. Bu tür yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tür nesneleri yönetmek için [System::SmartPtr](../../system/smartptr/) sınıfını asla kullanmayın.

```cpp
class PointF
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | Belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerlerini, belirtilen [PointF](./) nesnesinin X ve Y koordinat değerlerine sırasıyla ekler. |
| static [Add](./add/)(const PointF\&, const Size\&) | Belirtilen [Size](../size/) nesnesinin genişlik ve yükseklik değerlerini, belirtilen [PointF](./) nesnesinin X ve Y koordinat değerlerine sırasıyla ekler. |
| [Equals](./equals/)(const PointF\&) const | Geçerli nesne ile belirtilen nesnenin eşit olup olmadığını belirler, yani aynı X ve Y koordinat değerleri çiftini temsil edip etmediklerini. |
| [get_IsEmpty](./get_isempty/)() const | Hem X hem de Y koordinat değerlerinin 0'a eşit olup olmadığını belirler. |
| [get_X](./get_x/)() const | Geçerli nesne tarafından temsil edilen X koordinatının değerini döndürür. |
| [get_Y](./get_y/)() const | Geçerli nesne tarafından temsil edilen Y koordinatının değerini döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir hash kodu döndürür. |
| [IsNull](./isnull/)() const | Her zaman false döndürür. |
| explicit [operator bool](./operatorbool/)() | Her zaman true döndürür. |
| [PointF](./pointf/)() | Yeni bir [PointF](./) nesnesi oluşturur ve X ve Y koordinat değerlerini 0 ile başlatır. |
| [PointF](./pointf/)(float, float) | Yeni bir [PointF](./) nesnesi oluşturur ve belirtilen değerlerle başlatır. |
| [PointF](./pointf/)(const SizeF\&) | Yeni bir [PointF](./) nesnesi oluşturur ve X ve Y koordinat değerlerini, belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerleriyle sırasıyla başlatır. |
| [set_X](./set_x/)(float) | Geçerli nesne tarafından temsil edilen X koordinatının değerini ayarlar. |
| [set_Y](./set_y/)(float) | Geçerli nesne tarafından temsil edilen Y koordinatının değerini ayarlar. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | Belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerlerini, belirtilen [PointF](./) nesnesinin X ve Y koordinat değerlerinden sırasıyla çıkarır. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | Belirtilen [Size](../size/) nesnesinin genişlik ve yükseklik değerlerini, belirtilen [PointF](./) nesnesinin X ve Y koordinat değerlerinden sırasıyla çıkarır. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen X ve Y koordinat çiftinin dize temsilini döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | X ve Y koordinat değerleri 0 olan boş bir [PointF](./) sınıf örneği. |
## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
