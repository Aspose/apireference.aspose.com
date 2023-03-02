---
title: Class WarpOptions
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Raster.WarpOptions 班级. 光栅变形选项
type: docs
weight: 1430
url: /zh/net/aspose.gis.raster/warpoptions/
---
## WarpOptions class

光栅变形选项。

```csharp
public class WarpOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [WarpOptions](warpoptions/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CellHeight](../../aspose.gis.raster/warpoptions/cellheight/) { get; set; } | 指定栅格像元的新高度（以目标地理参考单位为单位）。 如果该值设置为 0，则[`CellHeight`](./cellheight/)是自动计算的。默认值为“0”. |
| [CellWidth](../../aspose.gis.raster/warpoptions/cellwidth/) { get; set; } | 指定栅格像元的新宽度（以目标地理参考单位为单位）。 如果该值设置为 0，则[`CellWidth`](./cellwidth/)是自动计算的。默认值为“0”. |
| [DefaultSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/defaultspatialreferencesystem/) { get; set; } | 为缺少的源空间参考指定一个值。 |
| [Height](../../aspose.gis.raster/warpoptions/height/) { get; set; } | 以像素和列为单位指定输出栅格高度。 如果该值设置为 0，则会自动计算高度。默认值为“0”. |
| [TargetExtent](../../aspose.gis.raster/warpoptions/targetextent/) { get; set; } | 指定要扭曲的栅格层的边界。 如果设置为`null`，在变形期间计算范围以包括来自栅格的所有单元格。 |
| [TargetSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/targetspatialreferencesystem/) { get; set; } | 指定目标空间参考。 如果设置为`null`，使用默认或源空间参考。 |
| [Width](../../aspose.gis.raster/warpoptions/width/) { get; set; } | 以像素和列为单位指定输出栅格宽度。 如果该值设置为 0，则会自动计算宽度。默认值为“0”. |

### 也可以看看

* 命名空间 [Aspose.Gis.Raster](../../aspose.gis.raster/)
* 部件 [Aspose.GIS](../../)


