---
title: PostGisDriver.OpenDataset
second_title: Aspose.GIS for .NET API Reference
description: PostGisDriver method. Opens the dataset
type: docs
weight: 30
url: /net/aspose.gis.formats.postgis/postgisdriver/opendataset/
---
## PostGisDriver.OpenDataset method

Opens the dataset.

```csharp
public override Dataset OpenDataset(IDbConnection connection)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | IDbConnection | Opened connection to the database. |

### Return Value

An instance of [`Dataset`](../../../aspose.gis/dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The connection is `null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [PostGisDriver](../)
* namespace [Aspose.Gis.Formats.PostGis](../../postgisdriver/)
* assembly [Aspose.GIS](../../../)


