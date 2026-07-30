---
title: "فئة System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Drawing::Imaging::ImageFormat. تمثل تنسيق ملف الصورة. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


تمثل تنسيق ملف الصورة. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageFormat : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | يحدد ما إذا كانت تنسيقات الصور التي تمثلها الكائنات الحالية والمحددة متساوية. |
| static [get_Bmp](./get_bmp/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة البتّات. |
| static [get_Emf](./get_emf/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق ملف ميتافايل المحسّن. |
| static [get_Exif](./get_exif/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق ملف [Image](../../system.drawing/image/) القابل للتبادل (Exif). |
| static [get_Gif](./get_gif/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | يرجع الـ GUID المرتبط بتنسيق الصورة الذي تمثله الكائن الحالي. |
| static [get_Icon](./get_icon/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة أيقونة [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق البتّات في الذاكرة. |
| static [get_Png](./get_png/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | يرجع مؤشرًا مشتركًا إلى كائن [ImageFormat](./) يمثل تنسيق صورة ملف ميتافايل [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | ينشئ نسخة من فئة [ImageFormat](./) التي تمثل تنسيق صورة مرتبط بالـ GUID المحدد. |
| virtual [ToString](./tostring/)() const | يحوّل هذا الكائن [ImageFormat](./) إلى سلسلة قابلة للقراءة من قبل الإنسان. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
