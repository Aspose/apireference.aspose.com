---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage Methode"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage Methode. Zeichnet ein transformiertes transparentes Bild. Wenn das Bild keinen Alpha-Kanal hat, wird es in C++ als undurchsichtiges Bild gezeichnet."
type: docs
weight: 2000
url: /de/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Zeichnet ein transformiertes transparentes Bild. Wenn das Bild keinen Alpha channel hat, wird es als undurchsichtiges Bild gezeichnet.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bild | System::SharedPtr\<System::Drawing::Bitmap\> | Das Bild zum Zeichnen. |
| Transformation | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Die Matrix zur Bildtransformation. |
| transparencyThreshold | int32_t | Ein Schwellenwert, der definiert, ab welchem Transparenzwert ein Pixel als vollständig transparent interpretiert wird. Alle Werte unterhalb dieses Schwellenwerts werden als vollständig undurchsichtig interpretiert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
