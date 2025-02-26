---
title: Interface IFromDefinitionDataSource
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Database.FromDefinition.IFromDefinitionDataSource interface. Provide the ability to read geospatial data from the database through LINQ and update them
type: docs
weight: 1770
url: /net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/
---
## IFromDefinitionDataSource interface

Provide the ability to read geospatial data from the database through LINQ and update them.

```csharp
public interface IFromDefinitionDataSource
```

## Properties

| Name | Description |
| --- | --- |
| [Layer](../../aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/layer/) { get; } | Property that returns an object that implements an IQueryable that allows LINQ queries to be made against a database. |

## Methods

| Name | Description |
| --- | --- |
| [GetEmptyLayer](../../aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/getemptylayer/)() | Allows to create an empty layer. This can be useful when just adding a new record to the database. But later the layer can be used to edit newly added records. |
| [SubmitChangesAsync](../../aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/submitchangesasync/)() | Allows to save the change accumulated in the last extracted layer. |
| [UseConnection](../../aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/useconnection/)(DbConnection) | Mandatory configuration, current connection. |
| [UseTransaction](../../aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/usetransaction/)(DbTransaction) | Not a mandatory setting, in case it is necessary to perform a set of operations within a transaction. |

### See Also

* namespace [Aspose.Gis.Formats.Database.FromDefinition](../../aspose.gis.formats.database.fromdefinition/)
* assembly [Aspose.GIS](../../)


