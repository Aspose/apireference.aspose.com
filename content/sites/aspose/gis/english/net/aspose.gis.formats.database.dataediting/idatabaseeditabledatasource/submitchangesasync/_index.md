---
title: IDatabaseEditableDataSource.SubmitChangesAsync
second_title: Aspose.GIS for .NET API Reference
description: IDatabaseEditableDataSource method. Allows you to save accumulated changes to the database
type: docs
weight: 10
url: /net/aspose.gis.formats.database.dataediting/idatabaseeditabledatasource/submitchangesasync/
---
## IDatabaseEditableDataSource.SubmitChangesAsync method

Allows you to save accumulated changes to the database.

```csharp
public Task SubmitChangesAsync(VectorLayer layer, DbConnection connection, 
    DbTransaction transaction)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | A layer with the ability to track changes. |
| connection | DbConnection | An open connection to the database. |
| transaction | DbTransaction | Transaction |

### Return Value

Task

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException |  |

## Remarks

In case the layer does not have the ability to track changes, an exception will be thrown InvalidOperationException. If the connection is not open, the InvalidOperationException exception will be thrown.

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* interface [IDatabaseEditableDataSource](../)
* namespace [Aspose.Gis.Formats.Database.DataEditing](../../idatabaseeditabledatasource/)
* assembly [Aspose.GIS](../../../)


