---
title: LineString
second_title: Aspose.GIS for .NET API 参考
description: 多顶点线
type: docs
weight: 1010
url: /zh/net/aspose.gis.geometries/linestring/
---
## LineString class

多顶点线。

```csharp
public class LineString : Curve, ILineString
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [LineString](linestring#constructor)() | 初始化[`LineString`](../linestring)类的新实例。 |
| [LineString](linestring#constructor_2)(IEnumerable&lt;IPoint&gt;) | 初始化[`LineString`](../linestring)类的新实例。 |
| [LineString](linestring#constructor_1)(ILineString) | 初始化[`LineString`](../linestring)类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | 获取此Geometry的坐标维数。 |
| [Count](../../aspose.gis.geometries/linestring/count) { get; } | 获取[`LineString`](../linestring)中的点数。 |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | 获取此Geometry的拓扑维度。 |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint) { get; } | 返回曲线终点的副本。 |
| override [GeometryType](../../aspose.gis.geometries/linestring/geometrytype) { get; } | 获取几何的类型。 |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | 获取一个值，该值指示此几何图形是还是包含曲线（非线性）几何图形。 |
| [HasM](../../aspose.gis.geometries/linestring/hasm) { get; set; } | 获取该实例是否有M坐标的值。 |
| [HasZ](../../aspose.gis.geometries/linestring/hasz) { get; set; } | 获取一个值，该值指示此实例是否具有 Z 坐标。 |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | 获取曲线是否闭合的值。 如果曲线的起点等于终点，则曲线是闭合的。 |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty) { get; } | 获取一个值，该值指示此实例是否为空。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | 获取一个值，该值指示此实例从 SFA 的角度来看是否简单。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | 获取指示此实例是否有效的值。 |
| [Item](../../aspose.gis.geometries/linestring/item) { get; set; } | 获取或设置指定索引处的[`IPoint`](../ipoint)。 |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem) { get; set; } | 获取此实例的 SpatialReferenceSystem。 如果未设置 SpatialReferenceSystem，则此属性可以是`null`。 分配新的 SpatialReferenceSystem 不会执行任何坐标转换，只会更改参考。 |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint) { get; } | 返回曲线起点的副本。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint)(IPoint) | 在行尾添加一个点。 |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_1)(double, double) | 在行尾添加一个点。 |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_2)(double, double, double) | 在行尾添加一个点。 |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_3)(double, double, double, double) | 在行尾添加一个点。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | 将此几何图形转换为其众所周知的文本表示。 |
| override [Clone](../../aspose.gis.geometries/linestring/clone)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | 确定此几何图形是否被指定几何图形覆盖。 |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | 确定此几何是否覆盖指定几何。 |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | 确定此几何图形和指定几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | 从此几何中减去指定的几何。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | 确定此几何图形是否与指定几何图形不相交。 |
| [Equals](../../aspose.gis.geometries/linestring/equals#equals)(ILineString) | 表示当前对象是否等于另一个同类型的对象。 |
| override [Equals](../../aspose.gis.geometries/linestring/equals#equals_1)(object) | 判断指定对象是否等于当前对象。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | 计算此几何的面积。 |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | 计算该几何的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | 计算此几何的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | 计算此几何图形与指定几何图形之间的最小距离。 |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator)() | 返回一个遍历集合的枚举器。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | 计算并返回此几何的边界范围。 |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode)() | 用作默认哈希函数。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | 计算此几何的长度。 |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | 在此几何图形和指定几何图形之间建立交集。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | 确定此几何图形和指定几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | 确定此几何是否与指定几何重叠。 |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | 确定此几何与指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | 获取表示为此几何图形的线的多边形。 |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse)() | 反转此[`LineString`](../linestring)中的点顺序。 |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | 将 M 坐标四舍五入到指定的小数位数。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | 将 X 和 Y 坐标四舍五入为指定的小数位数。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | 将 Z 坐标四舍五入为指定的小数位数。 |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty)() | 使[`Geometry`](../geometry)为空。 |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | 确定此几何在空间上是否包含指定的几何。 |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | 确定此几何在空间上是否等于指定的几何。 |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | 在此几何图形和指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/linestring/toeditable#toeditable_2)() | 获取此几何图形的可编辑副本。 (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | 获取此几何图形的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | 使用默认` 公差` 获取此几何图形的近似或等效非曲线版本。 (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | 使用指定的` 容差` 获取此几何图形的近似或等效非曲线版本。 (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | 返回代表当前对象的字符串。 |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | 确定此几何体是否与指定的几何体接触。 |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | 将此几何图形与指定几何图形结合。 |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | 确定此几何图形是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | 确定此几何是否在指定几何内。 |
| [operator ==](../../aspose.gis.geometries/linestring/op_equality) | 实现运算符 ==。 |
| [operator !=](../../aspose.gis.geometries/linestring/op_inequality) | 实现运算符 !=。 |

### 也可以看看

* class [Curve](../curve)
* interface [ILineString](../ilinestring)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
