---
title: "System::Drawing::Imaging::ImageCodecInfo فئة"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::ImageCodecInfo class. يوفر معلومات حول برنامج ترميز الصور. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


يوفر معلومات حول برنامج ترميز الصور. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageCodecInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | يعيد GUID المرتبط بتنسيق برنامج الترميز الذي تمثله الكائن الحالي. |
| [get_MimeType](./get_mimetype/)() | يعيد نوع Multipurpose Internet Mail Extensions (MIME) لبرنامج الترميز الذي تمثله الكائن الحالي. |
| static [GetImageDecoders](./getimagedecoders/)() | يعيد مصفوفة من كائنات [ImageCodecInfo](./) التي تمثل محولات فك الترميز المدعومة. |
| static [GetImageEncoders](./getimageencoders/)() | يعيد مصفوفة من كائنات [ImageCodecInfo](./) التي تمثل محولات الترميز المدعومة. |
| [set_FormatID](./set_formatid/)(const Guid\&) | يضبط GUID المرتبط بتنسيق برنامج الترميز الذي تمثله الكائن الحالي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
