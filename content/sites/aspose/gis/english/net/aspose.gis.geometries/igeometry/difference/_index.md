---
title: IGeometry.Difference
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Subtracts a specified geometry from this geometry.
type: docs
weight: 170
url: /net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


