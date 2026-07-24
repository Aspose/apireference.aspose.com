---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::PixelFormat enum. Geeft het kleurgegevensformaat van een pixel aan in C++."
type: docs
weight: 2600
url: /nl/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Specificeert het kleurgegevensformaat van een pixel.

```cpp
enum class PixelFormat
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Indexed | 65536 | Geeft aan dat de pixelgegevens kleurgeïndexeerde waarden bevatten, wat betekent dat ze een index naar kleuren in de systeemtabel voor kleuren zijn. |
| Gdi | 131072 | Geeft aan dat de pixelgegevens GDI-kleuren bevatten. |
| Alpha | 262144 | Geeft aan dat de pixelgegevens alfa-waarden bevatten die niet voorvermenigvuldigd zijn. |
| PAlpha | 524288 | Geeft aan dat de pixelgegevens voorvermenigvuldigde alfa-waarden bevatten. |
| Uitgebreid | 1048576 | Gereserveerd. |
| Canoniek | 2097152 | Geeft het pixelformaat van 32 bits per pixel aan met een kleurdiepte van 24 bits en een 8-bit alfacanaal. |
| Ongedefinieerd | 0 | Geeft aan dat het pixelformaat ongedefinieerd is. |
| DontCare | 0 | Het pixelformaat is niet gespecificeerd. |
| Format1bppIndexed | n/a | Geeft aan dat het pixelformaat 1 bit per pixel geïndexeerde kleur is. |
| Format4bppIndexed | n/a | Geeft aan dat het pixelformaat 4 bits per pixel geïndexeerde kleur is. |
| Format8bppIndexed | n/a | Geeft aan dat het pixelformaat 8 bits per pixel geïndexeerde kleur is. |
| Format16bppGrayScale | n/a | Geeft aan dat het pixelformaat 16 bits per pixel is. De kleurinformatie specificeert 65536 grijstinten. |
| Format16bppRgb555 | n/a | Geeft aan dat het pixelformaat 16 bits per pixel is met 5 bits voor elk van de rode, groene en blauwe componenten en dat het resterende bit niet wordt gebruikt. |
| Format16bppRgb565 | n/a | Geeft aan dat het pixelformaat 16 bits per pixel is met 5 bits voor rood, 6 bits voor groen en 5 bits voor blauw. |
| Format16bppArgb1555 | n/a | Specificeert dat het pixelformaat 16 bits per pixel is met 5 bits voor elk van de rode, groene en blauwe componenten en 1 bit voor alfa. |
| Format24bppRgb | n/a | Specificeert dat het pixelformaat 24 bits per pixel is met 8 bits voor elk van de rode, groene en blauwe componenten. |
| Format32bppRgb | n/a | Specificeert dat het pixelformaat 32 bits per pixel is met 8 bits voor elk van de rode, groene en blauwe componenten en de resterende 8 bits niet worden gebruikt. |
| Format32bppArgb | n/a | Specificeert dat het pixelformaat 32 bits per pixel is met 8 bits voor elk van de rode, groene en blauwe componenten en 8 bits voor alfa. |
| Format32bppPArgb | n/a | Specificeert dat het pixelformaat 32 bits per pixel is met 8 bits voor elk van de rode, groene en blauwe componenten en 8 bits voor alfa. De rode, groene en blauwe componenten worden vooraf vermenigvuldigd volgens de waarde van de alfacomponent. |
| Format48bppRgb | n/a | Specificeert dat het pixelformaat 48 bits per pixel is met 16 bits voor elk van de rode, groene en blauwe componenten. |
| Format64bppArgb | n/a | Specificeert dat het pixelformaat 64 bits per pixel is met 16 bits voor elk van de rode, groene en blauwe componenten en 16 bits voor alfa. |
| Format64bppPArgb | n/a | Specificeert dat het pixelformaat 64 bits per pixel is met 16 bits voor elk van de rode, groene en blauwe componenten en 16 bits voor alfa. De rode, groene en blauwe componenten worden vooraf vermenigvuldigd volgens de waarde van de alfacomponent. |
| Format32bppCMYK | n/a | Specificeert dat het pixelformaat 32 bits per pixel is met 8 bits voor elk van de cyaan, magenta, geel en sleutelcomponenten. |
| Max | 16 | De maximale waarde van deze enum. |

## Zie ook

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
