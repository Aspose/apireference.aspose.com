---
title: IGeometry.Intersection
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Builds an intersection between this geometry and a specified geometry
type: docs
weight: 260
url: /net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

Builds an intersection between this geometry and a specified geometry.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry to compute intersection with. |

### Return Value

A geometry that represents an intersection of this geometry and an argument. The result geometry contain point set that present in both this geometry and an argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *other* is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


