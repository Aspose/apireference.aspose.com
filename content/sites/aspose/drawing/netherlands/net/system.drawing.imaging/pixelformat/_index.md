---
title: Enum PixelFormat
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.PixelFormat opsomming. Specificeert de indeling van de kleurgegevens voor elke pixel in de afbeelding.
type: docs
weight: 850
url: /nl/net/system.drawing.imaging/pixelformat/
---
## PixelFormat enumeration

Specificeert de indeling van de kleurgegevens voor elke pixel in de afbeelding.

```csharp
public enum PixelFormat
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Indexed | `65536` | De pixelgegevens bevatten kleurgeïndexeerde waarden, wat betekent dat de waarden een index zijn voor kleuren in de systeemkleurentabel , in tegenstelling tot individuele kleurwaarden. |
| Gdi | `131072` | De pixelgegevens bevatten GDI-kleuren. |
| Alpha | `262144` | De pixelgegevens bevatten alfawaarden die niet vooraf zijn vermenigvuldigd. |
| PAlpha | `524288` | Het pixelformaat bevat vooraf vermenigvuldigde alfawaarden. |
| Extended | `1048576` | Gereserveerde waarde. |
| Canonical | `2097152` | Het standaard pixelformaat van 32 bits per pixel. Het formaat specificeert 24-bits kleurdiepte en een 8-bits alfakanaal. |
| Undefined | `0` | Het pixelformaat is ongedefinieerd. |
| DontCare | `0` | Er is geen pixelformaat gespecificeerd. |
| Format1bppIndexed | `196865` | Specificeert dat het pixelformaat 1 bit per pixel is en dat het geïndexeerde kleur gebruikt. De kleurentabel bevat daarom twee kleuren. |
| Format4bppIndexed | `197634` | Specificeert dat het formaat 4 bits per pixel is, geïndexeerd. |
| Format8bppIndexed | `198659` | Geeft aan dat het formaat 8 bits per pixel is, geïndexeerd. De kleurentabel bevat dus 256 kleuren. |
| Format16bppGrayScale | `1052676` | Het pixelformaat is 16 bits per pixel. De kleurinformatie specificeert 65536 grijstinten. |
| Format16bppRgb555 | `135173` | Specificeert dat het formaat 16 bits per pixel is; 5 bits elk worden gebruikt voor de rode, groene en blauwe componenten. De resterende bit wordt niet gebruikt. |
| Format16bppRgb565 | `135174` | Specificeert dat het formaat 16 bits per pixel is; 5 bits worden gebruikt voor de rode component, 6 bits worden gebruikt voor de groene component en 5 bits worden gebruikt voor de blauwe component. |
| Format16bppArgb1555 | `397319` | Het pixelformaat is 16 bits per pixel. De kleurinformatie specificeert 32.768 kleurschakeringen, waarvan 5 bits rood, 5 bits groen, 5 bits blauw en 1 bit alpha zijn. |
| Format24bppRgb | `137224` | Specificeert dat het formaat 24 bits per pixel is; 8 bits worden elk gebruikt voor de rode, groene en blauwe componenten. |
| Format32bppRgb | `139273` | Specificeert dat het formaat 32 bits per pixel is; 8 bits worden elk gebruikt voor de rode, groene en blauwe componenten. De overige 8 bits worden niet gebruikt. |
| Format32bppArgb | `2498570` | Specificeert dat het formaat 32 bits per pixel is; 8 bits elk worden gebruikt voor de alfa, rode, groene en blauwe componenten. |
| Format32bppPArgb | `925707` | Specificeert dat het formaat 32 bits per pixel is; 8 bits elk worden gebruikt voor de alpha, rode, groene en blauwe componenten. De rode, groene en blauwe componenten zijn vooraf vermenigvuldigd, volgens de alfacomponent. |
| Format48bppRgb | `1060876` | Specificeert dat het formaat 48 bits per pixel is; 16 bits elk worden gebruikt voor de rode, groene en blauwe componenten. |
| Format64bppArgb | `3424269` | Specificeert dat het formaat 64 bits per pixel is; 16 bits elk worden gebruikt voor de alpha, rode, groene en blauwe componenten. |
| Format64bppPArgb | `1851406` | Specificeert dat het formaat 64 bits per pixel is; 16 bits elk worden gebruikt voor de alpha, rode, groene en blauwe componenten. De rode, groene en blauwe componenten zijn voorvermenigvuldigd volgens de alfacomponent. |
| Max | `15` | De maximale waarde voor deze opsomming. |

### Zie ook

* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


