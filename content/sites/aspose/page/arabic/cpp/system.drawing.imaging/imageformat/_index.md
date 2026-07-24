---
title: "فئة System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::Imaging::ImageFormat. تمثل تنسيق ملف الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


تمثل تنسيق ملف الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageFormat : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | يحدد ما إذا كانت تنسيقات الصور التي تمثلها الكائنات الحالية والمحددة متساوية. |
| static [get_Bmp](./get_bmp/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة البتّات. |
| static [get_Emf](./get_emf/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق الميتافيل المحسّن. |
| static [get_Exif](./get_exif/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق ملف الصورة القابل للتبادل (Exif) [Image](../../system.drawing/image/). |
| static [get_Gif](./get_gif/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة تنسيق تبادل الرسومات (GIF) [Graphics](../../system.drawing/graphics/). |
| [get_Guid](./get_guid/)() const | يعيد الـ GUID المرتبط بتنسيق الصورة الممثل بواسطة الكائن الحالي. |
| static [get_Icon](./get_icon/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة أيقونة [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة مجموعة خبراء التصوير الفوتوغرافي المشتركة (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق البتّات في الذاكرة. |
| static [get_Png](./get_png/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة شبكة محمولة (PNG) من W3C [Graphics](../../system.drawing/graphics/). |
| static [get_Tiff](./get_tiff/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة ملف الصورة الموسومة (TIFF) [Image](../../system.drawing/image/). |
| static [get_Wmf](./get_wmf/)() | يعيد مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة ملف ميتافيل [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | ينشئ مثيلًا من فئة [ImageFormat](./) يمثل تنسيق صورة مرتبط بالـ GUID المحدد. |
| virtual [ToString](./tostring/)() const | يحوّل هذا الكائن [ImageFormat](./) إلى سلسلة قابلة للقراءة من قبل الإنسان. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
