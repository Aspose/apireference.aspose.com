---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Determines whether this geometry spatially contains a specified geometry
type: docs
weight: 310
url: /net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

Determines whether this geometry spatially contains a specified geometry.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |

### Return Value

`true` if this geometry is "spatially contains" another geometry. `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

## Remarks

This method tests whether one geometry contains another in terms of DE-9IM intersection matrix. This method is equivalent to:

```csharp
other.Within(this);
```

### See Also

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


