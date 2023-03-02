---
title: FileGdbOptions.XYTolerance
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbOptions proprietà. Tolleranza di aggancio X e Y.
type: docs
weight: 70
url: /it/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

Tolleranza di aggancio X e Y.

```csharp
public double? XYTolerance { get; set; }
```

### Osservazioni

Questa è un'opzione di creazione e non influisce sulla lettura. Questo parametro controlla una tolleranza di aggancio utilizzata per le funzionalità avanzate di ArcGIS. Non influisce sul comportamento di Aspose.GIS, ma può essere utilizzato da ArcGIS. L'unità del parametro è l'unità del sistema di riferimento spaziale. Se impostato su`null` viene utilizzato il valore predefinito. Il valore predefinito dipende dal sistema di riferimento spaziale ed è uguale a 0,000000008983153 gradi per i sistemi geografici o 0,001 metri per i sistemi proiettati (i valori vengono trasformati in unità del sistema di riferimento spaziale). Se il sistema di riferimento spaziale è sconosciuto, il valore predefinito è 0,001.

### Guarda anche

* class [FileGdbOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assemblea [Aspose.GIS](../../../)


