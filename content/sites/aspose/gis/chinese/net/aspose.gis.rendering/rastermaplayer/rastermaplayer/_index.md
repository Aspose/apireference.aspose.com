---
title: RasterMapLayer.RasterMapLayer
second_title: Aspose.GIS for .NET API 参考
description: RasterMapLayer 构造函数. 创建新实例
type: docs
weight: 10
url: /zh/net/aspose.gis.rendering/rastermaplayer/rastermaplayer/
---
## RasterMapLayer constructor

创建新实例。

```csharp
public RasterMapLayer(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | RasterLayer | 栅格图层。 |
| colorizer | RasterColorizer | 用于渲染图层的符号器。如果`null`，将使用默认着色器。 |
| keepOpen | Boolean | `true`在之后保持图层打开[`VectorMapLayer`](../../vectormaplayer/)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [RasterMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../rastermaplayer/)
* 部件 [Aspose.GIS](../../../)


