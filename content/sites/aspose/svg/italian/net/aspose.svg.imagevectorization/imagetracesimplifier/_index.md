---
title: Class ImageTraceSimplifier
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.ImageVectorization.ImageTraceSimplifier classe. La classe ImageTraceSimplifier è responsabile della riduzione del numero di punti in una curva che viene approssimata da una serie di punti traccia.
type: docs
weight: 2120
url: /it/net/aspose.svg.imagevectorization/imagetracesimplifier/
---
## ImageTraceSimplifier class

La classe ImageTraceSimplifier è responsabile della riduzione del numero di punti in una curva che viene approssimata da una serie di punti traccia.

```csharp
public class ImageTraceSimplifier : IImageTraceSimplifier
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor)() | Inizializza una nuova istanza di`ImageTraceSimplifier` classe. |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor_1)(float) | Inizializza una nuova istanza di`ImageTraceSimplifier` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Tolerance](../../aspose.svg.imagevectorization/imagetracesimplifier/tolerance/) { get; set; } | Il valore della tolleranza determina la massima tolleranza di errore consentita per eliminare un punto dalla traccia. Deve essere compreso nell'intervallo da 0 a 4. Qualsiasi valore superiore o inferiore sarà allineato con i valori minimo e massimo di questo intervallo, di conseguenza. Il valore predefinito è 0.3. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Simplify](../../aspose.svg.imagevectorization/imagetracesimplifier/simplify/)(IEnumerable&lt;PointF&gt;) | Riduce il numero di punti nell'elenco dei punti di traccia. |

### Guarda anche

* interface [IImageTraceSimplifier](../iimagetracesimplifier/)
* spazio dei nomi [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assemblea [Aspose.SVG](../../)


