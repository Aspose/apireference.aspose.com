---
title: "System::Drawing::Point::Subtract 方法"
linktitle: "减去"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Point::Subtract 方法。在 C++ 中，将指定的 Size 对象的宽度和高度值分别从指定的 Point 对象的 X 和 Y 坐标值中减去。"
type: docs
weight: 1800
url: /zh/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


分别从指定的 [Point](../) 对象的 X 和 Y 坐标值中减去指定的 [Size](../../size/) 对象的宽度和高度值。

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 点 | const Point\& | 要平移的点 |
| size | const Size\& | 指定要从 **point** 的坐标值中减去的值的 [Size](../../size/) 对象 |

### ReturnValue

一个新的 [Point](../) 对象，其 X 坐标值等于 **size** 的宽度值从 **point** 的 X 坐标值中减去的结果，Y 坐标值等于 **size** 的高度值从 **point** 的 Y 坐标值中减去的结果

## 另见

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
