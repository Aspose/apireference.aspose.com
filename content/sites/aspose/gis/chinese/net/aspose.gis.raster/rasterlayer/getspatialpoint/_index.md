---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS for .NET API 参考
description: RasterLayer 方法. 将指定的列和行转换为空间坐标
type: docs
weight: 150
url: /zh/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

将指定的列和行转换为空间坐标。

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| cellX | Int32 | 列的值（x 坐标）。编号从 0 开始。 |
| cellY | Int32 | 行的值（y 坐标）。编号从 0 开始。 |

### 返回值

返回给定列和行的左上角的 x 坐标。

### 评论

如果任一参数超出栅格相应维度的范围， 它将返回栅格之外的坐标，假设栅格的网格适用于栅格的边界之外。

### 也可以看看

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* 命名空间 [Aspose.Gis.Raster](../../rasterlayer/)
* 部件 [Aspose.GIS](../../../)


