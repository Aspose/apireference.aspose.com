---
title: Class Geometry
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.Geometry 班级. 几何层次结构的抽象根类
type: docs
weight: 920
url: /zh/net/aspose.gis.geometries/geometry/
---
## Geometry class

几何层次结构的抽象根类。

```csharp
public abstract class Geometry : IGeometry
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | 获取此的坐标维数`Geometry`. |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension/) { get; } | 得到这个的拓扑维度`Geometry` . 如果维度未知（例如对于空的 GEOMETRYCOLLECTION）Point返回. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | 获取几何类型。 |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | 获取一个值，该值指示此几何图形是否为或包含曲线（非线性）几何图形。 |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | 获取一个值，指示该实例是否具有 M 坐标。 |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | 获取一个值，指示此实例是否具有 Z 坐标。 |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | 获取一个值，指示此实例是否为空。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | 获取一个值，该值指示从 SFA 的角度来看此实例是否简单。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | 获取指示此实例是否有效的值。 |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | 获取此实例的 SpatialReferenceSystem。 此属性可以是`null` , 是 SpatialReferenceSystem 是未知的。 分配新的 SpatialReferenceSystem 不会执行任何坐标转换，只有参考会改变。 |
| static [Null](../../aspose.gis.geometries/geometry/null/) { get; } | 获取空几何的实例。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary)() | 将此几何图形转换为其众所周知的二进制表示形式。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary_1)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示形式。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext)() | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_1)(WktVariant) | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_2)(WktVariant, NumericFormat) | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | 判断这个几何体是否被指定的几何体覆盖。 |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | 判断这个几何图形是否覆盖指定的几何图形。 |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | 确定此几何图形和指定的几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | 从该几何体中减去指定的几何体。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | 确定此几何是否与指定几何不相交。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | 计算此几何体的面积。 |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | 计算此几何体的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | 计算此几何体的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | 计算此几何与指定几何之间的最小距离。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | 计算并返回此几何的边界范围。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | 计算此几何体的长度。 |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | 在此几何图形与指定几何图形之间建立交集。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects_1)(IGeometry) | 确定此几何图形和指定的几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | 确定此几何是否与指定几何重叠。 |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | 确定此几何和指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | 获取表示为该几何体的线的多边形。 |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | 将 M 坐标四舍五入到指定的小数位数。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | 将 X 和 Y 坐标四舍五入到指定的小数位数。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | 将 Z 坐标四舍五入到指定的小数位数。 |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | 做这个`Geometry`空. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | 确定此几何图形在空间上是否包含指定的几何图形。 |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | 确定此几何图形在空间上是否等于指定的几何图形。 |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | 在此几何图形与指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable/#toeditable)() | 获取此几何体的可编辑副本。 |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/#toeditable_1)() | 获取此几何体的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry)() | 使用默认值获取此几何的近似或等效非曲线版本`宽容`. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry_1)(double) | 使用指定的几何图形获取近似或等效的非曲线版本`宽容`. |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 返回表示当前对象的字符串。 |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | 确定此几何体和指定的几何体是否接触。 |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | 将此几何图形与指定的几何图形结合起来。 |
| [Within](../../aspose.gis.geometries/geometry/within/#within)(Extent) | 确定此几何图形是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/geometry/within/#within_1)(IGeometry) | 确定此几何图形是否在指定的几何图形内。 |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary)(byte[]) | 从众所周知的二进制表示形式创建几何。 |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary_1)(byte[], SpatialReferenceSystem) | 从众所周知的二进制表示形式创建几何。 |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext)(string) | 从其 Well-Known Text 表示中创建几何体。 |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext_1)(string, SpatialReferenceSystem) | 从其 Well-Known Text 表示中创建几何体。 |

### 也可以看看

* interface [IGeometry](../igeometry/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


