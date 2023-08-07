---
title: RasterLayer.Warp
second_title: Aspose.GIS for .NET API Reference
description: RasterLayer method. Warps the raster layer to another
type: docs
weight: 210
url: /net/aspose.gis.raster/rasterlayer/warp/
---
## RasterLayer.Warp method

Warps the raster layer to another.

```csharp
public RasterLayer Warp(WarpOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | WarpOptions | Options for the reprojection procedure. |

### Return Value

The warp raster layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument cannot be null. Parameter name: options. |
| ArgumentException | Unknown source spatial reference system. |
| InvalidOperationException | Original layer cannot be another WarpRasterLayer. |

### See Also

* class [WarpOptions](../../warpoptions/)
* class [RasterLayer](../)
* namespace [Aspose.Gis.Raster](../../rasterlayer/)
* assembly [Aspose.GIS](../../../)


