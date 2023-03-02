---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbCoordinatePrecisionGrid proprietà. Ottiene o imposta la scala delle coordinate X e Y. Se impostato sunull viene utilizzato il valore predefinito.
type: docs
weight: 60
url: /it/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Ottiene o imposta la scala delle coordinate X e Y. Se impostato su`null` viene utilizzato il valore predefinito.

```csharp
public double? XYScale { get; set; }
```

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | L'argomentazione non è positiva. |

### Osservazioni

Il valore predefinito è`1e9` per[`VectorLayer`](../../../aspose.gis/vectorlayer/)con geografico[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) e`Scala XYS = 1 / Tolleranza XY * 10` per[`VectorLayer`](../../../aspose.gis/vectorlayer/) con proiettato[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Guarda anche

* class [FileGdbCoordinatePrecisionGrid](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* assemblea [Aspose.GIS](../../../)


