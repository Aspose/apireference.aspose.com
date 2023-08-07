---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS for .NET API Reference
description: MultiSurface method. Gets approximate or equivalent noncurve version of this geometry using the default tolerance
type: docs
weight: 60
url: /net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`.

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Return Value

A [`IMultiPolygon`](../../imultipolygon/) that approximates or equivalent to this [`IMultiSurface`](../../imultisurface/). This is the equivalent of [`ToLinearGeometry`](../../imultisurface/tolineargeometry/) with default `tolerance`. Default `tolerance`s value is dependent on [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) of this geometry:  For projected SRS Tolerance is 0.001 meters (in SRS units)  For geographic SRS Tolerance is `1e-5` degrees (in SRS units)  For unknown SRS Tolerance is `1e-5` For more details on what transformations are applied refer to [`ToLinearGeometry`](../../imultisurface/tolineargeometry/) specification.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* namespace [Aspose.Gis.Geometries](../../multisurface/)
* assembly [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`.

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Type | Description |
| --- | --- | --- |
| tolerance | Double | The `tolerance` to use. The result is guaranteed to be less than `tolerance` away from the curved geometry, unless the number of points needed to linearize the geometry exceeds the per-quadrant maximum, currently equal to 10000 points. |

### Return Value

A [`IMultiPolygon`](../../imultipolygon/) that approximates or equivalent to this [`IMultiSurface`](../../imultisurface/):  If this object is [`IMultiPolygon`](../../imultipolygon/) itself the result is equivalent to this object If this object is not [`IMultiPolygon`](../../imultipolygon/) - all surfaces are linearized and new `IMultiPolygon` is created

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | `tolerance` is less than or equal to `0`. |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* namespace [Aspose.Gis.Geometries](../../multisurface/)
* assembly [Aspose.GIS](../../../)


