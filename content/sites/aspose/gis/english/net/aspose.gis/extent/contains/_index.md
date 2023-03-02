---
title: Extent.Contains
second_title: Aspose.GIS for .NET API Reference
description: Extent method. Determines whether this extent contains a coordinate defined by the arguments.
type: docs
weight: 120
url: /net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Determines whether this extent contains a coordinate defined by the arguments.

```csharp
public bool Contains(double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | X of the coordinate. |
| y | Double | Y of the coordinate. |

### Return Value

Value, indicating whether coordinate is inside bounding box.

### Remarks

Coordinates located on the bounds of this [`Extent`](../) are considered to be contained by this [`Extent`](../).

### See Also

* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Determines whether this extent contains the argument.

```csharp
public bool Contains(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | Another extent. |

### Return Value

Value, indicating whether this extent contains the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent and the argument are both not `null` and not equal to each other. |

### Remarks

Coordinates located on the bounds of this [`Extent`](../) are considered to be contained by this [`Extent`](../). For this reason, equal extents are considered to contain each other.

### See Also

* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Determines whether this extent contains the argument.

```csharp
public bool Contains(IGeometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | A geometry to test for containment. |

### Return Value

Value, indicating whether this extent contains the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent and the argument are both not `null` and not equal to each other. |

### Remarks

Coordinates located on the bounds of this [`Extent`](../) are considered to be contained by this [`Extent`](../).

### See Also

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)


