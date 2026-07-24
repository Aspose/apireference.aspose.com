---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform metodu"
linktitle: "SetTransform"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform metodu. Mevcut dönüşümü belirtir. Çoğu çıktı formatı bu işlevi uygulamadığından, currentTransform'in ters dönüşümü hesaplanır ve ayarlanacak dönüşümle çarpılır. Sonuç daha sonra C++'ta writeTransform(Transform) çağrısı ile iletilir."
type: docs
weight: 5800
url: /tr/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Mevcut dönüşümü belirtir. Çoğu çıktı formatı bu işlevi uygulamadığından, currentTransform'in ters dönüşümü hesaplanır ve ayarlanacak dönüşümle çarpılır. Sonuç daha sonra writeTransform(Transform) çağrısı ile iletilir.

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| dönüşüm | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Uygulanacak dönüşüm. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
