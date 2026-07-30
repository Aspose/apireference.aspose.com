---
title: "System::Drawing::RectangleF 类"
linktitle: "RectangleF"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::RectangleF 类。表示图像的矩形区域，该区域由左上角的单精度浮点 X 和 Y 坐标以及宽度和高度定义。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类管理此类型的对象。"
type: docs
weight: 2000
url: /zh/cpp/system.drawing/rectanglef/
---
## RectangleF class


表示图像的矩形区域，该区域由左上角的单精度浮点 X 和 Y 坐标以及宽度和高度定义。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class RectangleF
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Contains](./contains/)(float, float) | 确定指定的点是否位于当前对象所表示的矩形内部。 |
| [Contains](./contains/)(const PointF\&) | 确定指定的点是否位于当前对象所表示的矩形内部。 |
| [Contains](./contains/)(const RectangleF\&) | 确定指定的矩形是否位于当前对象所表示的矩形内部。 |
| [Equals](./equals/)(const RectangleF\&) const | 确定当前对象和指定对象所表示的矩形是否相同。 |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | 构造一个新的 [RectangleF](./) 对象，该对象表示具有指定边缘位置的矩形。 |
| [get_Bottom](./get_bottom/)() const | 返回当前对象所表示的矩形底部边缘的 y 坐标。 |
| [get_Height](./get_height/)() const | 返回当前对象所表示的矩形的高度。 |
| [get_IsEmpty](./get_isempty/)() const | 确定当前对象所表示的矩形的左上角 X 和 Y 坐标以及其宽度和高度是否为 0。 |
| [get_Left](./get_left/)() const | 返回当前对象所表示的矩形左边缘的 X 坐标。 |
| [get_Location](./get_location/)() const | 返回一个 [PointF](../pointf/) 类的实例，该实例指定当前对象所表示的矩形左上角的位置。 |
| [get_Right](./get_right/)() const | 返回当前对象所表示的矩形右边缘的 X 坐标。 |
| [get_Size](./get_size/)() const | 返回一个 [SizeF](../sizef/) 类的实例，该实例指定当前对象所表示的矩形的宽度和高度。 |
| [get_Top](./get_top/)() const | 返回当前对象所表示的矩形顶部边缘的 Y 坐标。 |
| [get_Width](./get_width/)() const | 返回当前对象所表示的矩形的宽度。 |
| [get_X](./get_x/)() const | 返回当前对象所表示的矩形左上角的 X 坐标。 |
| [get_Y](./get_y/)() const | 返回当前对象所表示的矩形左上角的 Y 坐标。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [Inflate](./inflate/)(float, float) | 在保持矩形几何中心位置不变的情况下，增加当前对象所表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。 |
| [Inflate](./inflate/)(const SizeF\&) | 在保持矩形几何中心位置不变的情况下，增加当前对象所表示的矩形的宽度和高度。宽度和高度分别按指定尺寸对象的宽度和高度值对应的量增加。 |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | 在保持矩形几何中心位置不变的情况下，增加指定对象所表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。 |
| [Intersect](./intersect/)(const RectangleF\&) | 用当前对象所表示的矩形与指定对象所表示的矩形相交得到的矩形替换当前对象所表示的矩形。 |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | 返回指定矩形相交的结果矩形。 |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | 确定当前对象和指定对象所表示的矩形是否相交。 |
| [Offset](./offset/)(const PointF\&) | 按指定的量偏移当前对象所表示的矩形的位置。 |
| [Offset](./offset/)(float, float) | 按指定的量偏移当前对象所表示的矩形的位置。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 始终返回 true。 |
| [operator==](./operator==/)(std::nullptr_t) const | 始终返回 false。 |
| [RectangleF](./rectanglef/)() | 构造一个新的 [RectangleF](./) 实例，该实例表示一个 X、Y 坐标以及宽度和高度值均为 0 的矩形。 |
| [RectangleF](./rectanglef/)(float, float, float, float) | 构造一个新的 [RectangleF](./) 实例，该实例表示一个矩形，其左上角坐标以及宽度和高度为指定值。 |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | 构造一个新的 [RectangleF](./) 实例，该实例表示一个矩形，其左上角坐标由 [PointF](../pointf/) 类的实例指定，宽度和高度由 [SizeF](../sizef/) 类的实例指定。 |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | 构造一个新的 [RectangleF](./) 对象实例，该实例表示与指定对象等价的矩形。 |
| [set_Height](./set_height/)(float) | 设置当前对象所表示矩形的高度。 |
| [set_Location](./set_location/)(PointF) | 设置当前对象所表示矩形左上角的位置。 |
| [set_Size](./set_size/)(SizeF) | 设置当前对象所表示矩形的宽度和高度。 |
| [set_Width](./set_width/)(float) | 设置当前对象所表示矩形的宽度。 |
| [set_X](./set_x/)(float) | 设置当前对象所表示矩形左上角的 X 坐标。 |
| [set_Y](./set_y/)(float) | 设置当前对象所表示矩形左上角的 Y 坐标。 |
| [ToString](./tostring/)() const | 返回当前对象的字符串表示形式。 |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | 返回由指定矩形合并得到的矩形。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 空矩形，即位置和尺寸值均为零的矩形。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
