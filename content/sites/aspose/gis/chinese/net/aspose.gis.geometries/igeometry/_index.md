---
title: IGeometry
second_title: Aspose.GIS for .NET API 参考
description: 几何层次的接口根类
type: docs
weight: 900
url: /zh/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

几何层次的接口根类

```csharp
public interface IGeometry
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension) { get; } | 获取这个的拓扑维度[`IGeometry`](../igeometry) . 如果维度未知（例如对于空的 GEOMETRYCOLLECTION）Point被退回。 |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype) { get; } | 获取几何的类型。 |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry) { get; } | 获取一个值，该值指示此几何图形是否是或包含曲线（非线性）几何图形。 |
| [HasM](../../aspose.gis.geometries/igeometry/hasm) { get; } | 获取一个值，表示这个实例是否有M坐标。 |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz) { get; } | 获取一个值，该值指示此实例是否具有 Z 坐标。 |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty) { get; } | 获取一个值，表示此实例是否为空（表示空点集）。 |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple) { get; } | 获取一个值，该值指示从 SFA 的角度来看此实例是否简单。 |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid) { get; } | 获取一个值，指示此实例是否有效。 |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem) { get; } | 获取该实例的SpatialReferenceSystem。 该属性可以是`null` ，如果 SpatialReferenceSystem 未知。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary)() | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary_1)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext)() | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_1)(WktVariant) | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_2)(WktVariant, NumericFormat) | 将此几何图形转换为其众所周知的文本表示。 |
| [Clone](../../aspose.gis.geometries/igeometry/clone)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby)(IGeometry) | 确定此几何图形是否被指定几何图形覆盖。 |
| [Covers](../../aspose.gis.geometries/igeometry/covers)(IGeometry) | 确定此几何是否覆盖指定的几何。 |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses)(IGeometry) | 确定此几何图形和指定几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/igeometry/difference)(IGeometry) | 从此几何中减去指定的几何。 |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint)(IGeometry) | 确定此几何图形是否与指定几何图形不相交。 |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea)() | 计算此几何图形的面积。 |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid)() | 计算此几何的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull)() | 计算此几何的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto)(IGeometry) | 计算此几何与指定几何之间的最小距离。 |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent)() | 计算并返回此几何的边界范围。 |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength)() | 计算此几何的长度。 |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection)(IGeometry) | 在此几何图形和指定几何图形之间建立一个交集。 |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects_1)(IGeometry) | 确定此几何图形和指定几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps)(IGeometry) | 确定此几何图形是否与指定几何图形重叠。 |
| [Relate](../../aspose.gis.geometries/igeometry/relate)(IGeometry, string) | 确定此几何与指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines)() | 获取表示为此几何的线的多边形。 |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains)(IGeometry) | 确定此几何在空间上是否包含指定的几何。 |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals)(IGeometry) | 确定此几何在空间上是否等于指定的几何。 |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference)(IGeometry) | 在此几何图形和指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable#toeditable)() | 获取此几何图形的可编辑副本。 |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable#toeditable_1)() | 获取此几何图形的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry)() | 使用默认值获取此几何图形的近似或等效非曲线版本`宽容`. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry_1)(double) | 使用指定的获取此几何图形的近似或等效非曲线版本`宽容`. |
| [Touches](../../aspose.gis.geometries/igeometry/touches)(IGeometry) | 确定此几何图形和指定几何图形是否接触。 |
| [Union](../../aspose.gis.geometries/igeometry/union)(IGeometry) | 将此几何图形与指定几何图形结合起来。 |
| [Within](../../aspose.gis.geometries/igeometry/within#within)(Extent) | 确定此几何是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/igeometry/within#within_1)(IGeometry) | 确定此几何图形是否在指定几何图形内。 |

### 也可以看看

* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
