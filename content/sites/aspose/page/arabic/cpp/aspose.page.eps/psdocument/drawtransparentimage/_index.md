---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage طريقة"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage طريقة. ارسم صورة شفافة محوّلة. إذا لم تكن الصورة تحتوي على قناة ألفا فستُرسم كصورة غير شفافة في C++."
type: docs
weight: 2000
url: /ar/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


يرسم صورة شفافة محوّلة. إذا لم يكن للصورة قناة ألفا فستُرسم كصورة غير شفافة.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| صورة | System::SharedPtr\<System::Drawing::Bitmap\> | الصورة المراد رسمها. |
| تحويل | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | المصفوفة لتحويل الصورة. |
| transparencyThreshold | int32_t | حدّ يحدد من أي قيمة شفافية سيتم تفسير بكسل الصورة على أنه شفاف تمامًا. جميع القيم التي تقل عن هذا الحد ستُفسّر على أنها غير شفافة تمامًا. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
