---
title: Aspose::Page::EPS::Device::PdfDevice::SetTransform method
linktitle: SetTransform
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::Device::PdfDevice::SetTransform method. Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform) in C++.'
type: docs
weight: 5800
url: /cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transform to be applied. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
