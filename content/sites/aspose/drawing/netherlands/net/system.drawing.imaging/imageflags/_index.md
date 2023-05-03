---
title: Enum ImageFlags
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.ImageFlags opsomming. Specificeert de kenmerken van de pixelgegevens in eenImage voorwerp. De eigenschap Flags retourneert een lid van deze opsomming. Deze opsomming heeft een FlagsAttributeattribuut dat een bitsgewijze combinatie van de lidwaarden toestaat.
type: docs
weight: 760
url: /nl/net/system.drawing.imaging/imageflags/
---
## ImageFlags enumeration

Specificeert de kenmerken van de pixelgegevens in een[`Image`](../../system.drawing/image/) voorwerp. De eigenschap Flags retourneert een lid van deze opsomming. Deze opsomming heeft een FlagsAttribute-attribuut dat een bitsgewijze combinatie van de lidwaarden toestaat.

```csharp
[Flags]
public enum ImageFlags
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | `0` | Er is geen formaatinformatie |
| Scalable | `1` | De pixelgegevens zijn schaalbaar. |
| HasAlpha | `2` | De pixelgegevens bevatten alfa-informatie. |
| HasTranslucent | `4` | Geeft aan dat de pixelgegevens andere alfawaarden hebben dan 0 (transparant) en 255 (ondoorzichtig) |
| PartiallyScalable | `8` | De pixelgegevens zijn gedeeltelijk schaalbaar, maar er zijn enkele beperkingen. |
| ColorSpaceRgb | `10` | De pixelgegevens gebruiken een RGB-kleurruimte. |
| ColorSpaceCmyk | `20` | De pixelgegevens gebruiken een CMYK-kleurruimte. |
| ColorSpaceGray | `40` | De pixelgegevens zijn grijswaarden. |
| ColorSpaceYcbcr | `80` | Geeft aan dat de afbeelding wordt opgeslagen met behulp van een YCBCR-kleurruimte. |
| ColorSpaceYcck | `100` | Geeft aan dat de afbeelding wordt opgeslagen met behulp van een YCCK-kleurruimte. |
| HasRealDpi | `1000` | Specificeert dat dots per inch-informatie wordt opgeslagen in de afbeelding. |
| HasRealPixelSize | `2000` | Specificeert dat de pixelgrootte wordt opgeslagen in de afbeelding. |
| ReadOnly | `10000` | De pixelgegevens zijn alleen-lezen. |
| Caching | `20000` | De pixelgegevens kunnen in de cache worden opgeslagen voor snellere toegang. |

### Zie ook

* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


