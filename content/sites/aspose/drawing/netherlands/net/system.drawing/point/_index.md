---
title: Struct Point
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Point structuur. Vertegenwoordigt een geordend paar integer x en ycoördinaten dat een punt in een tweedimensionaal vlak definieert.
type: docs
weight: 930
url: /nl/net/system.drawing/point/
---
## Point structure

Vertegenwoordigt een geordend paar integer x- en y-coördinaten dat een punt in een tweedimensionaal vlak definieert.

```csharp
public struct Point : IEquatable<Point>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Point](point/#constructor)(int) | Initialiseert een nieuw exemplaar van het`Point` struct met behulp van coördinaten gespecificeerd door een geheel getal. |
| [Point](point/#constructor_2)(Size) | Initialiseert een nieuw exemplaar van het`Point` structuur van een[`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | Initialiseert een nieuw exemplaar van het`Point` struct met de opgegeven coördinaten. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | Krijgt een waarde die aangeeft of dit dit isPoint is leeg. |
| [X](../../system.drawing/point/x/) { get; set; } | Haalt of stelt de x-coördinaat van dit punt in. |
| [Y](../../system.drawing/point/y/) { get; set; } | Haalt de y-coördinaat van dit punt op of stelt deze in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | Voegt het gespecificeerde toeSize naar het gespecificeerdePoint . |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | Converteert een[`PointF`](../pointf/) naar een`Point` door een plafondbewerking uit te voeren op alle coördinaten. |
| static [Round](../../system.drawing/point/round/)(PointF) | Converteert het gespecificeerdePointF naar een Point-object door het af te rondenPoint waarden tot op het dichtstbijzijnde gehele getal. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | Vertaalt een`Point` door de ontkenning van een gegeven[`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | Converteert een PointF naar een Point door een afkapbewerking uit te voeren op alle coördinaten. |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | Specificeert of ditPoint bevat dezelfde coördinaten als de opgegevenObject . |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | Test of andere`Point` structuur heeft dezelfde locatie hiervan`Point` structuur. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | Retourneert hiervoor een hash-codePoint . |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | Vertaalt ditPoint door de opgegevenPoint . |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | Vertaalt ditPoint met het opgegeven bedrag. |
| override [ToString](../../system.drawing/point/tostring/)() | Converteert de attributen hiervan`Point` naar een voor mensen leesbare string. |
| [operator +](../../system.drawing/point/op_addition/) | Vertaalt een`Point` door een gegeven[`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | Vergelijkt er tweePoint objects. Het resultaat geeft aan of de waarden van deX EnY properties van de tweePoint objecten zijn gelijk. |
| [explicit operator](../../system.drawing/point/op_explicit/) | Creëert een[`Size`](../size/)met de coördinaten van de opgegeven`Point` . |
| [implicit operator](../../system.drawing/point/op_implicit/) | Converteert het gespecificeerdePoint structuur aan eenPointF structuur. |
| [operator !=](../../system.drawing/point/op_inequality/) | Vergelijkt er tweePoint objects. Het resultaat geeft aan of de waarden van deX ofY properties van de tweePoint objecten zijn ongelijk. |
| [operator -](../../system.drawing/point/op_subtraction/) | Vertaalt een`Point` door de ontkenning van een gegeven[`Size`](../size/) . |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | Vertegenwoordigt eenPoint dat heeftX EnY waarden ingesteld op nul. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


