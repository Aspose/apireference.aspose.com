---
title: "Aspose::Page::EPS::PsDocument::DrawExplicitImageMask 方法"
linktitle: "DrawExplicitImageMask"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::DrawExplicitImageMask 方法。 在 C++ 中绘制带掩码的图像。"
type: docs
weight: 1200
url: /zh/cpp/aspose.page.eps/psdocument/drawexplicitimagemask/
---
## PsDocument::DrawExplicitImageMask method


绘制遮罩图像。

```cpp
void Aspose::Page::EPS::PsDocument::DrawExplicitImageMask(System::SharedPtr<System::Drawing::Bitmap> image24bpp, System::SharedPtr<System::Drawing::Bitmap> alphaMask1bpp, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| image24bpp | System::SharedPtr\<System::Drawing::Bitmap\> | 要绘制的图像。必须是 24bpp RGB 图像格式 |
| alphaMask1bpp | System::SharedPtr\<System::Drawing::Bitmap\> | 图像掩码。必须是 1bpp 图像格式。 |
| 变换 | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 用于变换图像的矩阵。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
