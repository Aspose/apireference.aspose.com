---
title: DatabaseQueryDataSourceBuilder.AsTrackableForChanges
second_title: Aspose.GIS for .NET API Reference
description: DatabaseQueryDataSourceBuilder method. Configure the resulting layer to track changes and create a data source to synchronize the changes made
type: docs
weight: 20
url: /net/aspose.gis.formats.database/databasequerydatasourcebuilder/astrackableforchanges/
---
## DatabaseQueryDataSourceBuilder.AsTrackableForChanges method

Configure the resulting layer to track changes and create a data source to synchronize the changes made.

```csharp
public DatabaseEditableDataSourceBuilder AsTrackableForChanges(string tableName, 
    string identityAttribute, bool overwriteSameKey = false, string dbFunc = "ST_GeomFromWKB")
```

| Parameter | Type | Description |
| --- | --- | --- |
| tableName | String | The name of the table where the changes will be made. |
| identityAttribute | String | An attribute of a feature that will be treated as uniquely identifying the feature. |
| overwriteSameKey | Boolean | If this flag is set to true, then newly added features with a unique identifier the same that is already present in the layer, the current one will be overwritten, and the data will be read as updated if differences are found. |
| dbFunc | String | Function that will be supplied in SQL query to transform binary data into geographic data representation of the current database. |

### Return Value

[`DatabaseEditableDataSourceBuilder`](../../../aspose.gis.formats.database.dataediting/databaseeditabledatasourcebuilder/)

### See Also

* class [DatabaseEditableDataSourceBuilder](../../../aspose.gis.formats.database.dataediting/databaseeditabledatasourcebuilder/)
* class [DatabaseQueryDataSourceBuilder](../)
* namespace [Aspose.Gis.Formats.Database](../../databasequerydatasourcebuilder/)
* assembly [Aspose.GIS](../../../)


