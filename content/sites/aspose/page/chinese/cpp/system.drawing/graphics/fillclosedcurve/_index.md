---
title: "System::Drawing::Graphics::FillClosedCurve 方法"
linktitle: "FillClosedCurve"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Graphics::FillClosedCurve 方法。在 C++ 中使用指定的画刷绘制闭合样条曲线。"
type: docs
weight: 3200
url: /zh/cpp/system.drawing/graphics/fillclosedcurve/
---
## Graphics::FillClosedCurve(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) method


使用指定的画笔绘制闭合样条曲线。

```cpp
void System::Drawing::Graphics::FillClosedCurve(const SharedPtr<Brush> &brush, const ArrayPtr<Point> &points, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate, float tension=0.5f)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 画刷 | const SharedPtr\<Brush\>\& | 绘制样条曲线时使用的画刷 |
| points | const ArrayPtr\<Point\>\& | [Array](../../../system/array/) 用于确定样条曲线的点 |
| fillmode | Drawing2D::FillMode | IGNORED |
| 张力 | 单精度浮点数 | 指定样条曲线张力的值 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Brush](../../brush/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::FillClosedCurve(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) method


使用指定的画笔绘制闭合样条曲线。

```cpp
void System::Drawing::Graphics::FillClosedCurve(const SharedPtr<Brush> &brush, const ArrayPtr<PointF> &points, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate, float tension=0.5f)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 画刷 | const SharedPtr\<Brush\>\& | 绘制样条曲线时使用的画刷 |
| points | const ArrayPtr\<PointF\>\& | [Array](../../../system/array/) 用于确定样条曲线的点 |
| fillmode | Drawing2D::FillMode | IGNORED |
| 张力 | 单精度浮点数 | 指定样条曲线张力的值 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Brush](../../brush/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
