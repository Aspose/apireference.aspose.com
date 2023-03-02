---
title: Interface ICurve
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.ICurve 界面. 一个ICurve是点序列.
type: docs
weight: 980
url: /zh/net/aspose.gis.geometries/icurve/
---
## ICurve interface

一个`ICurve`是点序列.

```csharp
public interface ICurve : IGeometry
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [EndPoint](../../aspose.gis.geometries/icurve/endpoint/) { get; } | 返回曲线终点的副本。 |
| [IsClosed](../../aspose.gis.geometries/icurve/isclosed/) { get; } | 获取指示曲线是否闭合的值。 如果起点等于其终点，则曲线闭合。 |
| [StartPoint](../../aspose.gis.geometries/icurve/startpoint/) { get; } | 返回曲线起点的副本。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icurve/toeditable/)() | 获取此几何体的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry)() | 使用默认值获取此几何的近似或等效非曲线版本`宽容`. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry_1)(double) | 使用指定的几何图形获取近似或等效的非曲线版本`宽容`. |

### 也可以看看

* interface [IGeometry](../igeometry/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


