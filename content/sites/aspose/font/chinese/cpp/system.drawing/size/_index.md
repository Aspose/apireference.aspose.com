---
title: "System::Drawing::Size 类"
linktitle: "Size"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Size 类。表示一对整数值，代表图像的宽度和高度。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 2200
url: /zh/cpp/system.drawing/size/
---
## Size class


表示一对整数值，代表图像的宽度和高度。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class Size
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | 返回一个新的 [Size](./) 对象，该对象是指定的 [Size](./) 对象的和，即其宽度值等于指定对象宽度值的总和，高度值等于指定对象高度值的总和。 |
| static [Ceiling](./ceiling/)(const SizeF\&) | 通过将指定的 [SizeF](../sizef/) 对象的宽度和高度值向上取整为下一个整数，构造一个 [Size](./) 对象。 |
| [Equals](./equals/)(const Size\&) const | 确定当前对象和指定对象是否相等，即它们是否表示相同的一对宽度和 hegiht 值。 |
| [get_Height](./get_height/)() const | 返回当前对象表示的 heght 值。 |
| [get_IsEmpty](./get_isempty/)() const | 确定宽度和 hegiht 值是否都等于 0。 |
| [get_Width](./get_width/)() const | 返回当前对象表示的宽度值。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [operator Point](./operatorpoint/)() const | 构造一个 [Point](../point/) 对象的实例，并使用当前对象的宽度和高度值相应地初始化其 X 和 Y 坐标。 |
| [operator SizeF](./operatorsizef/)() const | 构造一个 [SizeF](../sizef/) 对象的实例，并使用当前 [Size](./) 对象的宽度和 hegiht 值进行初始化。 |
| static [Round](./round/)(const SizeF\&) | 通过将指定的 [SizeF](../sizef/) 对象的宽度和高度值四舍五入到最近的整数，构造一个 [Size](./) 对象。 |
| [set_Height](./set_height/)(int) | 设置当前对象表示的高度值。 |
| [set_Width](./set_width/)(int) | 设置当前对象表示的宽度值。 |
| [Size](./size/)() | 构造一个新的 [Size](./) 对象，并将其宽度和高度值初始化为 0。 |
| [Size](./size/)(const Point\&) | 构造一个新的 [Size](./) 对象，并使用指定点的 X 和 Y 坐标值相应地初始化其宽度和高度值。 |
| [Size](./size/)(int, int) | 构造一个新的 [Size](./) 对象，并使用指定的值进行初始化。 |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | 返回一个新的 [Size](./) 对象，它是 **size1** 减去 **size2** 的结果，即其宽度值为 **size1's** 宽度值减去 **size2's** 宽度值的结果，高度值为 **size1's** 高度值减去 **size2's** 高度值的结果。 |
| [ToString](./tostring/)() const | 返回当前对象表示的宽度和高度值对的字符串表示形式。 |
| static [Truncate](./truncate/)(const SizeF\&) | 通过将指定的 [SizeF](../sizef/) 对象的宽度和高度值截断为下一个更低的整数值，构造一个 [Size](./) 对象。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 空的 [Size](./) 类实例，其宽度和高度值为 0。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
