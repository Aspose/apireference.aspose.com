---
title: Geometry.Difference
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Subtracts a specified geometry from this geometry.
type: docs
weight: 180
url: /net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

Subtracts a specified geometry from this geometry.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry to subtract. |

### Return Value

A geometry that represents a difference of this geometry and an argument. The result geometry contains point set that present in this geometry but not present in an argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *other* is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


