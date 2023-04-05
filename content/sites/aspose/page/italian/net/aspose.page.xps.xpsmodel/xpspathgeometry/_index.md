---
title: Class XpsPathGeometry
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry classe. Classe che incapsula le caratteristiche dellelemento di proprietà PathGeometry. Questo elemento contiene un insieme di figure di percorso specificate con lattributo Figures o con un elemento PathFigure figlio.
type: docs
weight: 3270
url: /it/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Classe che incapsula le caratteristiche dell'elemento di proprietà PathGeometry. Questo elemento contiene un insieme di figure di percorso specificate con l'attributo Figures o con un elemento PathFigure figlio.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Restituisce/imposta il valore specificando come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Restituisce l'elenco delle figure del percorso figlio. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Restituisce/imposta la matrice di trasformazione affine che stabilisce la trasformazione della matrice locale che viene applicata a tutti gli elementi figli e discendenti della geometria del percorso prima che venga utilizzata per il riempimento, il ritaglio o la tracciatura. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Aggiunge un segmento di percorso all'elenco dei segmenti figlio dell'ultima figura pah. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Clona questa geometria del percorso. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Inserisce un segmento di percorso nell'elenco dei segmenti figli di l'ultima figura di percorso in*index* posizione. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Rimuove un segmento di percorso dall'elenco dei segmenti figli dell'ultima figura di percorso. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Rimuove un segmento di percorso dall'elenco dei segmenti figli di l'ultima figura di percorso in*index* posizione. |

### Guarda anche

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* spazio dei nomi [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assemblea [Aspose.Page](../../)


