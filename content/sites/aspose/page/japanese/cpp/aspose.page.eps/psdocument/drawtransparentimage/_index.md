---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage メソッド"
linktitle: "DrawTransparentImage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage メソッド。変換された透過画像を描画します。画像にアルファチャンネルがない場合、C++ では不透明画像として描画されます。"
type: docs
weight: 2000
url: /ja/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


変換された透過画像を描画します。画像にアルファチャンネルがない場合は不透明画像として描画されます。

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 画像 | System::SharedPtr\<System::Drawing::Bitmap\> | 描画する画像。 |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 画像を変換するための行列。 |
| transparencyThreshold | int32_t | 透過度ピクセルが完全に透過と解釈される閾値を定義するしきい値。この閾値未満のすべての値は完全に不透明として解釈されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
