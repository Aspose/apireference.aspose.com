---
title: TopoJsonOptions.Transform
second_title: Riferimento API Aspose.GIS per .NET
description: TopoJsonOptions proprietà. Specifica loggetto di trasformazione da utilizzare per quantizzare le coordinate e la codifica delta degli archi nelloutput TopoJSON.
type: docs
weight: 60
url: /it/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Specifica l'oggetto di trasformazione da utilizzare per quantizzare le coordinate e la codifica delta degli archi nell'output TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Osservazioni

Questa è un'opzione di scrittura - non influisce sulla lettura. Questa opzione si esclude a vicenda con[`QuantizationNumber`](../quantizationnumber/) - solo una di queste due opzioni non può essere`null` . Se non lo è`null` - le coordinate TopoJSON di output sono quantizzate e gli archi sono codificati delta con l'oggetto di trasformazione specificato . Fare riferimento alla specifica TopoJSON per ulteriori dettagli sull'oggetto di trasformazione. Il valore predefinito è`null` .

### Guarda anche

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* assemblea [Aspose.GIS](../../../)


