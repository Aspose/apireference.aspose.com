---
title: Class SplinePathBuilder
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.ImageVectorization.SplinePathBuilder klas. DeSplinePathBuilder class is verantwoordelijk voor het bouwen van padsegmentenSVGPathSeg uit de lijst met traceerpunten. Deze padbouwer is gebaseerd op het toepassen van een CatmullRomaspline op een reeks afgevlakte en gereduceerde padpunten..
type: docs
weight: 2160
url: /nl/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

De`SplinePathBuilder` class is verantwoordelijk voor het bouwen van padsegmenten[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) uit de lijst met traceerpunten. Deze padbouwer is gebaseerd op het toepassen van een Catmull-Roma-spline op een reeks afgevlakte en gereduceerde padpunten..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initialiseert een nieuw exemplaar van het`SplinePathBuilder` klasse. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Initialiseert een nieuw exemplaar van het`SplinePathBuilder` klasse. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Initialiseert een nieuw exemplaar van het`SplinePathBuilder` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | De waarde van de spanningen beïnvloedt hoe scherp de curve buigt bij de (geïnterpoleerde) controlepunten. Deze moet in het bereik van 0 tot 1 liggen. Hogere of lagere waarden worden uitgelijnd met de minimum- en maximumwaarden van dit bereik, dienovereenkomstig. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Haalt de traceervereenvoudiger op of stelt deze in. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Krijgt of stelt de trace vloeiender in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Bouwt padsegmenten op uit de lijst met traceerpunten. |

### Zie ook

* interface [IPathBuilder](../ipathbuilder/)
* naamruimte [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* montage [Aspose.SVG](../../)


