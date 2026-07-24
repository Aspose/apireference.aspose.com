---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metodo"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metodo. Disegna l'immagine trasparente trasformata. Se l'immagine non ha canale Alpha verrà disegnata come immagine opaca in C++."
type: docs
weight: 2000
url: /it/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Disegna un'immagine trasparente trasformata. Se l'immagine non ha canale Alpha, verrà disegnata come immagine opaca.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| immagine | System::SharedPtr\<System::Drawing::Bitmap\> | L'immagine da disegnare. |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | La matrice per trasformare l'immagine. |
| transparencyThreshold | int32_t | Una soglia che definisce a partire da quale valore di trasparenza il pixel sarà interpretato come completamente trasparente. Tutti i valori al di sotto di questa soglia saranno interpretati come completamente opachi. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
