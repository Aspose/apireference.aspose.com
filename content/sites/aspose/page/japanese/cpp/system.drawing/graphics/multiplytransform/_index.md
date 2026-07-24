---
title: "System::Drawing::Graphics::MultiplyTransform メソッド"
linktitle: "MultiplyTransform"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::MultiplyTransform メソッド。現在の Graphics オブジェクトのワールド変換行列を指定された行列で乗算します（C++）。"
type: docs
weight: 6600
url: /ja/cpp/system.drawing/graphics/multiplytransform/
---
## Graphics::MultiplyTransform method


現在の [Graphics](../) オブジェクトのワールド変換行列を指定された行列で乗算します。

```cpp
void System::Drawing::Graphics::MultiplyTransform(const SharedPtr<Drawing2D::Matrix> &matrix, Drawing2D::MatrixOrder order=Drawing2D::MatrixOrder::Prepend)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| matrix | const SharedPtr\<Drawing2D::Matrix\>\& | 現在の [Graphics](../) オブジェクトのワールド変換行列を乗算するための行列 |
| 順序 | Drawing2D::MatrixOrder | 乗算順序 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Enum [MatrixOrder](../../../system.drawing.drawing2d/matrixorder/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
