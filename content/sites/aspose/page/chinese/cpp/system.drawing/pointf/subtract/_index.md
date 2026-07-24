---
title: "System::Drawing::PointF::Subtract 方法"
linktitle: "减法"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::PointF::Subtract 方法。对应地从指定的 PointF 对象的 X 和 Y 坐标值中减去指定 Size 对象的宽度和高度值（C++）。"
type: docs
weight: 1300
url: /zh/cpp/system.drawing/pointf/subtract/
---
## PointF::Subtract(const PointF\&, const Size\&) method


从指定的 [Size](../../size/) 对象的宽度和高度值中对应地减去指定的 [PointF](../) 对象的 X 和 Y 坐标值。

```cpp
static PointF System::Drawing::PointF::Subtract(const PointF &point, const Size &size)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 点 | const PointF\& | 要平移的点 |
| size | const Size\& | 用于指定从 **point** 的坐标值中减去的数值的 [Size](../../size/) 对象 |

### ReturnValue

一个新的 [PointF](../) 对象，其 X 坐标值等于从 **point** 的 X 坐标值中减去 **size** 的宽度值的结果，Y 坐标值等于从 **point** 的 Y 坐标值中减去 **size** 的高度值的结果。

## 另见

* Class [PointF](../)
* Class [Size](../../size/)
* Class [PointF](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## PointF::Subtract(const PointF\&, const SizeF\&) method


从指定的 [PointF](../) 对象的 X 和 Y 坐标值中对应地减去指定的 [SizeF](../../sizef/) 对象的宽度和高度值。

```cpp
static PointF System::Drawing::PointF::Subtract(const PointF &point, const SizeF &size)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 点 | const PointF\& | 要平移的点 |
| size | const SizeF\& | 用于指定从 **point** 的坐标值中减去的数值的 [SizeF](../../sizef/) 对象 |

### ReturnValue

一个新的 [PointF](../) 对象，其 X 坐标值等于从 **point** 的 X 坐标值中减去 **size** 的宽度值的结果，Y 坐标值等于从 **point** 的 Y 坐标值中减去 **size** 的高度值的结果。

## 另见

* Class [PointF](../)
* Class [SizeF](../../sizef/)
* Class [PointF](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
