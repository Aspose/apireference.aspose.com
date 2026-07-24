---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes طريقة"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes طريقة. يحفظ المستند بتنسيق صورة bitmap كمصفوفات بايت في C++."
type: docs
weight: 5600
url: /ar/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


يحفظ المستند بتنسيق صورة bitmap كمصفوفات بايت.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| خيارات | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | خيارات حفظ المستند بتنسيق صورة نقطية. |

### ReturnValue

مصفوفات بايت للصور الناتجة. البُعد الأول مخصص للمستندات الداخلية والبُعد الثاني للصفحات داخل المستندات الداخلية.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
