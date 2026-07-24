---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. يحدد التحويل الحالي. نظرًا لأن معظم صيغ الإخراج لا تدعم هذه الوظيفة، يتم حساب التحويل العكسي لـ currentTransform وضربه في التحويل المراد تعيينه. ثم يتم تمرير النتيجة عبر استدعاء writeTransform(Transform) في C++."
type: docs
weight: 5800
url: /ar/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


يحدد التحويل الحالي. بما أن معظم صيغ الإخراج لا تنفذ هذه الوظيفة، يتم حساب التحويل العكسي للـ currentTransform ويُضرب في التحويل المراد تعيينه. ثم يُمرّر النتيجة عبر استدعاء writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| تحويل | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | التحويل المراد تطبيقه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
