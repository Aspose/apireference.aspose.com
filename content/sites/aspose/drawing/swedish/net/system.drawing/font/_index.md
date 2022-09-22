---
title: Font
second_title: Aspose.Drawing för .NET API Referens
description: Definierar ett visst format för text inklusive teckensnitt storlek och stilattribut. Den här klassen kan inte ärvas.
type: docs
weight: 500
url: /sv/net/system.drawing/font/
---
## Font class

Definierar ett visst format för text, inklusive teckensnitt, storlek och stilattribut. Den här klassen kan inte ärvas.

```csharp
public sealed class Font : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Initierar en ny instans av[`Font`](../font) klass använder den angivna befintligaFont ochFontStyle uppräkning.. |
| [Font](font#constructor_1)(FontFamily, float) | Initierar en ny instans av[`Font`](../font) class. |
| [Font](font#constructor_7)(string, float) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek och stil.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek och enhet. Ställer in stilen tillRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek och stil. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek och enhet. Stilen är inställd påRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek, stil och enhet. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Initierar en ny instans av[`Font`](../font) klass med en angiven storlek, stil och enhet. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Initierar en ny instans av[`Font`](../font) klass med en specificerad storlek, stil, enhet och teckenuppsättning.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Initierar en ny instans av[`Font`](../font)klass med en specificerad storlek, stil, enhet och teckenuppsättning. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Initierar en ny instans av[`Font`](../font) klass med en specificerad storlek, stil, enhet och teckenuppsättning.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Initierar en ny instans av[`Font`](../font) klass med den angivna storleken, stilen, enheten och teckenuppsättningen. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Får ett värde som indikerar om dettaFont är fetstil. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | FårFontFamily i samband med dettaFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Får ett bytevärde som specificerar GDI-teckenuppsättningen som dettaFont använder. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Får ett värde som indikerar om dettaFont härleds från ett vertikalt GDI-teckensnitt.. |
| [Height](../../system.drawing/font/height) { get; } | Hämtar radavståndet för detta teckensnitt. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Får ett värde som indikerar om typsnittet är medlem avSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Får ett värde som indikerar om dettaFont är kursiv. |
| [Name](../../system.drawing/font/name) { get; } | Får ansiktsnamnet på dettaFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Hämtar namnet på teckensnittet som ursprungligen angavs. |
| [Size](../../system.drawing/font/size) { get; } | Får em-storleken på dettaFont mätt i de enheter som anges av the Unit egenskap. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Får em-storleken, i poäng, av dettaFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Får ett värde som indikerar om dettaFont anger en horisontell linje genom teckensnittet. |
| [Style](../../system.drawing/font/style) { get; } | Får stilinformation för dettaFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Hämtar namnet på systemteckensnittet om egenskapen IsSystemFont returnerar true. |
| [Underline](../../system.drawing/font/underline) { get; } | Får ett värde som indikerar om dettaFont är understruket. |
| [Unit](../../system.drawing/font/unit) { get; } | Hämtar måttenheten för dettaFont . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Skapar en exakt kopia av dettaFont . |
| [Dispose](../../system.drawing/font/dispose)() | Frigör alla resurser som används av dettaFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Indikerar om det angivna objektet är ettFont och har sammaFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , ochUnit fastighetsvärden som dettaFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Hämtar hashkoden för dettaFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Returnerar radavståndet, i pixlar, för detta teckensnitt. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Returnerar höjden, i pixlar, för dettaFontnär den dras till en enhet med den angivna vertikala upplösningen. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Returnerar radavståndet i den aktuella enheten för en angivenGraphics , av detta teckensnitt. |
| override [ToString](../../system.drawing/font/tostring)() | Returnerar en mänsklig läsbar strängrepresentation av dettaFont . |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
