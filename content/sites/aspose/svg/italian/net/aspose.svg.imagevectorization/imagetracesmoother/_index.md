---
title: Class ImageTraceSmoother
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.ImageVectorization.ImageTraceSmoother classe. La classe ImageTraceSimplifier è responsabile delluniformità del numero di punti in una curva approssimata da una serie di punti traccia. Questa classe implementa lapproccio del vicino più vicino.
type: docs
weight: 2130
url: /it/net/aspose.svg.imagevectorization/imagetracesmoother/
---
## ImageTraceSmoother class

La classe ImageTraceSimplifier è responsabile dell'uniformità del numero di punti in una curva approssimata da una serie di punti traccia. Questa classe implementa l'approccio del vicino più vicino.

```csharp
public class ImageTraceSmoother : IImageTraceSmoother
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageTraceSmoother](imagetracesmoother/#constructor)() | Inizializza una nuova istanza di`ImageTraceSmoother` classe. |
| [ImageTraceSmoother](imagetracesmoother/#constructor_1)(int) | Inizializza una nuova istanza di`ImageTraceSmoother` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Extent](../../aspose.svg.imagevectorization/imagetracesmoother/extent/) { get; set; } | Ottiene l'estensione degli insiemi della regione considerata dal punto di interrogazione. Deve essere compreso nell'intervallo da 1 a 20. Eventuali valori superiori o inferiori verranno allineati con i valori minimo e massimo di questo intervallo, di conseguenza. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [Smooth](../../aspose.svg.imagevectorization/imagetracesmoother/smooth/)(IEnumerable&lt;PointF&gt;) | Leviga la traccia. |

### Guarda anche

* interface [IImageTraceSmoother](../iimagetracesmoother/)
* spazio dei nomi [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assemblea [Aspose.SVG](../../)


