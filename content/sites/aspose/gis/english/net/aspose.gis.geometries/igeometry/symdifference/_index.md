---
title: IGeometry.SymDifference
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Builds a symmetric difference between this geometry and a specified geometry.
type: docs
weight: 330
url: /net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

Builds a symmetric difference between this geometry and a specified geometry.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry to compute symmetric difference with. |

### Return Value

A geometry that represents a symmetric difference of this geometry and an argument. The result geometry contains point set that present in one of the geometries but not present in both of them.

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


