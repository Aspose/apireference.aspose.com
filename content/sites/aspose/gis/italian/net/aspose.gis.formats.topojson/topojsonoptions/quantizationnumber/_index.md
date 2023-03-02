---
title: TopoJsonOptions.QuantizationNumber
second_title: Riferimento API Aspose.GIS per .NET
description: TopoJsonOptions proprietà. Specifica il numero di quantizzazione da utilizzare per quantizzare le coordinate e gli archi di codifica delta nelloutput TopoJSON.
type: docs
weight: 50
url: /it/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Specifica il numero di quantizzazione da utilizzare per quantizzare le coordinate e gli archi di codifica delta nell'output TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | L'argomento è minore di due. |

### Osservazioni

Questa è un'opzione di scrittura - non influisce sulla lettura. Questa opzione si esclude a vicenda con[`Transform`](../transform/) - solo una di queste due opzioni non può essere`null` . Se non lo è`null` - le coordinate TopoJSON di output sono quantizzate e gli archi sono codificati delta con il numero di quantizzazione specificato . Il numero di quantizzazione determina il numero massimo di valori esprimibili per dimensione nelle coordinate quantizzate risultanti; in genere viene scelta una potenza di dieci. Il valore predefinito è`null` .

### Guarda anche

* class [TopoJsonOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* assemblea [Aspose.GIS](../../../)


