---
title: Rectangle
second_title: Aspose.Drawing för .NET API Referens
description: Lagrar en uppsättning av fyra heltal som representerar platsen och storleken på en rektangel.
type: docs
weight: 1040
url: /sv/net/system.drawing/rectangle/
---
## Rectangle structure

Lagrar en uppsättning av fyra heltal som representerar platsen och storleken på en rektangel.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Initierar en ny instans av[`Rectangle`](../rectangle) struct med angiven plats och storlek. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Initierar en ny instans av rektangelstrukturen med angiven plats och storlek. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Får y-koordinaten som är summan av Y- och Height-egenskapsvärdena för denna rektangelstruktur. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Hämtar eller ställer in höjden på denna rektangelstruktur. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Får ett värde som indikerar om alla numeriska egenskaper för detta[`Rectangle`](../rectangle) har värden noll. |
| [Left](../../system.drawing/rectangle/left) { get; } | Får x-koordinaten för den vänstra kanten av denna rektangelstruktur. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Hämtar eller ställer in koordinaterna för det övre vänstra hörnet av dennaRectangle struktur. |
| [Right](../../system.drawing/rectangle/right) { get; } | Får x-koordinaten som är summan av X- och Width-egenskapsvärdena för denna rektangelstruktur. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Hämtar eller ställer in storleken på dettaRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Får y-koordinaten för den övre kanten av denna rektangelstruktur. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Hämtar eller ställer in bredden på denna rektangelstruktur. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Hämtar eller ställer in x-koordinaten för det övre vänstra hörnet av denna rektangelstruktur. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Hämtar eller ställer in y-koordinaten för det övre vänstra hörnet av denna rektangelstruktur. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Konverterar den angivnaRectangleF struktur till enRectangle struktur genom att runda avRectangleF värden till nästa högre heltalsvärden. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Skapar enRectangle struktur med de angivna kantplatserna. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Skapar en[`Rectangle`](../rectangle) som är uppblåst med det angivna beloppet. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Returnerar en tredjedelRectangle struktur som representerar skärningspunkten mellan två andraRectangle strukturer. Om det inte finns någon korsning, en tomRectangle returneras. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Konverterar den angivnaRectangleF till aRectangle genom att avrunda denRectangleFvärden till närmaste heltalsvärden. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Konverterar den angivnaRectangleF till aRectangle genom att trunkeraRectangleF värden. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Får enRectangle struktur som innehåller föreningen av tvåRectangle strukturer. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Bestämmer om den angivna punkten finns inom dennaRectangle struktur. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Bestämmer om det rektangulära området representerat av*rect* är helt innesluten inom det rektangulära område som representeras av detta[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Bestämmer om den angivna punkten finns inom dennaRectangle struktur. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Testar om obj är enRectangle struktur med samma placering och storlek på dennaRectangle struktur. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Testar om andra[`Rectangle`](../rectangle) strukturen har samma placering och storlek som denna[`Rectangle`](../rectangle) struktur. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Returnerar hash-koden för dettaRectangle strukturera. För information om användningen av hashkoder, se GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Förstorar dettaRectangle med det angivna beloppet. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Förstorar dettaRectangle med det angivna beloppet. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Ersätter dettaRectanglemed skärningspunkten mellan sig själv och det specificeradeRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Bestämmer om denna rektangel skär med*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Justerar platsen för denna rektangel med det angivna beloppet. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Justerar platsen för denna rektangel med det angivna beloppet. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Konverterar attributen för detta[`Rectangle`](../rectangle) till en mänsklig läsbar sträng. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Testar om tvåRectangle strukturer har samma plats och storlek. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Testar om tvåRectangle strukturer skiljer sig åt i plats eller storlek. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | Representerar enRectangle struktur med dess egenskaper oinitierade. |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
