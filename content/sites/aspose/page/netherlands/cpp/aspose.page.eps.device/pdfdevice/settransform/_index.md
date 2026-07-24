---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. Specificeert de huidige transformatie. Aangezien de meeste uitvoerformaten deze functionaliteit niet implementeren, wordt de inverse transformatie van de currentTransform berekend en vermenigvuldigd met de in te stellen transformatie. Het resultaat wordt vervolgens doorgestuurd via een aanroep naar writeTransform(Transform) in C++."
type: docs
weight: 5800
url: /nl/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Specificeert de huidige transformatie. Aangezien de meeste outputformaten deze functionaliteit niet implementeren, wordt de inverse transformatie van currentTransform berekend en vermenigvuldigd met de in te stellen transformatie. Het resultaat wordt vervolgens doorgestuurd via een aanroep van writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| transformatie | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transformatie die moet worden toegepast. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
