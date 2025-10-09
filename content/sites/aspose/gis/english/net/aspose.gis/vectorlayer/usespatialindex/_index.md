---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Loads spatial index to speed up filtering by attributes value in filter methods like WhereIntersects and NearestTo. If index does not exist creates it first. Use forceRebuild to force index recreation
type: docs
weight: 210
url: /net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../../featuressequence/whereintersects/) and [`NearestTo`](../nearestto/). If index does not exist creates it first. Use *forceRebuild* to force index recreation.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexPath | String | Path to the index file. |
| forceRebuild | Boolean | Whether to recreate index even if it already exists. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Path is `null`. |
| IOException | An I/O error occurred. |
| InvalidOperationException | Spatial index is already loaded for this layer. |
| [GisException](../../gisexception/) | File exists and it is not a spatial index file created by Aspose.GIS. |

### See Also

* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../../featuressequence/whereintersects/) and [`NearestTo`](../nearestto/). If index does not exist creates it first. Use *forceRebuild* to force index recreation.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexPath | AbstractPath | Path to the index file. |
| forceRebuild | Boolean | Whether to recreate index even if it already exists. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Path is `null`. |
| IOException | An I/O error occurred. |
| InvalidOperationException | Spatial index is already loaded for this layer. |
| [GisException](../../gisexception/) | File exists and it is not a spatial index file created by Aspose.GIS. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


