---
title: Aspose::Page::EPS::PsDocument::DrawTransparentImage method
linktitle: DrawTransparentImage
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::DrawTransparentImage method. Draw transformed transparent image. If image doesn''t have Alpha channel it will be drawn as opaque image in C++.'
type: docs
weight: 1900
url: /cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Draw transformed transparent image. If image doesn't have Alpha channel it will be drawn as opaque image.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | Description |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | The image to draw. |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | The matrix to transform image. |
| transparencyThreshold | int32_t | A threshold that defines from which value of transparency pixel will be interpreted as fully transparent. All values below this threshold will be interpreted as fully opaque. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
