---
title: Class LayeredSymbolizer
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer classe. Un simbolo che rende molti altri simboli.
type: docs
weight: 1830
url: /it/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

Un simbolo che rende molti altri simboli.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Crea una nuova istanza. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Ottiene il numero di simboli. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Ottiene il simbolo in corrispondenza dell'indice specificato. |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Determina l'ordine di rendering. ByFeatures - esegue il rendering di tutti i simboli per l'elemento, quindi passa all'elemento successivo.ByLayers - renderizza tutte le feature con il simbolizzatore, quindi procedi al simbolizzatore successivo. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Aggiunge il simbolo specificato. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Restituisce un enumeratore che scorre la raccolta. |

### Guarda anche

* class [VectorSymbolizer](../vectorsymbolizer/)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assemblea [Aspose.GIS](../../)


