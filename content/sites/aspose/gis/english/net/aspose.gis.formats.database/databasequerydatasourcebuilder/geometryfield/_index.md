---
title: DatabaseQueryDataSourceBuilder.GeometryField
second_title: Aspose.GIS for .NET API Reference
description: DatabaseQueryDataSourceBuilder method. Configures the name of the field from which the geometry will be extracted
type: docs
weight: 40
url: /net/aspose.gis.formats.database/databasequerydatasourcebuilder/geometryfield/
---
## DatabaseQueryDataSourceBuilder.GeometryField method

Configures the name of the field from which the geometry will be extracted.

```csharp
public DatabaseQueryDataSourceBuilder GeometryField(string name)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of gemetry field. |

### Return Value

[`DatabaseQueryDataSourceBuilder`](../)

## Remarks

Currently supported binary format i.e. on the database side the methods are ST_AsBinary, ST_AsWKB, ST_AsEWKB. And if you use methods other than Extended WKB, which already contains srs id (srid), you should use an additional field with srid information and configure it via [`SridField`](../sridfield/).

### See Also

* class [DatabaseQueryDataSourceBuilder](../)
* namespace [Aspose.Gis.Formats.Database](../../databasequerydatasourcebuilder/)
* assembly [Aspose.GIS](../../../)


