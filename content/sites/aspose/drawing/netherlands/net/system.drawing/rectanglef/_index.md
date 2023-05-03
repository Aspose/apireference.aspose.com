---
title: Struct RectangleF
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.RectangleF structuur. Slaat een set van vier getallen met drijvende komma op die de locatie en grootte van een rechthoek vertegenwoordigen. Gebruik een Regionobject voor meer geavanceerde regiofuncties.
type: docs
weight: 1050
url: /nl/net/system.drawing/rectanglef/
---
## RectangleF structure

Slaat een set van vier getallen met drijvende komma op die de locatie en grootte van een rechthoek vertegenwoordigen. Gebruik een Region-object voor meer geavanceerde regiofuncties.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | Initialiseert een nieuwe instantie van de RectangleF-structuur met de opgegeven locatie en grootte. |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | Initialiseert een nieuwe instantie van de RectangleF-structuur met de opgegeven locatie en grootte. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | Haalt de y-coördinaat op die de som is van Y en Hoogte van deze RectangleF-structuur. |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | Hiermee wordt de hoogte van deze RectangleF-structuur opgehaald of ingesteld. |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | Krijgt een waarde die aangeeft of deWidth ofHeight property hiervanRectangleF heeft een waarde van nul. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | Haalt de x-coördinaat op van de linkerrand van deze RectangleF-structuur. |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | Haalt of stelt de coördinaten van de linkerbovenhoek hiervan inRectangleF structuur. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | Haalt de x-coördinaat op die de som is van X en Breedte van deze RectangleF-structuur. |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | Haalt of stelt de grootte hiervan inRectangleF . |
| [Top](../../system.drawing/rectanglef/top/) { get; } | Haalt de y-coördinaat op van de bovenrand van deze RectangleF-structuur. |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | Hiermee wordt de breedte van deze RectangleF-structuur opgehaald of ingesteld. |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | Haalt de x-coördinaat van de linkerbovenhoek van deze RectangleF-structuur op of stelt deze in. |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | Haalt de x-coördinaat van de linkerbovenhoek van deze RectangleF-structuur op of stelt deze in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | Creëert een RectangleF-structuur met een linkerbovenhoek en een rechteronderhoek op de opgegeven locaties. |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | Creëert en retourneert een opgeblazen kopie van het gespecificeerdeRectangleF structure. De kopie wordt opgeblazen met de opgegeven hoeveelheid. De oorspronkelijke rechthoek blijft ongewijzigd. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Geeft als resultaat eenRectangleF structuur die het snijpunt van twee rechthoeken voorstelt. Als er geen snijpunt is, en leegRectangleF wordt geretourneerd. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | Maakt de kleinst mogelijke derde rechthoek die beide rechthoeken kan bevatten die een unie vormen. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | Bepaalt of het gespecificeerde punt hierin is opgenomenRectangleF structuur. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | Bepaalt of het rechthoekige gebied vertegenwoordigd door*rect* zit hier helemaal inRectangleF structuur. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | Bepaalt of het gespecificeerde punt hierin is opgenomenRectangleF structuur. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | Bepaalt of de opgegevenObject , is gelijk aan deze instantie. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | Test of andere`RectangleF` structuur heeft dezelfde locatie en grootte hiervan`RectangleF` structuur. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | Retourneert een hash-code voor deze instantie. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | Blaast dit opRectangleF met het opgegeven bedrag. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | Blaast dit opRectangleF structuur met het opgegeven bedrag. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | Vervangt ditRectangleF structuur met het snijpunt van zichzelf en de gespecificeerde RectangleF structuur. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | Bepaalt of deze rechthoek snijdt met*rect* . |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | Past de locatie van deze rechthoek aan met de opgegeven hoeveelheid. |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | Past de locatie van deze rechthoek aan met de opgegeven hoeveelheid. |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | Converteert de attributen hiervan[`Rectangle`](../rectangle/) naar een voor mensen leesbare string. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | Test of tweeRectangleF structuren hebben dezelfde locatie en grootte. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | Converteert de opgegeven Rectangle-structuur naar een RectangleF-structuur. |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | Test of tweeRectangleF structuren verschillen in locatie of grootte. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | Vertegenwoordigt een instantie van deRectangleFklasse waarvan de leden niet zijn geïnitialiseerd. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


