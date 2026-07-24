---
title: "System::Drawing::Graphics::DrawClosedCurve method"
linktitle: "DrawClosedCurve"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics::DrawClosedCurve method. 지정된 펜을 사용하여 닫힌 스플라인을 그립니다(C++)."
type: docs
weight: 1300
url: /ko/cpp/system.drawing/graphics/drawclosedcurve/
---
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) method


지정된 펜을 사용하여 닫힌 스플라인을 그립니다.

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<Point> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 펜 | const SharedPtr\\<Pen\\>\\& | 스플라인을 그릴 때 사용할 펜 |
| points | const ArrayPtr\<Point\>\& | 스플라인을 결정하는 점들의 [Array](../../../system/array/) |
| 텐션 | float | 스플라인의 텐션을 지정하는 값 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) method


지정된 펜을 사용하여 닫힌 스플라인을 그립니다.

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<PointF> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 펜 | const SharedPtr\\<Pen\\>\\& | 스플라인을 그릴 때 사용할 펜 |
| points | const ArrayPtr\<PointF\>\& | 스플라인을 결정하는 점들의 [Array](../../../system/array/) |
| 텐션 | float | 스플라인의 텐션을 지정하는 값 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
