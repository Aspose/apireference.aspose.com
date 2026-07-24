---
title: "فئة System::Drawing::Imaging::ImageCodecInfo"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::Imaging::ImageCodecInfo. توفر معلومات حول برنامج ترميز الصور. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


توفر معلومات حول برنامج ترميز الصور. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageCodecInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | يرجع GUID المرتبط بتنسيق برنامج الترميز الممثّل بواسطة الكائن الحالي. |
| [get_MimeType](./get_mimetype/)() | يرجع نوع Multipurpose Internet Mail Extensions (MIME) لبرنامج الترميز الممثّل بالكائن الحالي. |
| static [GetImageDecoders](./getimagedecoders/)() | يرجع مصفوفة من كائنات [ImageCodecInfo](./) التي تمثّل محولات فك ترميز الصور المدعومة. |
| static [GetImageEncoders](./getimageencoders/)() | يرجع مصفوفة من كائنات [ImageCodecInfo](./) التي تمثّل محولات ترميز الصور المدعومة. |
| [set_FormatID](./set_formatid/)(const Guid\&) | يضبط GUID المرتبط بتنسيق برنامج الترميز الممثّل بالكائن الحالي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
