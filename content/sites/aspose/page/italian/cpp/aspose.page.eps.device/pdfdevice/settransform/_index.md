---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. Specifica la trasformazione corrente. Poiché la maggior parte dei formati di output non implementa questa funzionalità, la trasformazione inversa di currentTransform viene calcolata e moltiplicata per la trasformazione da impostare. Il risultato viene quindi inoltrato tramite una chiamata a writeTransform(Transform) in C++."
type: docs
weight: 5800
url: /it/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Specifica la trasformazione corrente. Poiché la maggior parte dei formati di output non implementa questa funzionalità, l'inversa della trasformazione currentTransform viene calcolata e moltiplicata per la trasformazione da impostare. Il risultato viene poi inoltrato tramite una chiamata a writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Trasformazione da applicare. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
