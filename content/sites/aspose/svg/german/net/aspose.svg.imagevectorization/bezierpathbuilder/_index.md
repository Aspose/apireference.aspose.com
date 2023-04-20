---
title: Class BezierPathBuilder
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.ImageVectorization.BezierPathBuilder klas. DieSplinePathBuilder Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlichSVGPathSeg aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Verwendung der Methode der kleinsten Quadrate um BezierKontrollpunkte für die Verfolgung von Punkten zu finden.
type: docs
weight: 2080
url: /de/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Die[`SplinePathBuilder`](../splinepathbuilder/) Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlich[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Verwendung der Methode der kleinsten Quadrate, um Bezier-Kontrollpunkte für die Verfolgung von Punkten zu finden.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Initialisiert eine neue Instanz von`BezierPathBuilder` Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Ruft die Fehlerschwelle ab oder setzt sie. Dieser Parameter definiert die maximale Abweichung der Punkte von der angepassten Kurve. Standardmäßig ist sie 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Ruft die Fehlerschwelle ab oder legt sie fest. Dieser Parameter definiert die Anzahl der Iterationen für die Approximationsmethode der kleinsten Quadrate. Standardmäßig ist sie 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Ruft die Spur glatter ab oder stellt sie ein. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Baut Pfadsegmente aus der Liste der Verfolgungspunkte auf. |

### Siehe auch

* interface [IPathBuilder](../ipathbuilder/)
* namensraum [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* Montage [Aspose.SVG](../../)


