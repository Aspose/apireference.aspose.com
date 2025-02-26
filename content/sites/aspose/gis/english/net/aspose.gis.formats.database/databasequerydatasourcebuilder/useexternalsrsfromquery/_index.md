---
title: DatabaseQueryDataSourceBuilder.UseExternalSrsFromQuery
second_title: Aspose.GIS for .NET API Reference
description: DatabaseQueryDataSourceBuilder method. Allows you to configure the data source to use thirdparty spatial reference system data bypassing the preinstalled data in the Aspose.GIS library
type: docs
weight: 60
url: /net/aspose.gis.formats.database/databasequerydatasourcebuilder/useexternalsrsfromquery/
---
## DatabaseQueryDataSourceBuilder.UseExternalSrsFromQuery method

Allows you to configure the data source to use third-party spatial reference system data, bypassing the pre-installed data in the Aspose.GIS library.

```csharp
public DatabaseExternalSrsSettingsBuilder UseExternalSrsFromQuery(string srsQuery)
```

| Parameter | Type | Description |
| --- | --- | --- |
| srsQuery | String | Query to retrieve information about additional spatial coordinate systems used in the main query to retrieve features. |

### Return Value

[`DatabaseExternalSrsSettingsBuilder`](../../databaseexternalsrssettingsbuilder/)

## Remarks

It is important to know that in case of absence in the list of spatial reference systems extracted in advance from the database but used in the main query, the library will try to use the built-in srs. The query example: SELECT auth_srid, srtext FROM spatial_ref_sys WHERE srid = 4284

### See Also

* class [DatabaseExternalSrsSettingsBuilder](../../databaseexternalsrssettingsbuilder/)
* class [DatabaseQueryDataSourceBuilder](../)
* namespace [Aspose.Gis.Formats.Database](../../databasequerydatasourcebuilder/)
* assembly [Aspose.GIS](../../../)


