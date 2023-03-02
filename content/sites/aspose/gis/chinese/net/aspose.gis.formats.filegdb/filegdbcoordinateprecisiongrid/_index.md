---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid 班级. FileGDB 层内的坐标精度网格
type: docs
weight: 250
url: /zh/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

FileGDB 层内的坐标精度网格。

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | 获取或设置 M 坐标原点。如果设置为`null`使用默认值。 |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | 获取或设置M坐标的比例。如果设置为`null`使用默认值。 |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | 获取或设置X坐标原点。如果设置为`null`使用默认值。 |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | 获取或设置 X 和 Y 坐标的比例。如果设置为`null`使用默认值。 |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | 获取或设置Y坐标原点。如果设置为`null`使用默认值。 |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | 获取或设置 Z 坐标原点。如果设置为`null`使用默认值。 |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | 获取或设置Z坐标的比例。如果设置为`null`使用默认值。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | 创建新的`FileGdb坐标精度网格`这样矩形内的所有值都是可表示的。 |

### 评论

坐标精度网格定义了FileGDB图层中坐标的有效域和分辨率。 Origin定义了坐标精度网格在空间中的路径。 scale 定义分辨率（ scale 越大，写入的值越精确）。 精度网格指定坐标值的有效范围： 中的每个坐标[`VectorLayer`](../../aspose.gis/vectorlayer/)必须在此范围内。 超出范围的坐标可能会导致稍后读取错误，并且将被 ArcGIS 错误处理。 如果您未指定任何属性（保留它们`null` 将使用默认值。 默认值取决于[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)的[`VectorLayer`](../../aspose.gis/vectorlayer/). 对于地理[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)默认值是： 对于预计[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)默认值是： 在哪里`XY公差`,`Z公差`和`公差`值来自[`FileGdbOptions`](../filegdboptions/).

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### 也可以看看

* 命名空间 [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* 部件 [Aspose.GIS](../../)


