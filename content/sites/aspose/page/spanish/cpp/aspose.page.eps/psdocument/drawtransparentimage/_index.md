---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage método"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage método. Dibuja una imagen transparente transformada. Si la imagen no tiene canal Alpha, se dibujará como una imagen opaca en C++."
type: docs
weight: 2000
url: /es/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Dibuja una imagen transparente transformada. Si la imagen no tiene canal Alfa, se dibujará como una imagen opaca.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | System::SharedPtr\<System::Drawing::Bitmap\> | La imagen a dibujar. |
| transformación | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | La matriz para transformar la imagen. |
| transparencyThreshold | int32_t | Un umbral que define a partir de qué valor de transparencia el píxel se interpretará como totalmente transparente. Todos los valores por debajo de este umbral se interpretarán como totalmente opacos. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
