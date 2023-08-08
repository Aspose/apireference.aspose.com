---
title: SqlServerDriver.OpenDataset
second_title: Aspose.GIS for .NET API Reference
description: SqlServerDriver method. Opens the dataset
type: docs
weight: 10
url: /net/aspose.gis.formats.sqlserver/sqlserverdriver/opendataset/
---
## SqlServerDriver.OpenDataset method

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
* class [SqlServerDriver](../)
* namespace [Aspose.Gis.Formats.SqlServer](../../sqlserverdriver/)
* assembly [Aspose.GIS](../../../)


