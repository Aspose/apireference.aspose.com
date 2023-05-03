---
title: Struct Rectangle
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Rectangle structuur. Slaat een set van vier gehele getallen op die de locatie en grootte van een rechthoek vertegenwoordigen.
type: docs
weight: 1040
url: /nl/net/system.drawing/rectangle/
---
## Rectangle structure

Slaat een set van vier gehele getallen op die de locatie en grootte van een rechthoek vertegenwoordigen.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | Initialiseert een nieuw exemplaar van het`Rectangle` struct met de opgegeven locatie en grootte. |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | Initialiseert een nieuw exemplaar van de rechthoekstructuur met de opgegeven locatie en grootte. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | Haalt de y-coördinaat op die de som is van de eigenschapswaarden Y en Hoogte van deze rechthoekstructuur. |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | Hiermee wordt de hoogte van deze rechthoekstructuur opgehaald of ingesteld. |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | Krijgt een waarde die aangeeft of alle numerieke eigenschappen hiervan`Rectangle` hebben waarden van nul. |
| [Left](../../system.drawing/rectangle/left/) { get; } | Haalt de x-coördinaat op van de linkerrand van deze rechthoekstructuur. |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | Haalt of stelt de coördinaten van de linkerbovenhoek hiervan inRectangle structuur. |
| [Right](../../system.drawing/rectangle/right/) { get; } | Haalt de x-coördinaat op die de som is van de eigenschapswaarden X en Breedte van deze rechthoekstructuur. |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | Haalt of stelt de grootte hiervan inRectangle . |
| [Top](../../system.drawing/rectangle/top/) { get; } | Haalt de y-coördinaat op van de bovenrand van deze rechthoekstructuur. |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | Hiermee wordt de breedte van deze rechthoekstructuur opgehaald of ingesteld. |
| [X](../../system.drawing/rectangle/x/) { get; set; } | Hiermee wordt de x-coördinaat van de linkerbovenhoek van deze rechthoekstructuur opgehaald of ingesteld. |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | Haalt de y-coördinaat van de linkerbovenhoek van deze rechthoekstructuur op of stelt deze in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | Converteert het gespecificeerdeRectangleF structuur aan eenRectangle structuur door afronding van deRectangleF waarden naar de volgende hogere gehele waarden. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | Creëert eenRectangle structuur met de gespecificeerde randlocaties. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | Creëert een`Rectangle` die wordt opgeblazen met het opgegeven bedrag. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | Geeft een derde terugRectangle structuur die de intersectie van twee andere vertegenwoordigtRectangle structuren. Als er geen kruising is, een leegRectangle wordt geretourneerd. |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | Converteert het gespecificeerdeRectangleF naar eenRectangle door afronding deRectangleF waarden naar de dichtstbijzijnde gehele waarden. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | Converteert het gespecificeerdeRectangleF naar eenRectangle door het inkorten van deRectangleF waarden. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | Krijgt eenRectangle structuur die de vereniging van twee bevatRectangle structuren. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | Bepaalt of het gespecificeerde punt hierin is opgenomenRectangle structuur. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | Bepaalt of het rechthoekige gebied vertegenwoordigd door*rect* is volledig vervat in het rechthoekige gebied dat hierdoor wordt weergegeven`Rectangle` . |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | Bepaalt of het gespecificeerde punt hierin is opgenomenRectangle structuur. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | Test of obj eenRectanglestructuur met dezelfde locatie en grootte hiervanRectangle structuur. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | Test of andere`Rectangle` structuur heeft dezelfde locatie en grootte hiervan`Rectangle` structuur. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | Retourneert hiervoor de hash-codeRectangle structuur. Voor informatie over het gebruik van hashcodes, zie GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | Vergroot ditRectangle met het opgegeven bedrag. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | Vergroot ditRectangle met het opgegeven bedrag. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | Vervangt ditRectangle met het snijpunt van zichzelf en het gespecificeerdeRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | Bepaalt of deze rechthoek snijdt met*rect* . |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | Past de locatie van deze rechthoek aan met de opgegeven hoeveelheid. |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | Past de locatie van deze rechthoek aan met de opgegeven hoeveelheid. |
| override [ToString](../../system.drawing/rectangle/tostring/)() | Converteert de attributen hiervan`Rectangle` naar een voor mensen leesbare string. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | Test of tweeRectangle structuren hebben dezelfde locatie en grootte. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | Test of tweeRectangle structuren verschillen in locatie of grootte. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | Vertegenwoordigt eenRectangle structuur waarvan de eigenschappen niet zijn geïnitialiseerd. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


