---
title: Class BezierPathBuilder
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.ImageVectorization.BezierPathBuilder classe. IlSplinePathBuilder class è responsabile della creazione di segmenti di percorsoSVGPathSeg dallelenco dei punti di traccia. Questo costruttore di percorsi si basa sullutilizzo del metodo dei minimi quadrati per trovare i punti di controllo di Bezier per la traccia dei punti.
type: docs
weight: 2080
url: /it/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Il[`SplinePathBuilder`](../splinepathbuilder/) class è responsabile della creazione di segmenti di percorso[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) dall'elenco dei punti di traccia. Questo costruttore di percorsi si basa sull'utilizzo del metodo dei minimi quadrati per trovare i punti di controllo di Bezier per la traccia dei punti.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Inizializza una nuova istanza di`BezierPathBuilder` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Ottiene o imposta la soglia di errore. Questo parametro definisce la deviazione massima dei punti rispetto alla curva adattata. Per impostazione predefinita è 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Ottiene o imposta la soglia di errore. Questo parametro definisce il numero di iterazioni per il metodo di approssimazione dei minimi quadrati. Per impostazione predefinita è 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Ottiene o imposta la traccia più uniforme. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Costruisce segmenti di percorso dall'elenco dei punti di traccia. |

### Guarda anche

* interface [IPathBuilder](../ipathbuilder/)
* spazio dei nomi [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assemblea [Aspose.SVG](../../)


