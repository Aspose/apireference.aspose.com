---
title: Class Font
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Font klas. Definieert een bepaald formaat voor tekst inclusief lettertype grootte en stijlkenmerken. Deze klasse kan niet worden overgenomen.
type: docs
weight: 500
url: /nl/net/system.drawing/font/
---
## Font class

Definieert een bepaald formaat voor tekst, inclusief lettertype, grootte en stijlkenmerken. Deze klasse kan niet worden overgenomen.

```csharp
public sealed class Font : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | Initialiseert een nieuw exemplaar van het`Font` klasse gebruikt het opgegeven bestaandeFont EnFontStyle opsomming.. |
| [Font](font/#constructor_1)(FontFamily, float) | Initialiseert een nieuw exemplaar van het`Font` klasse. |
| [Font](font/#constructor_7)(string, float) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte. |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte en stijl.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte en eenheid. Stelt de stijl in opRegular . |
| [Font](font/#constructor_8)(string, float, FontStyle) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte en stijl. |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte en eenheid. De stijl is ingesteld opRegular . |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte, stijl en eenheid. |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | Initialiseert een nieuw exemplaar van het`Font` klasse met een opgegeven grootte, stijl en eenheid. |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Initialiseert een nieuw exemplaar van het`Font` klasse met een gespecificeerde grootte, stijl, eenheid en tekenset.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Initialiseert een nieuw exemplaar van het`Font`klasse met een gespecificeerde grootte, stijl, eenheid en tekenset. |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Initialiseert een nieuw exemplaar van het`Font` klasse met een gespecificeerde grootte, stijl, eenheid en tekenset.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Initialiseert een nieuw exemplaar van het`Font` klasse met de opgegeven grootte, stijl, eenheid en tekenset. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | Krijgt een waarde die aangeeft of ditFont is vetgedrukt. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | Krijgt deFontFamily hiermee in verband gebrachtFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | Haalt een bytewaarde op die de GDI-tekenset specificeert die ditFont gebruikt. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | Krijgt een waarde die aangeeft of ditFont is afgeleid van een verticaal GDI-lettertype.. |
| [Height](../../system.drawing/font/height/) { get; } | Haalt de regelafstand van dit lettertype op. |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | Krijgt een waarde die aangeeft of het lettertype lid is vanSystemFonts . |
| [Italic](../../system.drawing/font/italic/) { get; } | Krijgt een waarde die aangeeft of ditFont is cursief. |
| [Name](../../system.drawing/font/name/) { get; } | Krijgt de gezichtsnaam hiervanFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | Krijgt de naam van het oorspronkelijk opgegeven lettertype. |
| [Size](../../system.drawing/font/size/) { get; } | Krijgt de em-maat hiervanFont gemeten in de eenheden gespecificeerd door the Unit eigendom. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | Krijgt de em-grootte, in punten, hiervanFont . |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | Krijgt een waarde die aangeeft of ditFont specificeert een horizontale lijn door het lettertype. |
| [Style](../../system.drawing/font/style/) { get; } | Krijgt hiervoor stijlinformatieFont . |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | Haalt de naam van het systeemlettertype op als de eigenschap IsSystemFont true retourneert. |
| [Underline](../../system.drawing/font/underline/) { get; } | Krijgt een waarde die aangeeft of ditFont is onderstreept. |
| [Unit](../../system.drawing/font/unit/) { get; } | Krijgt de maateenheid hiervoorFont . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | Maakt hiervan een exacte kopieFont . |
| [Dispose](../../system.drawing/font/dispose/)() | Geeft alle bronnen vrij die hierdoor worden gebruiktFont . |
| override [Equals](../../system.drawing/font/equals/)(object) | Geeft aan of het opgegeven object eenFont en heeft hetzelfdeFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , enUnit eigendomswaarden als dezeFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | Krijgt de hash-code hiervoorFont . |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | Geeft als resultaat de regelafstand, in pixels, van dit lettertype. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | Geeft de hoogte in pixels hiervan terugFontwanneer getekend naar een apparaat met de opgegeven verticale resolutie. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | Retourneert de regelafstand, in de huidige eenheid van een opgegevenGraphics , van dit lettertype. |
| override [ToString](../../system.drawing/font/tostring/)() | Retourneert hiervan een door mensen leesbare tekenreeksrepresentatieFont . |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


