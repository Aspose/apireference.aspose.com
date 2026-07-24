---
title: "System::Drawing::Rectangle::Inflate 方法"
linktitle: "Inflate"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Rectangle::Inflate 方法。增加当前对象所表示的矩形的宽度和高度，同时保持矩形几何中心的位置。宽度和高度分别按指定的 Size 对象的宽度和高度值在两个方向上增加，适用于 C++。"
type: docs
weight: 1600
url: /zh/cpp/system.drawing/rectangle/inflate/
---
## Rectangle::Inflate(const Size\&) method


在保持矩形几何中心位置不变的情况下，增加当前对象表示的矩形的宽度和高度。宽度和高度在两个方向上分别按指定尺寸对象的宽度和高度值增加。

```cpp
void System::Drawing::Rectangle::Inflate(const Size &size)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| size | const Size\& | 指定用于增加矩形宽度和高度的量的 [Size](../../size/) 对象 |

## 另见

* Class [Size](../../size/)
* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Rectangle::Inflate(int, int) method


在保持矩形几何中心位置不变的情况下，增加当前对象表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。

```cpp
void System::Drawing::Rectangle::Inflate(int width, int height)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| width | int | 矩形宽度在两个方向上增加的量 |
| height | int | 矩形高度在两个方向上增加的量 |

## 另见

* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Rectangle::Inflate(const Rectangle\&, int, int) method


在保持矩形几何中心位置不变的情况下，增加指定对象表示的矩形的宽度和高度。宽度和高度在两个方向上均按指定的量增加。

```cpp
static Rectangle System::Drawing::Rectangle::Inflate(const Rectangle &rect, int x, int y)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| rect | const Rectangle\& | 要膨胀的矩形 |
| x | int | 矩形宽度在两个方向上增加的量 |
| y | int | 矩形高度在两个方向上增加的量 |

### ReturnValue

表示放大后矩形的 [Rectangle](../) 对象

## 另见

* Class [Rectangle](../)
* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
