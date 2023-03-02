---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbOptions proprietà. Indica se le coordinate devono essere comprese in un intervallo valido.
type: docs
weight: 30
url: /it/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

Indica se le coordinate devono essere comprese in un intervallo valido.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### Osservazioni

Questa è un'opzione di creazione e non influisce sulla lettura. Se impostata su`true` verrà generata un'eccezione al tentativo di scrivere una coordinata con valori fuori dall'intervallo valido. Se impostato su`false` tale coordinata verrà scritta silenziosamente. L'intervallo valido è definito da[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . Fare riferimento a[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) documentazione da leggere su come l'intervallo valido viene determinato dalla griglia di precisione delle coordinate. L'impostazione predefinita è`false` .

### Guarda anche

* class [FileGdbOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assemblea [Aspose.GIS](../../../)


