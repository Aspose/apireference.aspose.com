---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method. Отрисовывает преобразованное прозрачное изображение. Если у изображения нет альфа‑канала, оно будет отрисовано как непрозрачное изображение в C++."
type: docs
weight: 2000
url: /ru/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Отрисовывает преобразованное прозрачное изображение. Если у изображения нет альфа‑канала, оно будет отрисовано как непрозрачное.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| изображение | System::SharedPtr\<System::Drawing::Bitmap\> | Изображение для отрисовки. |
| трансформация | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Матрица для преобразования изображения. |
| transparencyThreshold | int32_t | Порог, определяющий, с какого значения прозрачности пиксель будет считаться полностью прозрачным. Все значения ниже этого порога будут считаться полностью непрозрачными. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
