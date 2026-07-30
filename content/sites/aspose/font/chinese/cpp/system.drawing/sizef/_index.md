---
title: "System::Drawing::SizeF 类"
linktitle: "SizeF"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::SizeF 类。表示一对单精度浮点值，用于表示图像的宽度和高度。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 2300
url: /zh/cpp/system.drawing/sizef/
---
## SizeF class


表示一对单精度浮点值，表示图像的宽度和高度。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class SizeF
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | 返回一个新的 [SizeF](./) 对象，它是指定的 [SizeF](./) 对象的和，即其宽度值等于指定对象的宽度值之和，高度值等于指定对象的高度值之和。 |
| [Equals](./equals/)(const SizeF\&) const | 确定当前对象和指定对象是否相等，即它们是否表示相同的一对宽度和 hegiht 值。 |
| [get_Height](./get_height/)() const | 返回当前对象表示的高度值。 |
| [get_IsEmpty](./get_isempty/)() const | 确定宽度和 hegiht 值是否都等于 0。 |
| [get_Width](./get_width/)() const | 返回当前对象表示的宽度值。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [operator PointF](./operatorpointf/)() const | 通过将当前对象的宽度和值分别初始化为 X 和 Y 坐标，将当前对象转换为 [Point](../point/) 实例。 |
| [operator+=](./operator+=/)(const SizeF\&) | 将指定的 [SizeF](./) 对象的宽度和高度值分别加到当前 [SizeF](./) 对象的宽度和高度值上。 |
| [set_Height](./set_height/)(float) | 设置当前对象表示的高度值。 |
| [set_Width](./set_width/)(float) | 设置当前对象表示的宽度值。 |
| [SizeF](./sizef/)() | 构造一个新的 [SizeF](./) 对象，并将其宽度和高度值初始化为 0。 |
| [SizeF](./sizef/)(const PointF\&) | 构造一个新的 [SizeF](./) 对象，并将其宽度和高度值分别初始化为指定点的 X 和 Y 坐标值。 |
| [SizeF](./sizef/)(float, float) | 构造一个新的 [SizeF](./) 对象，并使用指定的值进行初始化。 |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | 返回一个新的 [SizeF](./) 对象，它是 **size2** 从 **size1** 中减去的结果，即其宽度值是 **size1** 的宽度值减去 **size2** 的宽度值后的结果，高度值是 **size1** 的高度值减去 **size2** 的高度值后的结果。 |
| [ToPointF](./topointf/)() const | 通过将当前对象的宽度和值分别初始化为 X 和 Y 坐标，将当前对象转换为 [Point](../point/) 实例。 |
| [ToSize](./tosize/)() const | 通过将当前 [SizeF](./) 对象的宽度和高度值截断为下一个更低的整数，构造一个 [Size](../size/) 对象。 |
| [ToString](./tostring/)() const | 返回当前对象表示的宽度和高度值对的字符串表示形式。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 一个空的 [SizeF](./) 类实例，其宽度和高度值为 0。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
