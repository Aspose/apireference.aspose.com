---
title: TopoJsonOptions.DefaultObjectName
second_title: Riferimento API Aspose.GIS per .NET
description: TopoJsonOptions proprietà. Nome delloggetto in cui vengono inserite le funzionalità per impostazione predefinita.
type: docs
weight: 20
url: /it/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Nome dell'oggetto in cui vengono inserite le funzionalità per impostazione predefinita.

```csharp
public string DefaultObjectName { get; set; }
```

### Osservazioni

Questa è un'opzione di scrittura: non influisce sulla lettura. TopoJSON può contenere un numero qualsiasi di oggetti denominati. Ogni oggetto di questo tipo può contenere più caratteristiche. Per specificare in quale oggetto inserire la tua caratteristica, usa [`ObjectNameAttribute`](../objectnameattribute/) property. Se attributo con nome[`ObjectNameAttribute`](../objectnameattribute/) È`null` non impostato per alcune funzionalità, questa funzionalità viene aggiunta all'oggetto con il nome`DefaultObjectName` . Se attributo con nome[`ObjectNameAttribute`](../objectnameattribute/) non è presente in[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) raccolta, tutte le funzionalità vengono inserite nell'oggetto con nome[`ObjectNameAttribute`](../objectnameattribute/) . Il valore predefinito è "senza nome".

### Guarda anche

* class [TopoJsonOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* assemblea [Aspose.GIS](../../../)


