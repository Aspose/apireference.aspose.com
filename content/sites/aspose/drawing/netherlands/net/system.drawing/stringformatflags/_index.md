---
title: Enum StringFormatFlags
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.StringFormatFlags opsomming. Specificeert de weergave en layoutinformatie voor tekenreeksen.
type: docs
weight: 1140
url: /nl/net/system.drawing/stringformatflags/
---
## StringFormatFlags enumeration

Specificeert de weergave- en lay-outinformatie voor tekenreeksen.

```csharp
[Flags]
public enum StringFormatFlags
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| DirectionRightToLeft | `1` | Tekst wordt van rechts naar links weergegeven. |
| DirectionVertical | `2` | Tekst is verticaal uitgelijnd. |
| FitBlackBox | `4` | Delen van tekens mogen over de lay-outrechthoek van de tekenreeks hangen. Standaard worden tekens verplaatst om overhangen te voorkomen. |
| DisplayFormatControl | `20` | Besturingstekens zoals de links-naar-rechts-markering worden in de uitvoer weergegeven met een representatieve glyph. |
| NoFontFallback | `400` | Terugval naar alternatieve lettertypen voor tekens die niet worden ondersteund in het gevraagde lettertype is uitgeschakeld. Eventuele ontbrekende tekens worden weergegeven met de lettertypen zonder glyph, meestal een open vierkant. |
| MeasureTrailingSpaces | `800` | Bevat de volgspatie aan het einde van elke regel. Standaard sluit de begrenzingsrechthoek die wordt geretourneerd door de methode MeasureString de spatie aan het einde van elke regel uit. Stel deze vlag in om die spatie in de meting op te nemen. |
| NoWrap | `1000` | Tekstterugloop tussen regels bij opmaak binnen een rechthoek is uitgeschakeld. Deze vlag wordt geïmpliceerd wanneer een punt wordt gepasseerd in plaats van een rechthoek, of wanneer de opgegeven rechthoek een lijnlengte van nul heeft. |
| LineLimit | `2000` | In de opmaakrechthoek worden alleen hele lijnen opgemaakt. Standaard gaat de opmaak door tot het einde van de tekst, of totdat er geen regels meer zichtbaar zijn als gevolg van afsnijden, afhankelijk van wat zich het eerst voordoet. Merk op dat de standaardinstellingen de laatste regel die gedeeltelijk wordt verborgen door een opmaak rechthoek die geen heel veelvoud is van de regelhoogte. Om ervoor te zorgen dat alleen hele lijnen zichtbaar zijn, specificeert deze waarde en zorgt u ervoor dat u een opmaakrechthoek opgeeft die minstens zo hoog is als de hoogte van één regel. |
| NoClip | `4000` | Overhangende delen van glyphs en onverpakte tekst die buiten de opmaakrechthoek valt, mogen worden weergegeven. Standaard worden alle tekst- en glyph-delen die buiten de opmaakrechthoek reiken, afgekapt. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


