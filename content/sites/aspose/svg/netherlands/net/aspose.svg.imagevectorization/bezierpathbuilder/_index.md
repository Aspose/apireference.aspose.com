---
title: Class BezierPathBuilder
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.ImageVectorization.BezierPathBuilder klas. DeSplinePathBuilder class is verantwoordelijk voor het bouwen van padsegmentenSVGPathSeg uit de lijst met traceerpunten. Deze padbouwer is gebaseerd op het gebruik van de methode van de kleinste kwadraten om Béziercontrolepunten te vinden voor het traceren van punten.
type: docs
weight: 2080
url: /nl/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

De[`SplinePathBuilder`](../splinepathbuilder/) class is verantwoordelijk voor het bouwen van padsegmenten[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) uit de lijst met traceerpunten. Deze padbouwer is gebaseerd op het gebruik van de methode van de kleinste kwadraten om Bézier-controlepunten te vinden voor het traceren van punten.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Initialiseert een nieuw exemplaar van het`BezierPathBuilder` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Haalt de foutdrempel op of stelt deze in. Deze parameter definieert de maximale afwijking van punten ten opzichte van de aangepaste curve. Standaard is deze 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Haalt de foutdrempel op of stelt deze in. Deze parameter definieert het aantal iteraties voor de benaderingsmethode met de kleinste kwadraten. Standaard is dit 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Krijgt of stelt de trace vloeiender in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Bouwt padsegmenten op uit de lijst met traceerpunten. |

### Zie ook

* interface [IPathBuilder](../ipathbuilder/)
* naamruimte [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* montage [Aspose.SVG](../../)


