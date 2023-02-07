---
title: NurbsCurve
second_title: Aspose.3D voor .NET API-referentie
description: NURBScurvehttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline is een curve voorgesteld door NURBSNonuniform rational basis spline Een NURBScurve wordt gedefinieerd door zijnOrder./nurbscurve/order/  een set van gewogenControlPoints./geometry/controlpoints/ en eenKnotVectors./nurbscurve/knotvectors/ De wcomponent in het controlepunt wordt gebruikt als het gewicht van het controlepunt wat het ook isTwoDimensional ofThreeDimensional
type: docs
weight: 460
url: /nl/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[NURBS-curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) is een curve voorgesteld door NURBS(Non-uniform rational basis spline), Een NURBS-curve wordt gedefinieerd door zijn[`Order`](./order/) , een set van gewogen[`ControlPoints`](../geometry/controlpoints/) en een[`KnotVectors`](./knotvectors/) De w-component in het controlepunt wordt gebruikt als het gewicht van het controlepunt, wat het ook isTwoDimensional ofThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [NurbsCurve](nurbscurve/#constructor)() | Initialiseert een nieuw exemplaar van het`NurbsCurve` klasse. |
| [NurbsCurve](nurbscurve/#constructor_1)(string) | Initialiseert een nieuw exemplaar van het`NurbsCurve` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Haalt of stelt de kleur van de lijn in, standaardwaarde is wit(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints/) { get; } | Krijgt alle controlepunten |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype/) { get; set; } | Hiermee wordt het type curve opgehaald of ingesteld. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension/) { get; set; } | Haalt of stelt de dimensie van de curve in. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Haalt op of stelt in of deze entiteit moet worden uitgesloten tijdens het exporteren. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors/) { get; } | Haalt de knoopvector op, het is een reeks parameterwaarden die bepaalt waar en hoe de controlepunten de NURBS-curve beïnvloeden. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity/) { get; } | Krijgt de veelvoud. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [Order](../../aspose.threed.entities/nurbscurve/order/) { get; set; } | Haalt of stelt de volgorde van een NURBS-curve in, het definieert het aantal controlepunten in de buurt dat een bepaald punt op de curve beïnvloedt. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Haalt of stelt het eerste bovenliggende knooppunt in. Als het eerste bovenliggende knooppunt wordt ingesteld, wordt deze entiteit losgekoppeld van andere bovenliggende knooppunten. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Haalt alle bovenliggende knooppunten op, een entiteit kan worden gekoppeld aan meerdere bovenliggende knooppunten voor geometrie-instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational/) { get; set; } | Krijgt of stelt in of het rationeel is, deze waarde geeft aan of dit`NurbsCurve` is rationele spline of niet-rationele spline. Niet-rationele B-spline is een speciaal geval van rationele B-splines. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate/)(int) | Evalueer de NURBS-curve |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat/)(double) | Evalueer het punt van de curve op de gespecificeerde positie |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Haalt het begrenzingskader op van de huidige entiteit in het coördinatensysteem van de objectruimte. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Haalt de sleutel op van de entiteitsrenderer die is geregistreerd in de renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |

### Zie ook

* class [Curve](../curve/)
* naamruimte [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
