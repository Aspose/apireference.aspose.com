---
title: "System::Drawing::PointF 类"
linktitle: "PointF"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::PointF 类。表示二维平面上点的单精度浮点 X 和 Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 1800
url: /zh/cpp/system.drawing/pointf/
---
## PointF class


表示二维平面上点的单精度浮点 X 和 Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class PointF
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | 将指定的 [SizeF](../sizef/) 对象的宽度和高度值分别加到指定的 [PointF](./) 对象的 X 和 Y 坐标值上。 |
| static [Add](./add/)(const PointF\&, const Size\&) | 将指定的 [Size](../size/) 对象的宽度和高度值分别加到指定的 [PointF](./) 对象的 X 和 Y 坐标值上。 |
| [Equals](./equals/)(const PointF\&) const | 确定当前对象与指定对象是否相等，即它们是否表示相同的 X 和 Y 坐标对。 |
| [get_IsEmpty](./get_isempty/)() const | 确定 X 和 Y 坐标值是否均为 0。 |
| [get_X](./get_x/)() const | 返回当前对象所表示的 X 坐标值。 |
| [get_Y](./get_y/)() const | 返回当前对象所表示的 Y 坐标值。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [IsNull](./isnull/)() const | 始终返回 false。 |
| explicit [operator bool](./operatorbool/)() | 始终返回 true。 |
| [PointF](./pointf/)() | 构造一个新的 [PointF](./) 对象，并将其 X 和 Y 坐标值初始化为 0。 |
| [PointF](./pointf/)(float, float) | 构造一个新的 [PointF](./) 对象，并使用指定的值进行初始化。 |
| [PointF](./pointf/)(const SizeF\&) | 构造一个新的 [PointF](./) 对象，并使用指定的 [SizeF](../sizef/) 对象的宽度和高度值分别初始化其 X 和 Y 坐标值。 |
| [set_X](./set_x/)(float) | 设置当前对象所表示的 X 坐标的值。 |
| [set_Y](./set_y/)(float) | 设置当前对象所表示的 Y 坐标的值。 |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | 从指定的 [PointF](./) 对象的 X 和 Y 坐标值中分别减去指定的 [SizeF](../sizef/) 对象的宽度和高度值。 |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | 从指定的 [PointF](./) 对象的 X 和 Y 坐标值中分别减去指定的 [Size](../size/) 对象的宽度和高度值。 |
| [ToString](./tostring/)() const | 返回当前对象所表示的 X 和 Y 坐标值对的字符串表示形式。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 一个空的 [PointF](./) 类实例，其 X 和 Y 坐标值为 0。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
