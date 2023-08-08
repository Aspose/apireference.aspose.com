---
title: IMultiCurve.ToLinearGeometry
second_title: Aspose.GIS for .NET API Reference
description: IMultiCurve method. Gets approximate or equivalent noncurve version of this geometry using the default tolerance
type: docs
weight: 20
url: /net/aspose.gis.geometries/imulticurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`.

```csharp
public IMultiLineString ToLinearGeometry()
```

### Return Value

A [`IMultiLineString`](../../imultilinestring/) that approximates or equivalent to this [`IMultiCurve`](../). This is the equivalent of `ToLinearGeometry` with default `tolerance`. Default `tolerance`s value is dependent on [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) of this geometry:  For projected SRS Tolerance is 0.001 meters (in SRS units)  For geographic SRS Tolerance is `1e-5` degrees (in SRS units)  For unknown SRS Tolerance is `1e-5` For more details on what transformations are applied refer to `ToLinearGeometry` specification.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* namespace [Aspose.Gis.Geometries](../../imulticurve/)
* assembly [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`.

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Parameter | Type | Description |
| --- | --- | --- |
| tolerance | Double | The `tolerance` to use. The result is guaranteed to be less than `tolerance` away from the curved geometry, unless the number of points needed to linearize the geometry exceeds the per-quadrant maximum, currently equal to 10000 points. |

### Return Value

A [`IMultiLineString`](../../imultilinestring/) that approximates or equivalent to this [`IMultiCurve`](../):  If this object is [`IMultiLineString`](../../imultilinestring/) itself the result is equivalent to this object If this object is not [`IMultiLineString`](../../imultilinestring/) - all curves are linearized and new `IMultiLineString` is created

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | `tolerance` is less than or equal to `0`. |
| InvalidOperationException | This geometry is invalid in a such way, that operation can not be completed. |

### See Also

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* namespace [Aspose.Gis.Geometries](../../imulticurve/)
* assembly [Aspose.GIS](../../../)


