---
title: "System::Drawing::RectangleF::Inflate 方法"
linktitle: "Inflate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::RectangleF::Inflate 方法。增加当前对象所表示的矩形的宽度和高度，同时保持矩形几何中心的位置。宽度和高度在两个方向上均按指定尺寸对象的宽度和高度值所指定的量进行相应增加（在 C++ 中）。"
type: docs
weight: 1600
url: /zh/cpp/system.drawing/rectanglef/inflate/
---
## RectangleF::Inflate(const SizeF\&) method


在保持矩形几何中心位置不变的情况下，增加当前对象所表示的矩形的宽度和高度。宽度和高度分别按指定尺寸对象的宽度和高度值对应的量增加。

```cpp
void System::Drawing::RectangleF::Inflate(const SizeF &size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| size | const SizeF\& | 指定矩形宽度和高度增加量的 [SizeF](../../sizef/) 对象 |

## 另见

* Class [SizeF](../../sizef/)
* Class [RectangleF](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## RectangleF::Inflate(float, float) method


在保持矩形几何中心位置不变的情况下，增加当前对象所表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。

```cpp
void System::Drawing::RectangleF::Inflate(float width, float height)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| width | float | 矩形宽度在两个方向上要增加的量 |
| height | float | 矩形高度在两个方向上要增加的量 |

## 另见

* Class [RectangleF](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## RectangleF::Inflate(const RectangleF\&, float, float) method


在保持矩形几何中心位置不变的情况下，增加指定对象所表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。

```cpp
static RectangleF System::Drawing::RectangleF::Inflate(const RectangleF &rect, float x, float y)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rect | const RectangleF\& | 要膨胀的矩形 |
| x | float | 矩形宽度在两个方向上要增加的量 |
| y | float | 矩形高度在两个方向上要增加的量 |

### ReturnValue

表示放大后矩形的 [RectangleF](../) 对象

## 另见

* Class [RectangleF](../)
* Class [RectangleF](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
