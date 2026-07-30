---
title: "System::Drawing::Point::Add method"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Point::Add 方法。将指定 Size 对象的宽度和高度值分别添加到指定 Point 对象的 X 和 Y 坐标值（在 C++ 中）。"
type: docs
weight: 1500
url: /zh/cpp/system.drawing/point/add/
---
## Point::Add method


将指定的 [Size](../../size/) 对象的宽度和高度值分别添加到指定的 [Point](../) 对象的 X 和 Y 坐标值。

```cpp
static Point System::Drawing::Point::Add(const Point &point, const Size &size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 点 | const Point\& | 要平移的点 |
| size | const Size\& | 指定要添加到 **point** 坐标值的数值的 [Size](../../size/) 对象 |

### ReturnValue

一个新的 [Point](../) 对象，其 X 坐标值等于 **point** 的 X 坐标值与 **size** 的宽度值之和，Y 坐标值等于 **point** 的 Y 坐标值与 **size** 的高度值之和。

## 另见

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
