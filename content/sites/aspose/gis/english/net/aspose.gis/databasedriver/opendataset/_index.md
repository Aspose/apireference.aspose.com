---
title: DatabaseDriver.OpenDataset
second_title: Aspose.GIS for .NET API Reference
description: DatabaseDriver method. Opens the dataset.
type: docs
weight: 10
url: /net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Opens the dataset.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | IDbConnection | Opened connection to the database. |

### Return Value

An instance of [`Dataset`](../../dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The connection is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* namespace [Aspose.Gis](../../databasedriver/)
* assembly [Aspose.GIS](../../../)


