---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage 方法。绘制已变换的透明图像。如果图像没有 Alpha 通道，则在 C++ 中将其绘制为不透明图像。"
type: docs
weight: 2000
url: /zh/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


绘制变换后的透明图像。如果图像没有 Alpha 通道，则会以不透明图像绘制。

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | 要绘制的图像。 |
| 变换 | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 用于变换图像的矩阵。 |
| transparencyThreshold | int32_t | 一个阈值，用于定义从哪个透明度值开始像素被解释为完全透明。低于此阈值的所有值将被解释为完全不透明。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
