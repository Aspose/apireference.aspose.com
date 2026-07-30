---
title: "System::Drawing::Point 类"
linktitle: "Point"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Point 类。表示二维平面上点的整数 X 和 Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 1700
url: /zh/cpp/system.drawing/point/
---
## Point class


表示二维平面上点的整数 X 和 Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class Point
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | 将指定的 [Size](../size/) 对象的宽度和高度值分别添加到指定的 [Point](./) 对象的 X 和 Y 坐标值中。 |
| static [Ceiling](./ceiling/)(const PointF\&) | 通过将指定的 [PointF](../pointf/) 对象的 X 和 Y 坐标值向上取整为下一个更大的整数，构造一个 [Point](./) 对象。 |
| [Equals](./equals/)(const Point\&) const | 确定当前对象与指定对象是否相等，即它们是否表示相同的 X 和 Y 坐标对。 |
| [get_IsEmpty](./get_isempty/)() const | 确定 X 和 Y 坐标值是否均为 0。 |
| [get_X](./get_x/)() const | 返回当前对象所表示的 X 坐标值。 |
| [get_Y](./get_y/)() const | 返回当前对象所表示的 Y 坐标值。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [getStdHash](./getstdhash/)() const | 返回当前对象的哈希值。 |
| [IsNull](./isnull/)() const | 始终返回 false。 |
| [Offset](./offset/)(int, int) | 将当前对象表示的 X 和 Y 坐标值按指定的值进行偏移。 |
| [Offset](./offset/)(Point) | 将当前对象表示的 X 和 Y 坐标分别按指定的 [Point](./) 对象的 X 和 Y 坐标值进行偏移。 |
| [operator PointF](./operatorpointf/)() const | 构造一个 [PointF](../pointf/) 对象实例，并使用当前 [Point](./) 对象的 X 和 Y 坐标值进行初始化。 |
| [operator Size](./operatorsize/)() const | 构造一个 [Size](../size/) 对象实例，并分别使用当前对象表示的 X 和 Y 坐标值来初始化其宽度和高度。 |
| [Point](./point/)() | 构造一个新的 [Point](./) 对象，并将其 X 和 Y 坐标值初始化为 0。 |
| [Point](./point/)(int, int) | 构造一个新的 [Point](./) 对象，并使用指定的值进行初始化。 |
| [Point](./point/)(const Size\&) | 构造一个新的 [Point](./) 对象，并分别使用指定的 [SizeF](../sizef/) 对象的宽度和高度值来初始化其 X 和 Y 坐标。 |
| [Point](./point/)(int) | 构造一个新的 [Point](./) 对象，并使用指定 32 位整数的高 16 位形成的值来初始化其 X 坐标，使用低 16 位形成的值来初始化其 Y 坐标。 |
| static [Round](./round/)(const PointF\&) | 通过将指定的 [PointF](../pointf/) 对象的 X 和 Y 坐标值四舍五入到最近的整数，构造一个 [Point](./) 对象。 |
| [set_X](./set_x/)(int) | 设置当前对象所表示的 X 坐标的值。 |
| [set_Y](./set_y/)(int) | 设置当前对象所表示的 Y 坐标的值。 |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | 分别从指定的 [Point](./) 对象的 X 和 Y 坐标值中减去指定的 [Size](../size/) 对象的宽度和高度值。 |
| [ToString](./tostring/)() const | 返回当前对象所表示的 X 和 Y 坐标值对的字符串表示形式。 |
| static [Truncate](./truncate/)(const PointF\&) | 通过将指定的 [PointF](../pointf/) 对象的 X 和 Y 坐标值截断为下一个更低的整数，构造一个 [Point](./) 对象。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 一个空的 [Point](./) 类实例，其 X 和 Y 坐标值为 0。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
