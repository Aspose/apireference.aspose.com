---
title: "Méthode Aspose::Page::EPS::PsDocument::DrawTransparentImage"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page pour C++"
description: "Méthode Aspose::Page::EPS::PsDocument::DrawTransparentImage. Dessine une image transparente transformée. Si l'image n'a pas de canal Alpha, elle sera dessinée comme une image opaque en C++."
type: docs
weight: 2000
url: /fr/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Dessine une image transparente transformée. Si l'image n'a pas de canal Alpha, elle sera dessinée comme une image opaque.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | L'image à dessiner. |
| transformation | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | La matrice pour transformer l'image. |
| transparencyThreshold | int32_t | Un seuil qui définit à partir de quelle valeur de transparence le pixel sera interprété comme totalement transparent. Toutes les valeurs inférieures à ce seuil seront interprétées comme totalement opaques. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
