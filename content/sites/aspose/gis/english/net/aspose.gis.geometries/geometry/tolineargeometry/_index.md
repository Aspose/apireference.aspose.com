---
title: Geometry.ToLinearGeometry
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Gets approximate or equivalent noncurve version of this geometry using the default tolerance.
type: docs
weight: 400
url: /net/aspose.gis.geometries/geometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`.

```csharp
public IGeometry ToLinearGeometry()
```

### Return Value

A geometry that has no curve geometries. This is the equivalent of [`ToLinearGeometry`](../../igeometry/tolineargeometry/) with default `tolerance`. Default `tolerance` is defined by [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of this geometry:  For projected SRS Tolerance is 0.001 meters (in SRS units)  For geographic SRS Tolerance is `1e-5` degrees (in SRS units)  For unknown SRS Tolerance is `1e-5` For more details on what transformations are applied refer to [`ToLinearGeometry`](../../igeometry/tolineargeometry/) specification.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`.

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Parameter | Type | Description |
| --- | --- | --- |
| tolerance | Double | The `tolerance` to use. The result is guaranteed to be less than `tolerance` away from the curved geometry, unless the number of points needed to linearize the geometry exceeds the per-quadrant maximum which is currently equal to 10000 points. |

### Return Value

A geometry, that has no curve geometries. The following transformations are applied: CircularStrings are linearized (transformed into LineStrings with specified *tolerance*) CompoundCurves are joined into `LineString`s CurvePolygons are transformed into Polygons MultiCurves are transformed into MultiLineStrings MultiSurfaces are transformed into MultiPolygons  As a result, [`HasCurveGeometry`](../../igeometry/hascurvegeometry/) of output geometry is `false`.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | `tolerance` is less than or equal to `0`. |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


