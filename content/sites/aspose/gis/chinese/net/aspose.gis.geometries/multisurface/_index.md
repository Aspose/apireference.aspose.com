---
title: MultiSurface
second_title: Aspose.GIS for .NET API 参考
description: 一个MultiSurface./multisurface是一维的GeometryCollection./geometrycollection其元素是ISurface./isurfaces.
type: docs
weight: 1080
url: /zh/net/aspose.gis.geometries/multisurface/
---
## MultiSurface class

一个[`MultiSurface`](../multisurface)是一维的[`GeometryCollection`](../geometrycollection)其元素是[`ISurface`](../isurface)s.

```csharp
public class MultiSurface : GeometryCollection, IMultiSurface
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [MultiSurface](multisurface)() | 初始化[`MultiSurface`](../multisurface)类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | 获取此坐标维数[`Geometry`](../geometry). |
| [Count](../../aspose.gis.geometries/geometrycollection/count) { get; } | 获取此集合中的几何图形数。 |
| [Dimension](../../aspose.gis.geometries/multisurface/dimension) { get; } | 获取这个的拓扑维度[`Geometry`](../geometry). |
| override [GeometryType](../../aspose.gis.geometries/multisurface/geometrytype) { get; } | 获取几何的类型。 |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry) { get; } | 获取一个值，该值指示此几何图形是否是或包含曲线（非线性）几何图形。 |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm) { get; set; } | 获取一个值，表示这个实例是否有M坐标。 |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz) { get; set; } | 获取一个值，该值指示此实例是否具有 Z 坐标。 |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty) { get; } | 获取一个指示此实例是否为空的值。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | 获取一个值，该值指示从 SFA 的角度来看此实例是否简单。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | 获取一个值，指示此实例是否有效。 |
| [Item](../../aspose.gis.geometries/geometrycollection/item) { get; } | 得到一个[`IGeometry`](../igeometry)在指定的索引处。 |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem) { get; set; } | 获取该实例的SpatialReferenceSystem。 该属性可以是`null` , 是 SpatialReferenceSystem 是未知的。 分配新的 SpatialReferenceSystem 不会进行任何坐标变换，只会改变参考。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add)(IGeometry) | 将指定的几何图形添加到集合中。 |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange)(IEnumerable&lt;IGeometry&gt;) | 将指定的几何图形添加到集合中。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何图形导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | 将此几何图形转换为其众所周知的文本表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | 将此几何图形转换为其众所周知的文本表示。 |
| override [Clone](../../aspose.gis.geometries/multisurface/clone)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | 确定此几何图形是否被指定几何图形覆盖。 |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | 确定此几何是否覆盖指定的几何。 |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | 确定此几何图形和指定几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | 从此几何中减去指定的几何。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | 确定此几何图形是否与指定几何图形不相交。 |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals)(IGeometryCollection) | 指示当前对象是否等于另一个相同类型的对象。 |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals)(object) | 确定指定对象是否等于当前对象。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | 计算此几何图形的面积。 |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | 计算此几何的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | 计算此几何的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | 计算此几何与指定几何之间的最小距离。 |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator)() | 返回一个遍历集合的枚举器。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | 计算并返回此几何的边界范围。 |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode)() | 用作默认哈希函数。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | 计算此几何的长度。 |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface)() | 找到一个保证在此集合中的一个表面上的点。 |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | 在此几何图形和指定几何图形之间建立一个交集。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | 确定此几何图形和指定几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | 确定此几何图形是否与指定几何图形重叠。 |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | 确定此几何与指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat)(int) | 从集合中删除指定的几何图形。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines)() | 获取表示为此几何的线的多边形。 (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | 将 M 坐标四舍五入到指定的小数位数。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | 将 X 和 Y 坐标四舍五入为指定的小数位数。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | 将 Z 坐标四舍五入为指定的小数位数。 |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty)() | 做这个[`Geometry`](../geometry)空的. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | 确定此几何在空间上是否包含指定的几何。 |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | 确定此几何在空间上是否等于指定的几何。 |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | 在此几何图形和指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/multisurface/toeditable#toeditable_2)() | 获取此几何图形的可编辑副本。 (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | 获取此几何图形的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/multisurface/tolineargeometry#tolineargeometry_4)() | 使用默认值获取此几何图形的近似或等效非曲线版本`宽容`. (3 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/multisurface/tolineargeometry#tolineargeometry_5)(double) | 使用指定的获取此几何图形的近似或等效非曲线版本`宽容`. (3 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | 返回表示当前对象的字符串。 |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | 确定此几何图形和指定几何图形是否接触。 |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | 将此几何图形与指定几何图形结合起来。 |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | 确定此几何是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | 确定此几何图形是否在指定几何图形内。 |

### 也可以看看

* class [GeometryCollection](../geometrycollection)
* interface [IMultiSurface](../imultisurface)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
