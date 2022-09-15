---
title: RectangleF
second_title: Aspose.Drawing för .NET API Referens
description: Lagrar en uppsättning av fyra flyttalstal som representerar platsen och storleken på en rektangel. För mer avancerade regionfunktioner använd ett Regionobjekt.
type: docs
weight: 1050
url: /sv/net/system.drawing/rectanglef/
---
## RectangleF structure

Lagrar en uppsättning av fyra flyttalstal som representerar platsen och storleken på en rektangel. För mer avancerade regionfunktioner, använd ett Region-objekt.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Initierar en ny instans av RectangleF-strukturen med angiven plats och storlek. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Initierar en ny instans av RectangleF-strukturen med angiven plats och storlek. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Får y-koordinaten som är summan av Y och höjden av denna rektangelF-struktur. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Hämtar eller ställer in höjden på denna RectangleF-struktur. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Får ett värde som indikerar omWidth ellerHeight egenskap av dettaRectangleFhar värdet noll. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Får x-koordinaten för den vänstra kanten av denna rektangelF-struktur. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Hämtar eller ställer in koordinaterna för det övre vänstra hörnet av dennaRectangleF struktur. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Får x-koordinaten som är summan av X och bredd av denna rektangelF-struktur. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Hämtar eller ställer in storleken på dettaRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Får y-koordinaten för den övre kanten av denna rektangelF-struktur. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Hämtar eller ställer in bredden på denna RectangleF-struktur. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Hämtar eller ställer in x-koordinaten för det övre vänstra hörnet av denna rektangelF-struktur. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Hämtar eller ställer in x-koordinaten för det övre vänstra hörnet av denna rektangelF-struktur. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Skapar en RectangleF-struktur med övre vänstra hörnet och nedre högra hörnet på de angivna platserna. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Skapar och returnerar en uppblåst kopia av den angivnaRectangleF structure. Kopian är uppblåst med det angivna beloppet. Den ursprungliga rektangeln förblir oförändrad. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Returnerar enRectangleF struktur som representerar skärningspunkten mellan två rektanglar. Om det inte finns någon skärningspunkt, och tomRectangleF returneras. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Skapar den minsta möjliga tredje rektangeln som kan innehålla båda de två rektanglarna som bildar en union. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Bestämmer om den angivna punkten finns inom dennaRectangleF struktur. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Bestämmer om det rektangulära området representerat av*rect* är helt innesluten i dettaRectangleF struktur. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Bestämmer om den angivna punkten finns inom dennaRectangleF struktur. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Bestämmer om den angivnaObject , är lika med denna instans. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Testar om andra[`RectangleF`](../rectanglef) strukturen har samma placering och storlek som denna[`RectangleF`](../rectanglef) struktur. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Returnerar en hash-kod för denna instans. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | Blåser upp dettaRectangleF med det angivna beloppet. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | Blåser upp dettaRectangleF struktur med angivet belopp. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Ersätter dettaRectangleF struktur med skärningspunkten mellan sig själv och specificerad RectangleF struktur. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Bestämmer om denna rektangel skär med*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Justerar platsen för denna rektangel med det angivna beloppet. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Justerar platsen för denna rektangel med det angivna beloppet. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Konverterar attributen för detta[`Rectangle`](../rectangle) till en mänsklig läsbar sträng. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Testar om tvåRectangleF strukturer har samma plats och storlek. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Konverterar den angivna rektangelstrukturen till en rektangelF-struktur. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Testar om tvåRectangleF strukturer skiljer sig åt i plats eller storlek. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Representerar en instans avRectangleF klass med dess medlemmar oinitierad. |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
