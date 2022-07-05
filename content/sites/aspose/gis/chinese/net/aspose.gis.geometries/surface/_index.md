---
title: Surface
second_title: Aspose.GIS for .NET API 参考
description: ASurface./surface是一个二维几何对象
type: docs
weight: 1100
url: /zh/net/aspose.gis.geometries/surface/
---
## Surface class

A[`Surface`](../surface)是一个二维几何对象。

```csharp
public abstract class Surface : Geometry, ISurface
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | 获取此Geometry的坐标维数。 |
| [Dimension](../../aspose.gis.geometries/surface/dimension) { get; } | 获取此Geometry的拓扑维度。 |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | 获取几何的类型。 |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | 获取一个值，该值指示此几何图形是还是包含曲线（非线性）几何图形。 |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | 获取该实例是否有M坐标的值。 |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | 获取一个值，该值指示此实例是否具有 Z 坐标。 |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | 获取一个值，该值指示此实例是否为空。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | 获取一个值，该值指示此实例从 SFA 的角度来看是否简单。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | 获取指示此实例是否有效的值。 |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | 获取此实例的 SpatialReferenceSystem。 这个属性可以是`null`，是 SpatialReferenceSystem 是未知的。 分配新的 SpatialReferenceSystem 不会执行任何坐标转换，只会更改参考。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | 将此几何图形转换为其众所周知的文本表示。 |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | 确定此几何图形是否被指定几何图形覆盖。 |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | 确定此几何是否覆盖指定几何。 |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | 确定此几何图形和指定几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | 从此几何中减去指定的几何。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | 确定此几何图形是否与指定几何图形不相交。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | 计算此几何的面积。 |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | 计算该几何的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | 计算此几何的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | 计算此几何图形与指定几何图形之间的最小距离。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | 计算并返回此几何的边界范围。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | 计算此几何的长度。 |
| abstract [GetPointOnSurface](../../aspose.gis.geometries/surface/getpointonsurface)() | 找到一个保证在这个表面上的点。 |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | 在此几何图形和指定几何图形之间建立交集。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | 确定此几何图形和指定几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | 确定此几何是否与指定几何重叠。 |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | 确定此几何与指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | 获取表示为此几何图形的线的多边形。 |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | 将 M 坐标四舍五入到指定的小数位数。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | 将 X 和 Y 坐标四舍五入为指定的小数位数。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | 将 Z 坐标四舍五入为指定的小数位数。 |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | 使[`Geometry`](../geometry)为空。 |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | 确定此几何在空间上是否包含指定的几何。 |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | 确定此几何在空间上是否等于指定的几何。 |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | 在此几何图形和指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/surface/toeditable#toeditable_1)() | 获取此几何图形的可编辑副本。 (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | 获取此几何图形的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry#tolineargeometry_2)() | 使用默认` 公差` 获取此几何图形的近似或等效非曲线版本。 (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry#tolineargeometry_3)(double) | 使用指定的` 容差` 获取此几何图形的近似或等效非曲线版本。 (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | 返回代表当前对象的字符串。 |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | 确定此几何体是否与指定的几何体接触。 |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | 将此几何图形与指定几何图形结合。 |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | 确定此几何图形是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | 确定此几何是否在指定几何内。 |

### 也可以看看

* class [Geometry](../geometry)
* interface [ISurface](../isurface)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
