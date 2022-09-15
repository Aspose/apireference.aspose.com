---
title: Region
second_title: Aspose.Drawing for .NET API 参考
description: 描述由矩形和路径组成的图形形状的内部这个类不能被继承
type: docs
weight: 1060
url: /zh/net/system.drawing/region/
---
## Region class

描述由矩形和路径组成的图形形状的内部。这个类不能被继承。

```csharp
public sealed class Region : IDisposable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Region](region#constructor)() | 初始化[`Region`](../region)类. |
| [Region](region#constructor_1)(GraphicsPath) | 初始化[`Region`](../region)具有指定的类GraphicsPath. |
| [Region](region#constructor_3)(Rectangle) | 初始化[`Region`](../region)从指定的类Rectangle结构. |
| [Region](region#constructor_4)(RectangleF) | 初始化[`Region`](../region)从指定的类RectangleF结构. |
| [Region](region#constructor_2)(RegionData) | 初始化[`Region`](../region)来自指定数据的类。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | 创建一个精确的副本Region. |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | 更新这个Region包含指定的部分GraphicsPath这does 不与此相交Region. |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | 更新这个Region包含指定的部分Rectangle与此不相交的结构 Region. |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | 更新这个Region包含指定的部分RectangleF与此不相交的结构 Region. |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | 更新这个Region包含指定的部分Region不 与此相交Region. |
| [Dispose](../../system.drawing/region/dispose)() | 释放此使用的所有资源Region. |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | 测试是否指定Region与此相同Region 在指定的绘图表面上。 |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | 更新这个Region只包含其内部不与指定的 相交的部分GraphicsPath. |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | 更新这个Region仅包含其内部不与指定的 intersect 相交的部分Rectangle结构. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | 更新这个Region只包含其内部不与指定的 相交的部分RectangleF结构. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | 更新这个Region仅包含其内部不与指定的 intersect 相交的部分Region. |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | 得到一个RectangleF代表一个矩形的结构Region 在 a 的绘图表面上Graphics对象. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | 返回一个RegionData表示描述这个的信息Region. |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | 返回一个数组RectangleF近似于这个的结构Region 应用指定的矩阵变换后。 |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | 更新这个Region到自身与指定的交点GraphicsPath. |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | 更新这个Region到自身与指定的交点Rectangle结构. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | 更新这个Region到自身与指定 的交点RectangleF结构. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | 更新这个Region到自身与指定的交点Region. |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | 测试这是否Region在指定的绘图表面上有一个空的内部。 |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | 测试这是否Region在指定的绘图表面上有一个无限的内部。 |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | 测试是否指定Point结构包含在这个Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | 测试是否指定PointF结构包含在这个Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | 测试指定的任何部分是否Rectangle结构包含在 this 中Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | 测试指定的任何部分是否RectangleF结构包含在 thisRegion. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | 测试指定的点是否包含在这个Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | 测试是否指定Point结构包含在这个Region 绘制时使用指定的Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | 测试是否指定PointF结构包含在这个Region 绘制时使用指定的Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | 测试指定的任何部分是否Rectangle结构包含在 thisRegion使用指定绘制时Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | 测试指定的任何部分是否RectangleF结构包含在 thisRegion使用指定绘制时Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | 测试指定的点是否包含在这个Region绘制时使用 指定的Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | 测试指定的点是否包含在这个Region使用 指定时绘制的对象Graphics对象. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | 测试指定矩形的任何部分是否包含在此Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | 测试指定矩形的任何部分是否包含在此Region. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | 测试指定矩形的任何部分是否包含在此Region 绘制时使用指定的Graphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | 测试指定矩形的任何部分是否包含在此Region当draw 使用指定的Graphics. |
| [MakeEmpty](../../system.drawing/region/makeempty)() | 初始化这个Region到一个空的内部。 |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | 初始化这个Region反对无限的内部。 |
| [Transform](../../system.drawing/region/transform)(Matrix) | 转换这个Region由指定的Matrix. |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | 偏移 this 的坐标Region按指定数量。 |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | 偏移 this 的坐标Region按指定数量。 |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | 更新这个Region到自身和指定的联合GraphicsPath. |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | 更新这个Region到自身和指定的联合Rectangle结构. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | 更新这个Region到自身和指定的联合RectangleF结构. |
| [Union](../../system.drawing/region/union#union_3)(Region) | 更新这个Region到自身和指定的联合Region. |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | 更新这个Region到并集减去自身与指定的 的交集GraphicsPath. |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | 更新这个Region到并集减去自身与指定的 的交集Rectangle结构. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | 更新这个Region到并集减去其自身与 指定的交集RectangleF结构. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | 更新这个Region到并集减去自身与指定的 的交集Region. |

### 也可以看看

* 命名空间 [System.Drawing](../../system.drawing)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
