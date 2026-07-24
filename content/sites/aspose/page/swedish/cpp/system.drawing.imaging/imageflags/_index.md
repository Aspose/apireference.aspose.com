---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Imaging::ImageFlags enum. Representerar attribut för pixeldata som representeras av ett Image-objekt i C++."
type: docs
weight: 2200
url: /sv/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


Representerar attribut för pixeldata som representeras av ett [Image](../../system.drawing/image/)-objekt.

```cpp
enum class ImageFlags
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| None | 0 |  |
| Skalbar | 1 | Skalbar. |
| HasAlpha | 2 | Innehåller alfainformation. |
| HasTranslucent | 4 | Det finns alfavärden större än 0 och mindre än 255. |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | Pixeldata representeras i RGB-färgrymden. |
| ColorSpaceCmyk | 32 | Pixeldata representeras i CMYK-färgrymden. |
| ColorSpaceGray | 64 | Pixeldata är i gråskala. |
| ColorSpaceYcbcr | 128 | Pixeldata representeras i YCBCR-färgrymden. |
| ColorSpaceYcck | 256 | Pixeldata representeras i YCCK-färgrymden. |
| HasRealDpi | 4096 | DPI-informationen lagras i bilden. |
| HasRealPixelSize | 8192 | Storleken på en pixel lagras i bilden. |
| Skrivskyddad | 65536 | Pixeldata är skrivskyddad. |
| Caching | 131072 | Kan cachas för snabbare åtkomst. |

## Se även

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
