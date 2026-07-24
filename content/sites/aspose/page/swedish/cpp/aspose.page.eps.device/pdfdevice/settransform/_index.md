---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform metod"
linktitle: "SetTransform"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform metod. Anger den aktuella transformen. Eftersom de flesta utdataformat inte implementerar denna funktionalitet beräknas den inversa transformen av currentTransform och multipliceras med den transform som ska sättas. Resultatet vidarebefordras sedan genom ett anrop till writeTransform(Transform) i C++."
type: docs
weight: 5800
url: /sv/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Anger den aktuella transformationen. Eftersom de flesta utdataformat inte implementerar denna funktionalitet beräknas den inversa transformationen av currentTransform och multipliceras med den transformation som ska sättas. Resultatet vidarebefordras sedan genom ett anrop till writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transform som ska tillämpas. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
