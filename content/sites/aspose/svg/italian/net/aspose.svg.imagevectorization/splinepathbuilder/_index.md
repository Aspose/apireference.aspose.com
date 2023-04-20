---
title: Class SplinePathBuilder
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.ImageVectorization.SplinePathBuilder classe. IlSplinePathBuilder class è responsabile della creazione di segmenti di percorsoSVGPathSeg dallelenco dei punti di traccia. Questo costruttore di percorsi si basa sullapplicazione di una spline CatmullRoma a un insieme di punti di percorso smussati e ridotti..
type: docs
weight: 2160
url: /it/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Il`SplinePathBuilder` class è responsabile della creazione di segmenti di percorso[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) dall'elenco dei punti di traccia. Questo costruttore di percorsi si basa sull'applicazione di una spline Catmull-Roma a un insieme di punti di percorso smussati e ridotti..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Inizializza una nuova istanza di`SplinePathBuilder` classe. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Inizializza una nuova istanza di`SplinePathBuilder` classe. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Inizializza una nuova istanza di`SplinePathBuilder` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Il valore delle tensioni influisce sulla curvatura brusca della curva nei punti di controllo (interpolati). Deve essere compreso nell'intervallo da 0 a 1. Eventuali valori superiori o inferiori saranno allineati con i valori minimo e massimo di questo intervallo, di conseguenza. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Ottiene o imposta il semplificatore di traccia. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Ottiene o imposta la traccia più uniforme. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Costruisce segmenti di percorso dall'elenco dei punti di traccia. |

### Guarda anche

* interface [IPathBuilder](../ipathbuilder/)
* spazio dei nomi [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assemblea [Aspose.SVG](../../)


