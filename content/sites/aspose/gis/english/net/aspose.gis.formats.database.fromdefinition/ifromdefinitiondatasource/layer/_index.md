---
title: IFromDefinitionDataSource.Layer
second_title: Aspose.GIS for .NET API Reference
description: IFromDefinitionDataSource property. Property that returns an object that implements an IQueryable that allows LINQ queries to be made against a database
type: docs
weight: 10
url: /net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/layer/
---
## IFromDefinitionDataSource.Layer property

Property that returns an object that implements an IQueryable that allows LINQ queries to be made against a database.

```csharp
public IQueryable<Feature> Layer { get; }
```

### Return Value

IQueryable

## Remarks

Further the query can be executed in the standard way via ToArray() or ToList() synchronously, or an asynchronous way with the extraction of the whole layer [`ToVectorLayerAsync`](../../queryablelayerextension/tovectorlayerasync/) can be used.

### See Also

* class [Feature](../../../aspose.gis/feature/)
* interface [IFromDefinitionDataSource](../)
* namespace [Aspose.Gis.Formats.Database.FromDefinition](../../ifromdefinitiondatasource/)
* assembly [Aspose.GIS](../../../)


