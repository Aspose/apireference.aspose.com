---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::PixelFormat enum. C++'da bir pikselin renk veri biçimini belirtir."
type: docs
weight: 2600
url: /tr/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Bir pikselin renk veri biçimini belirtir.

```cpp
enum class PixelFormat
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Indexed | 65536 | Piksel verisinin renk indeksli değerler içerdiğini, yani sistem renk tablosundaki renklere bir indeks olduğunu belirtir. |
| Gdi | 131072 | Piksel verisinin GDI renkleri içerdiğini belirtir. |
| Alpha | 262144 | Piksel verisinin önceden çarpılmamış alfa değerleri içerdiğini belirtir. |
| PAlpha | 524288 | Piksel verisinin önceden çarpılmış alfa değerleri içerdiğini belirtir. |
| Genişletilmiş | 1048576 | Ayrılmış. |
| Kanonik | 2097152 | Piksel başına 32 bit, 24 bit renk derinliği ve 8 bit alfa kanalı olan piksel formatını belirtir. |
| Tanımsız | 0 | Piksel formatının tanımsız olduğunu belirtir. |
| DontCare | 0 | Piksel formatı belirtilmemiştir. |
| Format1bppIndexed | n/a | Piksel formatının piksel başına 1 bit indeksli renk olduğunu belirtir. |
| Format4bppIndexed | n/a | Piksel formatının piksel başına 4 bit indeksli renk olduğunu belirtir. |
| Format8bppIndexed | n/a | Piksel formatının piksel başına 8 bit indeksli renk olduğunu belirtir. |
| Format16bppGrayScale | n/a | Piksel formatının piksel başına 16 bit olduğunu belirtir. Renk bilgisi 65536 gri tonunu belirtir. |
| Format16bppRgb555 | n/a | Piksel formatının piksel başına 16 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her birinin 5 bit ve kalan bitin kullanılmadığını belirtir. |
| Format16bppRgb565 | n/a | Piksel formatının piksel başına 16 bit olduğunu, kırmızı bileşen için 5 bit, yeşil için 6 bit ve mavi için 5 bit olduğunu belirtir. |
| Format16bppArgb1555 | n/a | Piksel formatının piksel başına 16 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her birinin 5 bit ve alfa için 1 bit olduğunu belirtir. |
| Format24bppRgb | n/a | Piksel formatının piksel başına 24 bit olduğunu ve kırmızı, yeşil ve mavi bileşenlerin her biri için 8 bit olduğunu belirtir. |
| Format32bppRgb | n/a | Piksel formatının piksel başına 32 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 8 bit ve kalan 8 bitin kullanılmadığını belirtir. |
| Format32bppArgb | n/a | Piksel formatının piksel başına 32 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 8 bit ve alfa için 8 bit olduğunu belirtir. |
| Format32bppPArgb | n/a | Piksel formatının piksel başına 32 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 8 bit ve alfa için 8 bit olduğunu belirtir. Kırmızı, yeşil ve mavi bileşenler, alfa bileşeninin değerine göre önceden çarpılmıştır. |
| Format48bppRgb | n/a | Piksel formatının piksel başına 48 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 16 bit olduğunu belirtir. |
| Format64bppArgb | n/a | Piksel formatının piksel başına 64 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 16 bit ve alfa için 16 bit olduğunu belirtir. |
| Format64bppPArgb | n/a | Piksel formatının piksel başına 64 bit olduğunu, kırmızı, yeşil ve mavi bileşenlerin her biri için 16 bit ve alfa için 16 bit olduğunu belirtir. Kırmızı, yeşil ve mavi bileşenler, alfa bileşeninin değerine göre önceden çarpılmıştır. |
| Format32bppCMYK | n/a | Piksel formatının piksel başına 32 bit olduğunu, camgöbeği, macenta, sarı ve anahtar (key) bileşenlerin her biri için 8 bit olduğunu belirtir. |
| Max | 16 | Bu enum'un maksimum değeri. |

## Ayrıca Bakınız

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
