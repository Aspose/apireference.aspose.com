---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform Methode"
linktitle: "SetTransform"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform Methode. Gibt die aktuelle Transformation an. Da die meisten Ausgabeformate diese Funktionalität nicht implementieren, wird die inverse Transformation von currentTransform berechnet und mit der zu setzenden Transformation multipliziert. Das Ergebnis wird dann durch einen Aufruf von writeTransform(Transform) in C++ weitergeleitet."
type: docs
weight: 5800
url: /de/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Gibt die aktuelle Transformation an. Da die meisten Ausgabeformate diese Funktionalität nicht implementieren, wird die inverse Transformation von currentTransform berechnet und mit der zu setzenden Transformation multipliziert. Das Ergebnis wird dann durch einen Aufruf von writeTransform(Transform) weitergeleitet.

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Transformation | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transformation, die angewendet werden soll. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
