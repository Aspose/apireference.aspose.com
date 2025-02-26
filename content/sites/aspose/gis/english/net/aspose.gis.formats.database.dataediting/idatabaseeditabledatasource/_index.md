---
title: Interface IDatabaseEditableDataSource
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Database.DataEditing.IDatabaseEditableDataSource interface. The object that implements this interface has the ability to accept a layer with the ability to track changes and save them to the database
type: docs
weight: 1720
url: /net/aspose.gis.formats.database.dataediting/idatabaseeditabledatasource/
---
## IDatabaseEditableDataSource interface

The object that implements this interface has the ability to accept a layer with the ability to track changes and save them to the database.

```csharp
public interface IDatabaseEditableDataSource : IDatabaseDataSource
```

## Methods

| Name | Description |
| --- | --- |
| [SubmitChangesAsync](../../aspose.gis.formats.database.dataediting/idatabaseeditabledatasource/submitchangesasync/)(VectorLayer, DbConnection, DbTransaction) | Allows you to save accumulated changes to the database. |

## Remarks

To get a trackable layer, it is need to call the [`AsTrackableForChanges`](../../aspose.gis.formats.database/databasequerydatasourcebuilder/astrackableforchanges/) when configuring the data source and then retrieve the layer via [`ReadAsync`](../../aspose.gis.formats.database/idatabasedatasource/readasync/).

### See Also

* interface [IDatabaseDataSource](../../aspose.gis.formats.database/idatabasedatasource/)
* namespace [Aspose.Gis.Formats.Database.DataEditing](../../aspose.gis.formats.database.dataediting/)
* assembly [Aspose.GIS](../../)


