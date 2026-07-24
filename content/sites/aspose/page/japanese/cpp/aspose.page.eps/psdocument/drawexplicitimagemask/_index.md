---
title: "Aspose::Page::EPS::PsDocument::DrawExplicitImageMask メソッド"
linktitle: "DrawExplicitImageMask"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::DrawExplicitImageMask メソッド。C++ でマスクされた画像を描画します。"
type: docs
weight: 1200
url: /ja/cpp/aspose.page.eps/psdocument/drawexplicitimagemask/
---
## PsDocument::DrawExplicitImageMask method


マスクされた画像を描画します。

```cpp
void Aspose::Page::EPS::PsDocument::DrawExplicitImageMask(System::SharedPtr<System::Drawing::Bitmap> image24bpp, System::SharedPtr<System::Drawing::Bitmap> alphaMask1bpp, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| image24bpp | System::SharedPtr\<System::Drawing::Bitmap\> | 描画する画像。24bpp RGB 画像形式である必要があります。 |
| alphaMask1bpp | System::SharedPtr\<System::Drawing::Bitmap\> | 画像マスク。1bpp 画像形式である必要があります。 |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 画像を変換するための行列。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
