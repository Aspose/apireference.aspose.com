---
title: Class BezierPathBuilder
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.ImageVectorization.BezierPathBuilder klass. DenSplinePathBuilder klass ansvarar för att bygga vägsegmentSVGPathSeg från listan över spårpunkter. Denna vägbyggare är baserad på att använda minsta kvadratmetoden för att hitta Bezierkontrollpunkter för spårning av punkter.
type: docs
weight: 2080
url: /sv/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Den[`SplinePathBuilder`](../splinepathbuilder/) klass ansvarar för att bygga vägsegment[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) från listan över spårpunkter. Denna vägbyggare är baserad på att använda minsta kvadratmetoden för att hitta Bezier-kontrollpunkter för spårning av punkter.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Initierar en ny instans av`BezierPathBuilder` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Hämtar eller ställer in feltröskeln. Denna parameter definierar maximal avvikelse för punkter till anpassad kurva. Som standard är den 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Hämtar eller ställer in feltröskeln. Den här parametern definierar antalet iterationer för approximationsmetoden för minsta kvadrater. Som standard är den 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Får eller gör spårningen jämnare. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Bygger bansegment från listan över spårpunkter. |

### Se även

* interface [IPathBuilder](../ipathbuilder/)
* namnutrymme [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* hopsättning [Aspose.SVG](../../)


