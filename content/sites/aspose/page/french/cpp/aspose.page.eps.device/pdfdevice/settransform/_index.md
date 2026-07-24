---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform méthode"
linktitle: "SetTransform"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform méthode. Spécifie la transformation actuelle. Puisque la plupart des formats de sortie n’implémentent pas cette fonctionnalité, la transformation inverse de currentTransform est calculée et multipliée par la transformation à définir. Le résultat est ensuite transmis via un appel à writeTransform(Transform) en C++."
type: docs
weight: 5800
url: /fr/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Spécifie la transformation actuelle. Puisque la plupart des formats de sortie n'implémentent pas cette fonctionnalité, la transformation inverse de currentTransform est calculée et multipliée par la transformation à définir. Le résultat est ensuite transmis via un appel à writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| transformation | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transformation à appliquer. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
