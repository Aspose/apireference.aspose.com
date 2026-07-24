---
title: "System::Drawing::Graphics::DrawClosedCurve method"
linktitle: "DrawClosedCurve"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::DrawClosedCurve method。指定されたペンを使用して閉じたスプラインを描画します（C++）。"
type: docs
weight: 1300
url: /ja/cpp/system.drawing/graphics/drawclosedcurve/
---
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) method


指定されたペンを使用して閉じたスプラインを描画します。

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<Point> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ペン | const SharedPtr\<Pen\>\& | スプラインを描画する際に使用するペン |
| points | const ArrayPtr\<Point\>\& | [Array](../../../system/array/) スプラインを決定する点の配列 |
| テンション | 単精度浮動小数点数 | スプラインのテンションを指定する値 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) method


指定されたペンを使用して閉じたスプラインを描画します。

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<PointF> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ペン | const SharedPtr\<Pen\>\& | スプラインを描画する際に使用するペン |
| points | const ArrayPtr\<PointF\>\& | [Array](../../../system/array/) スプラインを決定する点の配列 |
| テンション | 単精度浮動小数点数 | スプラインのテンションを指定する値 |
| fillmode | Drawing2D::FillMode | IGNORED |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
