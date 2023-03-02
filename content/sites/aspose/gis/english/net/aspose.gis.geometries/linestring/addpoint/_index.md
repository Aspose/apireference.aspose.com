---
title: LineString.AddPoint
second_title: Aspose.GIS for .NET API Reference
description: LineString method. Adds a point to the end of the line.
type: docs
weight: 110
url: /net/aspose.gis.geometries/linestring/addpoint/
---
## AddPoint(IPoint) {#addpoint}

Adds a point to the end of the line.

```csharp
public void AddPoint(IPoint point)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point | IPoint | The point to add. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |
| ArgumentException | The argument is empty (its [`IsEmpty`](../../igeometry/isempty/) is `true`). |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of this geometry and [`SpatialReferenceSystem`](../spatialreferencesystem/) of argument are both not `null` and don't equal to each other. |

### See Also

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)

---

## AddPoint(double, double) {#addpoint_1}

Adds a point to the end of the line.

```csharp
public void AddPoint(double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | The value for X coordinate. |
| y | Double | The value for Y coordinate. |

### See Also

* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)

---

## AddPoint(double, double, double) {#addpoint_2}

Adds a point to the end of the line.

```csharp
public void AddPoint(double x, double y, double z)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | The value for X coordinate. |
| y | Double | The value for Y coordinate. |
| z | Double | The value for Z coordinate. |

### See Also

* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)

---

## AddPoint(double, double, double, double) {#addpoint_3}

Adds a point to the end of the line.

```csharp
public void AddPoint(double x, double y, double z, double m)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | The value for X coordinate. |
| y | Double | The value for Y coordinate. |
| z | Double | The value for Z coordinate. |
| m | Double | The value for M coordinate. |

### See Also

* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)


