---
title: NurbsCurve
second_title: Aspose.3D för .NET API-referens
description: NURBSkurvahttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline är en kurva representerad av NURBSNonuniform rational basis spline En NURBSkurva definieras av dessOrder./nurbscurve/order  en uppsättning av viktadeControlPoints./geometry/controlpoints och aKnotVectors./nurbscurve/knotvectors Wkomponenten i kontrollpunkten används som kontrollpunktens vikt oavsett vad det är enTwoDimensional ellerThreeDimensional
type: docs
weight: 460
url: /sv/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[NURBS-kurva](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) är en kurva representerad av NURBS(Non-uniform rational basis spline), En NURBS-kurva definieras av dess[`Order`](./order) , en uppsättning av viktade[`ControlPoints`](../geometry/controlpoints) och a[`KnotVectors`](./knotvectors) W-komponenten i kontrollpunkten används som kontrollpunktens vikt, oavsett vad det är enTwoDimensional ellerThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Initierar en ny instans av[`NurbsCurve`](../nurbscurve) class. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Initierar en ny instans av[`NurbsCurve`](../nurbscurve) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Hämtar eller ställer in färgen på linjen, standardvärdet är vit(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Får alla kontrollpunkter |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Hämtar eller ställer in typen av kurvan. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Hämtar eller ställer in kurvans dimension. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Hämtar eller ställer in om den här entiteten ska exkluderas under export. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Hämtar knutvektorn, det är en sekvens av parametervärden som bestämmer var och hur kontrollpunkterna påverkar NURBS-kurvan. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Får multipliciteten. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Hämtar eller ställer in ordningen på en NURBS-kurva, den definierar antalet närliggande kontrollpunkter som påverkar en given punkt på kurvan. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Hämtar eller ställer in den första överordnade noden, om den första överordnade noden ställs in, kommer denna enhet att frikopplas från andra överordnade noder. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Hämtar alla överordnade noder, en enhet kan kopplas till flera överordnade noder för geometriinstansering |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Hämtar eller ställer in om det är rationellt, detta värde indikerar om detta[`NurbsCurve`](../nurbscurve) är rationell spline eller icke-rationell spline. Icke-rationell B-spline är ett specialfall av rationell B-splines. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | Utvärdera NURBS-kurvan |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Utvärdera kurvans punkt vid specificerad position |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Hämtar begränsningsrutan för nuvarande entitet i dess objektrymds koordinatsystem. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Hämtar nyckeln till entitetsrenderaren registrerad i renderaren |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |

### Se även

* class [Curve](../curve)
* namnutrymme [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
