---
title: Class SplinePathBuilder
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.ImageVectorization.SplinePathBuilder klass. DenSplinePathBuilder klass ansvarar för att bygga vägsegmentSVGPathSeg från listan över spårpunkter. Denna banbyggare är baserad på att applicera en CatmullRoma spline på en uppsättning utjämnade och reducerade banpunkter..
type: docs
weight: 2160
url: /sv/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Den`SplinePathBuilder` klass ansvarar för att bygga vägsegment[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) från listan över spårpunkter. Denna banbyggare är baserad på att applicera en Catmull-Roma spline på en uppsättning utjämnade och reducerade banpunkter..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initierar en ny instans av`SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Initierar en ny instans av`SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Initierar en ny instans av`SplinePathBuilder` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Värdet på spänningarna påverkar hur skarpt kurvan böjs vid de (interpolerade) kontrollpunkterna. Det måste vara i intervallet från 0 till 1. Eventuella högre eller lägre värden kommer att anpassas till minimi- och maximivärdena för detta område, i enlighet därmed. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Hämtar eller ställer in spårningsförenklaren. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Får eller gör spårningen jämnare. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Bygger bansegment från listan över spårpunkter. |

### Se även

* interface [IPathBuilder](../ipathbuilder/)
* namnutrymme [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* hopsättning [Aspose.SVG](../../)


