---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform método"
linktitle: "SetTransform"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform método. Especifica la transformación actual. Dado que la mayoría de los formatos de salida no implementan esta funcionalidad, se calcula la transformación inversa de currentTransform y se multiplica por la transformación que se va a establecer. El resultado se envía luego mediante una llamada a writeTransform(Transform) en C++."
type: docs
weight: 5800
url: /es/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Especifica la transformación actual. Dado que la mayoría de los formatos de salida no implementan esta funcionalidad, se calcula la transformación inversa de currentTransform y se multiplica por la transformación a establecer. El resultado se envía luego mediante una llamada a writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| transformación | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transformación a aplicar. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
