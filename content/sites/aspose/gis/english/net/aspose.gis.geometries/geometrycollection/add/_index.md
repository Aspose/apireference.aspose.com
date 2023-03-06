---
title: GeometryCollection.Add
second_title: Aspose.GIS for .NET API Reference
description: GeometryCollection method. Adds the specified geometry to the collection.
type: docs
weight: 110
url: /net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Adds the specified geometry to the collection.

```csharp
public void Add(IGeometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | The geometry to add. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |
| ArgumentException | The collection does not accept geometries of this type. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of this geometry and [`SpatialReferenceSystem`](../spatialreferencesystem/) of argument are both not `null` and don't equal to each other. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* namespace [Aspose.Gis.Geometries](../../geometrycollection/)
* assembly [Aspose.GIS](../../../)


