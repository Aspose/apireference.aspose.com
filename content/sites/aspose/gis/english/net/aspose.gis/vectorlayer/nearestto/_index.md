---
title: VectorLayer.NearestTo
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Gets the nearest feature to the provided coordinate
type: docs
weight: 170
url: /net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Gets the nearest feature to the provided coordinate.

```csharp
public Feature NearestTo(double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | X of the coordinate. |
| y | Double | Y of the coordinate. |

### Return Value

The nearest feature to the provided coordinate.

### See Also

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Gets the nearest feature to the provided point.

```csharp
public Feature NearestTo(IPoint point)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point | IPoint | The point. |

### Return Value

The nearest feature to the provided point.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Point is `null`. |
| ArgumentException | Point is empty or not valid. |

### See Also

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


