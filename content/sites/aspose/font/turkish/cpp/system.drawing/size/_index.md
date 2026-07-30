---
title: "System::Drawing::Size sınıfı"
linktitle: "Size"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Size sınıfı. Bir görüntünün genişlik ve yükseklik değerlerini temsil eden bir çift tam sayı değerini temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu türün nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 2200
url: /tr/cpp/system.drawing/size/
---
## Size class


Bir görüntünün genişlik ve yükseklik değerlerini temsil eden bir çift tam sayı değerini temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](../../system/smartptr/) sınıfını asla kullanmayın.

```cpp
class Size
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Belirtilen [Size](./) nesnesinin toplamı olan yeni bir [Size](./) nesnesi döndürür; yani genişlik değeri belirtilen nesnelerin genişlik değerlerinin toplamına, yükseklik değeri ise belirtilen nesnelerin yükseklik değerlerinin toplamına eşittir. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerlerini bir üst tam sayıya yuvarlayarak bir [Size](./) nesnesi oluşturur. |
| [Equals](./equals/)(const Size\&) const | Mevcut nesne ile belirtilen nesnenin eşit olup olmadığını belirler; yani aynı genişlik ve yükseklik değer çiftini temsil edip etmediklerini. |
| [get_Height](./get_height/)() const | Mevcut nesne tarafından temsil edilen yüksekliğin değerini döndürür. |
| [get_IsEmpty](./get_isempty/)() const | Genişlik ve yüksekliğin her iki değerinin de 0'a eşit olup olmadığını belirler. |
| [get_Width](./get_width/)() const | Mevcut nesne tarafından temsil edilen genişliğin değerini döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [operator Point](./operatorpoint/)() const | Bir [Point](../point/) nesnesi örneği oluşturur ve X ve Y koordinatlarını sırasıyla mevcut nesnenin genişlik ve yükseklik değerleriyle başlatır. |
| [operator SizeF](./operatorsizef/)() const | Bir [SizeF](../sizef/) nesnesi örneği oluşturur ve onu mevcut [Size](./) nesnesinin genişlik ve yüksekliğinin değerleriyle başlatır. |
| static [Round](./round/)(const SizeF\&) | Belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerlerini en yakın tam sayıya yuvarlayarak bir [Size](./) nesnesi oluşturur. |
| [set_Height](./set_height/)(int) | Mevcut nesne tarafından temsil edilen yüksekliğin değerini ayarlar. |
| [set_Width](./set_width/)(int) | Mevcut nesne tarafından temsil edilen genişliğin değerini ayarlar. |
| [Size](./size/)() | Yeni bir [Size](./) nesnesi oluşturur ve genişlik ve yükseklik değerlerini 0 ile başlatır. |
| [Size](./size/)(const Point\&) | Yeni bir [Size](./) nesnesi oluşturur ve genişlik ve yükseklik değerlerini X ve Y koordinatlarının belirtilen noktasının değerleriyle sırasıyla başlatır. |
| [Size](./size/)(int, int) | Yeni bir [Size](./) nesnesi oluşturur ve onu belirtilen değerle başlatır. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Yeni bir [Size](./) nesnesi döndürür; bu nesne **size2**'nin **size1**'den çıkarılması sonucudur, yani genişlik değeri **size2's** genişlik değerinin **size1's** genişlik değerinden çıkarılmasıyla, yükseklik değeri ise **size2's** yüksekliğinin **size1's** yüksekliğinden çıkarılmasıyla elde edilir. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen genişlik ve yükseklik değerlerinin çiftinin dize temsilini döndürür. |
| static [Truncate](./truncate/)(const SizeF\&) | Belirtilen [SizeF](../sizef/) nesnesinin genişlik ve yükseklik değerlerini bir alt tam sayıya kırparak bir [Size](./) nesnesi oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Genişlik ve yükseklik değerleri 0 olan boş bir [Size](./) sınıf örneği. |
## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
