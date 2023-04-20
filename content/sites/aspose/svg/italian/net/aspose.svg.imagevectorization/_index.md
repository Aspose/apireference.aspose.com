---
title: Aspose.Svg.ImageVectorization
second_title: Riferimento API Aspose.SVG per .NET
description: Il Aspose.Svg.ImageVectorizationnamespace contiene classi per vettorializzare immagini raster e convertirle in documenti SVG. Questo processo comporta la riduzione di bitmap in forme geometriche composte da elementi di tracciato e la loro memorizzazione come SVG. Lo spazio dei nomi include classi per costruire segmenti di tracciato semplificare e uniformare i punti di traccia e configurazione delle opzioni di vettorizzazione.
type: docs
weight: 170
url: /it/net/aspose.svg.imagevectorization/
---
Il **Aspose.Svg.ImageVectorization**namespace contiene classi per vettorializzare immagini raster e convertirle in documenti SVG. Questo processo comporta la riduzione di bitmap in forme geometriche composte da elementi di tracciato e la loro memorizzazione come SVG. Lo spazio dei nomi include classi per costruire segmenti di tracciato, semplificare e uniformare i punti di traccia, e configurazione delle opzioni di vettorizzazione.

## Classi

| Classe | Descrizione |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | Il[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) class è responsabile della creazione di segmenti di percorso[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) dall'elenco dei punti di traccia. Questo costruttore di percorsi si basa sull'utilizzo del metodo dei minimi quadrati per trovare i punti di controllo di Bezier per la traccia dei punti. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | La classe ImageTraceSimplifier è responsabile della riduzione del numero di punti in una curva che viene approssimata da una serie di punti traccia. |
| [ImageTraceSmoother](./imagetracesmoother/) | La classe ImageTraceSimplifier è responsabile dell'uniformità del numero di punti in una curva approssimata da una serie di punti traccia. Questa classe implementa l'approccio del vicino più vicino. |
| [ImageVectorizer](./imagevectorizer/) | Questa classe ImageVectorizer vettorializza immagini raster come PNG, JPG, GIF, BMP e così via... e restituisce SVGDocument. Per vettorizzazione si intende il processo di riduzione delle bitmap a forme geometriche composte da elementi di tracciato e memorizzate come SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | Il[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) class definisce una configurazione di metodi e opzioni di vettorizzazione delle immagini. La configurazione viene utilizzata per inizializzare un ImageVectorizer e fornisce le opzioni di configurazione per la vettorializzazione delle immagini. |
| [SplinePathBuilder](./splinepathbuilder/) | Il[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) class è responsabile della creazione di segmenti di percorso[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) dall'elenco dei punti di traccia. Questo costruttore di percorsi si basa sull'applicazione di una spline Catmull-Roma a un insieme di punti di percorso smussati e ridotti.. |
| [StencilConfiguration](./stencilconfiguration/) | Il[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) class definisce una configurazione delle opzioni dell'effetto stencil. |
## Interfacce

| Interfaccia | Descrizione |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | L'interfaccia IImageTraceSimplifier è responsabile della riduzione dei punti nella traccia. |
| [IImageTraceSmoother](./iimagetracesmoother/) | L'interfaccia IImageTraceSmoother è responsabile del livellamento della traccia. |
| [IPathBuilder](./ipathbuilder/) | L'interfaccia IPathBuilder è responsabile della creazione di segmenti di percorso[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) dall'elenco dei punti di traccia. |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [StencilType](./stenciltype/) | Il[`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum definisce i tipi di stencil. |


