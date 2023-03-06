---
title: IGeometry.Within
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Determines whether this geometry is within a specified extent.
type: docs
weight: 380
url: /net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Determines whether this geometry is within a specified extent.

```csharp
public bool Within(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | The extent. |

### Return Value

`true` if this geometry is within extent; `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Determines whether this geometry is within a specified geometry.

```csharp
public bool Within(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |

### Return Value

`true` if this geometry is "spatially within" another geometry. `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### Remarks

This method tests whether one geometry is within another in terms of DE-9IM intersection matrix. One geometry is within another one, if another geometry contains every point of the geometry and geometries interiors intersect. This method is equivalent to:

```csharp
this.Relate(other, "T*F**F***");
```

See OpenGIS Simple Features Specification for more details about DE-9IM and "spatially within" relation.

### See Also

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


