---
title: Class CompoundCurve
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.CompoundCurve 班级. 表示一系列连续曲线的曲线相邻曲线在其端点连接
type: docs
weight: 890
url: /zh/net/aspose.gis.geometries/compoundcurve/
---
## CompoundCurve class

表示一系列连续曲线的曲线，相邻曲线在其端点连接。

```csharp
public class CompoundCurve : Curve, ICompoundCurve
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [CompoundCurve](compoundcurve/#constructor)() | 初始化一个新的实例`CompoundCurve`类. |
| [CompoundCurve](compoundcurve/#constructor_1)(ICompoundCurve) | 初始化一个新的实例`CompoundCurve`类. |
| [CompoundCurve](compoundcurve/#constructor_2)(IEnumerable&lt;ICurve&gt;) | 初始化一个新的实例`CompoundCurve`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | 获取此的坐标维数[`Geometry`](../geometry/). |
| [Count](../../aspose.gis.geometries/compoundcurve/count/) { get; } | 获取曲线中的曲线数[`ICompoundCurve`](../icompoundcurve/). |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | 得到这个的拓扑维度[`Geometry`](../geometry/). |
| override [EndPoint](../../aspose.gis.geometries/compoundcurve/endpoint/) { get; } | 返回曲线终点的副本。 |
| override [GeometryType](../../aspose.gis.geometries/compoundcurve/geometrytype/) { get; } | 获取几何类型。 |
| override [HasCurveGeometry](../../aspose.gis.geometries/compoundcurve/hascurvegeometry/) { get; } | 获取一个值，该值指示此几何图形是否为或包含曲线（非线性）几何图形。 |
| [HasM](../../aspose.gis.geometries/compoundcurve/hasm/) { get; set; } | 获取一个值，指示该实例是否具有 M 坐标。 |
| [HasZ](../../aspose.gis.geometries/compoundcurve/hasz/) { get; set; } | 获取一个值，指示此实例是否具有 Z 坐标。 |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | 获取指示曲线是否闭合的值。 如果起点等于终点，则曲线闭合。 |
| override [IsEmpty](../../aspose.gis.geometries/compoundcurve/isempty/) { get; } | 获取一个值，指示此实例是否为空。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | 获取一个值，该值指示从 SFA 的角度来看此实例是否简单。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | 获取指示此实例是否有效的值。 |
| [Item](../../aspose.gis.geometries/compoundcurve/item/) { get; } | 获取[`ICurve`](../icurve/)在指定的索引处. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/compoundcurve/spatialreferencesystem/) { get; set; } | 获取此实例的 SpatialReferenceSystem。 此属性可以是`null`，如果 SpatialReferenceSystem 未设置。 分配新的 SpatialReferenceSystem 将不会执行任何坐标转换，只会更改参考。 |
| override [StartPoint](../../aspose.gis.geometries/compoundcurve/startpoint/) { get; } | 返回曲线起点的副本。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddCurve](../../aspose.gis.geometries/compoundcurve/addcurve/)(ICurve) | 在此末尾添加一条曲线`CompoundCurve`. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | 将此几何图形转换为其众所周知的二进制表示形式。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | 将此几何图形转换为其众所周知的二进制表示形式。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 将此几何导出为图像表示。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | 将此几何图形转换为其 Well-Known Text 表示形式。 |
| override [Clone](../../aspose.gis.geometries/compoundcurve/clone/)() | 克隆此实例。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | 判断这个几何体是否被指定的几何体覆盖。 |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | 判断这个几何图形是否覆盖指定的几何图形。 |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | 确定此几何图形和指定的几何图形是否交叉。 |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | 从该几何体中减去指定的几何体。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | 确定此几何是否与指定几何不相交。 |
| [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals)(ICompoundCurve) | 指示当前对象是否等于同一类型的另一个对象。 |
| override [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals_1)(object) | 确定指定对象是否等于当前对象。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | 计算此几何体的面积。 |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | 计算此几何图形周围的缓冲区。 |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | 计算此几何体的质心。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | 计算此几何体的凸包。 |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | 计算此几何与指定几何之间的最小距离。 |
| [GetEnumerator](../../aspose.gis.geometries/compoundcurve/getenumerator/)() | 返回循环访问集合的枚举器。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | 计算并返回此几何的边界范围。 |
| override [GetHashCode](../../aspose.gis.geometries/compoundcurve/gethashcode/)() | 用作默认哈希函数。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | 计算此几何体的长度。 |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | 在此几何图形与指定几何图形之间建立交集。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | 确定此几何图形是否与指定范围相交。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | 确定此几何图形和指定的几何图形是否相交。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | 确定此几何是否与指定几何重叠。 |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | 确定此几何和指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | 获取表示为该几何体的线的多边形。 |
| override [Reverse](../../aspose.gis.geometries/compoundcurve/reverse/)() | 反转这个`CompoundCurve`.也就是说 - 曲线的逆序和复合曲线内的每条曲线. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | 将 M 坐标四舍五入到指定的小数位数。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | 将 X 和 Y 坐标四舍五入到指定的小数位数。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | 将 Z 坐标四舍五入到指定的小数位数。 |
| override [SetEmpty](../../aspose.gis.geometries/compoundcurve/setempty/)() | 做这个[`Geometry`](../geometry/)空. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | 确定此几何图形在空间上是否包含指定的几何图形。 |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | 确定此几何图形在空间上是否等于指定的几何图形。 |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | 在此几何图形与指定几何图形之间建立对称差异。 |
| [ToEditable](../../aspose.gis.geometries/compoundcurve/toeditable/#toeditable)() | 获取此几何体的可编辑副本。 (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | 获取此几何体的可编辑副本。 |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | 使用默认值获取此几何的近似或等效非曲线版本`宽容`. (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | 使用指定的几何图形获取近似或等效的非曲线版本`宽容`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 返回表示当前对象的字符串。 |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | 确定此几何体和指定的几何体是否接触。 |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | 将此几何图形与指定的几何图形结合起来。 |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | 确定此几何图形是否在指定范围内。 |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | 确定此几何图形是否在指定的几何图形内。 |
| [operator ==](../../aspose.gis.geometries/compoundcurve/op_equality/) | 实现运算符 ==. |
| [operator !=](../../aspose.gis.geometries/compoundcurve/op_inequality/) | 实现运算符 !=. |

### 评论

复合曲线不能包含其他复合曲线。

### 也可以看看

* class [Curve](../curve/)
* interface [ICompoundCurve](../icompoundcurve/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


