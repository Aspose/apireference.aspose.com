---
title: "System::Drawing::Graphics::DrawClosedCurve 方法"
linktitle: "DrawClosedCurve"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Graphics::DrawClosedCurve 方法。使用指定的笔在 C++ 中绘制闭合样条曲线。"
type: docs
weight: 1300
url: /zh/cpp/system.drawing/graphics/drawclosedcurve/
---
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) method


使用指定的笔绘制闭合样条。

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<Point> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| pen | const SharedPtr\<Pen\>\& | 绘制样条曲线时使用的画笔 |
| points | const ArrayPtr\<Point\>\& | [Array](../../../system/array/) 用于确定样条曲线的点 |
| 张力 | 单精度浮点数 | 指定样条曲线张力的值 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) method


使用指定的笔绘制闭合样条。

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<PointF> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| pen | const SharedPtr\<Pen\>\& | 绘制样条曲线时使用的画笔 |
| points | const ArrayPtr\<PointF\>\& | [Array](../../../system/array/) 用于确定样条曲线的点 |
| 张力 | 单精度浮点数 | 指定样条曲线张力的值 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
