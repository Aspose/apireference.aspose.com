---
title: "System::Drawing::Drawing2D::GraphicsPath::GetBounds method"
linktitle: "GetBounds"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::GraphicsPath::GetBounds メソッド。指定された行列で変換されたときに、現在のオブジェクトが表すパスを囲む矩形を表す RectangleF オブジェクトを返します（C++）。"
type: docs
weight: 2700
url: /ja/cpp/system.drawing.drawing2d/graphicspath/getbounds/
---
## GraphicsPath::GetBounds method


指定された行列で変換されたときに、現在のオブジェクトが表すパスを囲む矩形を表す [RectangleF](../../../system.drawing/rectanglef/) オブジェクトを返します。

```cpp
RectangleF System::Drawing::Drawing2D::GraphicsPath::GetBounds(const MatrixPtr &matrix=nullptr, const SharedPtr<Pen> &pen=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 行列 | const MatrixPtr\& | 変換行列 |
| pen | const SharedPtr\<Pen\>\& | バウンディング矩形を計算するための [Pen](../../../system.drawing/pen/) |

## 参照

* Class [RectangleF](../../../system.drawing/rectanglef/)
* Typedef [MatrixPtr](../../matrixptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../../system.drawing/pen/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
