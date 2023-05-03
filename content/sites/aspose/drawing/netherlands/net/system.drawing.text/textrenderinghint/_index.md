---
title: Enum TextRenderingHint
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Text.TextRenderingHint opsomming. Specificeert de kwaliteit van tekstweergave.
type: docs
weight: 1250
url: /nl/net/system.drawing.text/textrenderinghint/
---
## TextRenderingHint enumeration

Specificeert de kwaliteit van tekstweergave.

```csharp
public enum TextRenderingHint
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| SystemDefault | `0` | Elk teken wordt getekend met behulp van zijn glyph-bitmap, met de standaard weergavehint van het systeem. De tekst wordt getekend met de instellingen voor het gladmaken van lettertypen die de gebruiker voor het systeem heeft geselecteerd. |
| SingleBitPerPixelGridFit | `1` | Elk teken wordt getekend met behulp van zijn glyph-bitmap. Hinting wordt gebruikt om het uiterlijk van tekens op stengels en kromming te verbeteren. |
| SingleBitPerPixel | `2` | Elk karakter wordt getekend met zijn glyph-bitmap. Hints worden niet gebruikt. |
| AntiAliasGridFit | `3` | Elk personage wordt getekend met behulp van zijn anti-aliased glyph-bitmap met hints. Veel betere kwaliteit dankzij anti-aliasing, maar tegen hogere prestatiekosten. |
| AntiAlias | `4` | Elk teken wordt getekend met behulp van de geantialiaseerde glyph-bitmap zonder hints. Betere kwaliteit dankzij antialiasing. Stambreedteverschillen kunnen merkbaar zijn omdat hints zijn uitgeschakeld. |
| ClearTypeGridFit | `5` | Elk teken wordt getekend met zijn glyph ClearType-bitmap met hints. De hoogste kwaliteitsinstelling. Gebruikt om te profiteren van ClearType-lettertypefuncties. |

### Zie ook

* naamruimte [System.Drawing.Text](../../system.drawing.text/)
* montage [Aspose.Drawing](../../)


