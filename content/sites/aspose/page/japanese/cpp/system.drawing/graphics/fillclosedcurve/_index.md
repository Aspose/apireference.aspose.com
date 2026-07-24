---
title: "System::Drawing::Graphics::FillClosedCurve メソッド"
linktitle: "FillClosedCurve"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::FillClosedCurve メソッド。C++ で指定されたブラシを使用して閉じたスプラインを描画します。"
type: docs
weight: 3200
url: /ja/cpp/system.drawing/graphics/fillclosedcurve/
---
## Graphics::FillClosedCurve(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) method


指定されたブラシを使用して閉じたスプラインを描画します。

```cpp
void System::Drawing::Graphics::FillClosedCurve(const SharedPtr<Brush> &brush, const ArrayPtr<Point> &points, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate, float tension=0.5f)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ブラシ | const SharedPtr\<Brush\>\& | スプラインを描画するときに使用するブラシ |
| points | const ArrayPtr\<Point\>\& | [Array](../../../system/array/) スプラインを決定する点の配列 |
| fillmode | Drawing2D::FillMode | IGNORED |
| テンション | 単精度浮動小数点数 | スプラインのテンションを指定する値 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Brush](../../brush/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::FillClosedCurve(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) method


指定されたブラシを使用して閉じたスプラインを描画します。

```cpp
void System::Drawing::Graphics::FillClosedCurve(const SharedPtr<Brush> &brush, const ArrayPtr<PointF> &points, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate, float tension=0.5f)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ブラシ | const SharedPtr\<Brush\>\& | スプラインを描画するときに使用するブラシ |
| points | const ArrayPtr\<PointF\>\& | [Array](../../../system/array/) スプラインを決定する点の配列 |
| fillmode | Drawing2D::FillMode | IGNORED |
| テンション | 単精度浮動小数点数 | スプラインのテンションを指定する値 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Brush](../../brush/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
