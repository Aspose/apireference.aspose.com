---
title: RasterLayer.Crop
second_title: Aspose.GIS for .NET API 参考
description: RasterLayer 方法. 使用形状形式和带掩模裁剪栅格图层
type: docs
weight: 110
url: /zh/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

使用形状形式（和带掩模）裁剪栅格图层。

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| geometry | IGeometry | 几何代表形状形式。 |
| masks | Double[] | 裁剪层蒙版 |

### 返回值

裁剪后的栅格图层。如果没有找到交叉点返回`null`.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数不能为空。参数名称：几何。 |
| NotSupportedException | 参数不能不同于多边形或曲面。参数名称：几何。 |
| InvalidOperationException | 原始层不能是另一个 CropRasterLayer。 |
| [GisException](../../../aspose.gis/gisexception/) | 裁剪图层时出错。 |

### 也可以看看

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* 命名空间 [Aspose.Gis.Raster](../../rasterlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

使用波段蒙版裁剪栅格层）。

```csharp
public RasterLayer Crop(double[] masks)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| masks | Double[] | 裁剪层蒙版 |

### 返回值

裁剪后的栅格图层。如果没有找到交叉点返回`null`.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException |  |

### 也可以看看

* class [RasterLayer](../)
* 命名空间 [Aspose.Gis.Raster](../../rasterlayer/)
* 部件 [Aspose.GIS](../../../)


