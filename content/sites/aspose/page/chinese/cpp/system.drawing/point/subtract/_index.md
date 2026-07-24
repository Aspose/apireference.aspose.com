---
title: "System::Drawing::Point::Subtract 方法"
linktitle: "减法"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Point::Subtract 方法。在 C++ 中，将指定 Size 对象的宽度和高度值分别从指定 Point 对象的 X 和 Y 坐标值中减去。"
type: docs
weight: 1800
url: /zh/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


分别将指定的 [Size](../../size/) 对象的宽度和高度值从指定的 [Point](../) 对象的 X 和 Y 坐标值中减去。

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 点 | const Point\& | 要平移的点 |
| size | const Size\& | 用于指定从 **point** 的坐标值中减去的数值的 [Size](../../size/) 对象 |

### ReturnValue

一个新的 [Point](../) 对象，其 X 坐标值等于 **size** 的宽度值从 **point** 的 X 坐标值中减去的结果，Y 坐标值等于 **size** 的高度值从 **point** 的 Y 坐标值中减去的结果。

## 另见

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
