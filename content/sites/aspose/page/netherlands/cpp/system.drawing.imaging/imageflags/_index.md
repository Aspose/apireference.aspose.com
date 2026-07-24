---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ImageFlags enum. Vertegenwoordigt attributen van de pixelgegevens die worden weergegeven door een Image-object in C++."
type: docs
weight: 2200
url: /nl/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


Vertegenwoordigt attributen van de pixelgegevens die worden weergegeven door een [Image](../../system.drawing/image/) object.

```cpp
enum class ImageFlags
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 |  |
| Schaalbaar | 1 | Schaalbaar. |
| HasAlpha | 2 | Bevat alfa-informatie. |
| HasTranslucent | 4 | Er zijn alfawaarden groter dan 0 en kleiner dan 255. |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | De pixelgegevens worden weergegeven in de RGB-kleurruimte. |
| ColorSpaceCmyk | 32 | De pixelgegevens worden weergegeven in de CMYK-kleurruimte. |
| ColorSpaceGray | 64 | De pixelgegevens zijn grijswaarden. |
| ColorSpaceYcbcr | 128 | De pixelgegevens worden weergegeven in de YCBCR-kleurruimte. |
| ColorSpaceYcck | 256 | De pixelgegevens worden weergegeven in de YCCK-kleurruimte. |
| HasRealDpi | 4096 | De DPI-informatie wordt opgeslagen in de afbeelding. |
| HasRealPixelSize | 8192 | De grootte van een pixel wordt opgeslagen in de afbeelding. |
| ReadOnly | 65536 | De pixelgegevens zijn alleen-lezen. |
| Caching | 131072 | Kan worden gecached voor snellere toegang. |

## Zie ook

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
