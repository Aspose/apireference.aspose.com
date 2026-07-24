---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metod"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metod. Rita transformerad transparent bild. Om bilden inte har en Alpha-kanal kommer den att ritas som en ogenomskinlig bild i C++."
type: docs
weight: 2000
url: /sv/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Ritar transformerad transparent bild. Om bilden inte har en Alpha-kanal kommer den att ritas som en opak bild.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bild | System::SharedPtr\<System::Drawing::Bitmap\> | Bilden att rita. |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Matrisen för att transformera bilden. |
| transparencyThreshold | int32_t | Ett tröskelvärde som definierar från vilket transparensvärde en pixel kommer att tolkas som helt transparent. Alla värden under detta tröskelvärde kommer att tolkas som helt ogenomskinliga. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
