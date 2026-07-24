---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method. Tekent een getransformeerde transparante afbeelding. Als de afbeelding geen Alpha-kanaal heeft, wordt deze als een ondoorzichtige afbeelding getekend in C++."
type: docs
weight: 2000
url: /nl/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Tekent een getransformeerde transparante afbeelding. Als de afbeelding geen alfakanaal heeft, wordt deze getekend als een ondoorzichtige afbeelding.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| afbeelding | System::SharedPtr\<System::Drawing::Bitmap\> | De afbeelding om te tekenen. |
| transformatie | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | De matrix om de afbeelding te transformeren. |
| transparencyThreshold | int32_t | Een drempel die bepaalt vanaf welke transparantiewaarde een pixel als volledig transparant wordt geïnterpreteerd. Alle waarden onder deze drempel worden als volledig ondoorzichtig geïnterpreteerd. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
