---
title: "System::Drawing::Region 类"
linktitle: "Region"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Region 类。表示图形形状的内部。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2100
url: /zh/cpp/system.drawing/region/
---
## Region class


表示图形形状的内部。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Region : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() const | 返回当前对象的副本。 |
| [Complement](./complement/)(const RectangleF\&) | 将当前对象表示的区域替换为由指定矩形定义且不与该区域相交的部分。 |
| [Complement](./complement/)(const Rectangle\&) | 将当前对象表示的区域替换为由指定矩形定义且不与该区域相交的部分。 |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 将当前对象表示的区域替换为由指定路径定义且不与该区域相交的部分。 |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | 将当前对象表示的区域替换为指定区域中不与该区域相交的部分。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | 确定指定的区域在给定的绘图表面上是否与当前对象所表示的区域相同。 |
| [Exclude](./exclude/)(const RectangleF\&) | 将当前对象表示的区域替换为从中排除指定矩形定义的区域后的结果。 |
| [Exclude](./exclude/)(const Rectangle\&) | 将当前对象表示的区域替换为从中排除指定矩形定义的区域后的结果。 |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 将当前对象表示的区域替换为从中排除指定路径定义的区域后的结果。 |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | 将当前对象表示的区域替换为从中排除指定区域后的结果。 |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | 获取一个 [RectangleF](../rectanglef/) 结构，表示在 [Graphics](../graphics/) 对象的绘图表面上界定此 [Region](./) 的矩形。 |
| [GetRegionData](./getregiondata/)() const | 返回一个 RegionData 对象，其中包含定义当前对象所表示区域的数据。 |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | 返回一个 [RectangleF](../rectanglef/) 结构数组，这些结构在应用指定的矩阵变换后近似此 [Region](./)。 |
| [Intersect](./intersect/)(const RectangleF\&) | 用此区域与由指定矩形定义的区域的交集结果替换当前对象表示的区域。 |
| [Intersect](./intersect/)(const Rectangle\&) | 用此区域与由指定矩形定义的区域的交集结果替换当前对象表示的区域。 |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 用此区域与由指定路径定义的区域的交集结果替换当前对象表示的区域。 |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | 用此区域与指定区域的交集结果替换当前对象表示的区域。 |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | 确定当前对象表示的区域在指定绘图表面上是否具有空内部。 |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | 确定当前对象表示的区域在指定绘图表面上是否具有无限内部。 |
| [IsVisible](./isvisible/)(const Point\&) const | 确定指定点是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const PointF\&) const | 确定指定点是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const Rectangle\&) | 确定指定矩形的任何部分是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const RectangleF\&) | 确定指定矩形的任何部分是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | 使用指定的图形，确定指定点是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | 使用指定的图形，确定指定点是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | 使用指定的图形，确定指定矩形的任何部分是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | 使用指定的图形，确定指定矩形的任何部分是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(float, float) const | 确定指定点是否包含在当前对象表示的区域内。 |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | 使用指定的图形，确定指定点是否包含在当前对象表示的区域内。 |
| [MakeEmpty](./makeempty/)() | 将当前对象初始化为空内部。 |
| [MakeInfinite](./makeinfinite/)() | 将此区域对象初始化为无限内部。 |
| [Region](./region/)() | 构造一个新的 [Region](./) 类实例。 |
| [Region](./region/)(const RectangleF\&) | 构造一个新的 [Region](./) 类实例，该实例表示由指定矩形定义的区域。 |
| [Region](./region/)(const Rectangle\&) | 构造一个新的 [Region](./) 类实例，该实例表示由指定矩形定义的区域。 |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 构造一个新的 [Region](./) 类实例，该实例表示由指定路径定义的区域。 |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | 构造一个新的 [Region](./) 类实例，该实例表示由指定 RegionData 对象定义的区域。 |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 使用指定的矩阵转换此区域。 |
| [Transform](./transform/)(const SkMatrix\&) | 使用指定的矩阵转换此区域。 |
| [Translate](./translate/)(int, int) | 按指定的量移动区域的坐标。 |
| [Translate](./translate/)(float, float) | 按指定的量移动区域的坐标。 |
| [Union](./union/)(const RectangleF\&) | 用此区域与由指定矩形定义的区域的并集操作结果替换当前对象表示的区域。 |
| [Union](./union/)(const Rectangle\&) | 用此区域与由指定矩形定义的区域的并集结果替换当前对象表示的区域。 |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 用此区域与由指定路径定义的区域的并集结果替换当前对象表示的区域。 |
| [Union](./union/)(const SharedPtr\<Region\>\&) | 用此区域与指定区域的并集结果替换当前对象表示的区域。 |
| [Xor](./xor/)(const RectangleF\&) | 用此区域与由指定矩形定义的区域的非交叉部分替换当前对象表示的区域。 |
| [Xor](./xor/)(const Rectangle\&) | 用此区域与由指定矩形定义的区域的非交叉部分替换当前对象表示的区域。 |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 用此区域与由指定路径定义的区域的非交叉部分替换当前对象表示的区域。 |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | 用此区域与指定区域的非交叉部分替换当前对象表示的区域。 |
| virtual [~Region](./~region/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
