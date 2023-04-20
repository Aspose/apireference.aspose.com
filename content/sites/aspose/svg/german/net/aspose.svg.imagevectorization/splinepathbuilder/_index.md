---
title: Class SplinePathBuilder
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.ImageVectorization.SplinePathBuilder klas. DieSplinePathBuilder Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlichSVGPathSeg aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Anwendung eines CatmullRomaSplines auf eine Reihe geglätteter und reduzierter Pfadpunkte..
type: docs
weight: 2160
url: /de/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Die`SplinePathBuilder` Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlich[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Anwendung eines Catmull-Roma-Splines auf eine Reihe geglätteter und reduzierter Pfadpunkte..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initialisiert eine neue Instanz von`SplinePathBuilder` Klasse. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Initialisiert eine neue Instanz von`SplinePathBuilder` Klasse. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Initialisiert eine neue Instanz von`SplinePathBuilder` Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Der Wert der Spannungen beeinflusst, wie stark die Kurve an den (interpolierten) Kontrollpunkten krümmt. Er muss im Bereich von 0 bis 1 liegen. Jegliche höheren oder niedrigeren Werte werden an den minimalen und maximalen Werten dieses Bereichs ausgerichtet, entsprechend. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Ruft den Trace-Vereinfacher ab oder legt ihn fest. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Ruft die Spur glatter ab oder stellt sie ein. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Baut Pfadsegmente aus der Liste der Verfolgungspunkte auf. |

### Siehe auch

* interface [IPathBuilder](../ipathbuilder/)
* namensraum [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* Montage [Aspose.SVG](../../)


