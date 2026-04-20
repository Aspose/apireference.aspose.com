---
title: "System::Drawing::Bitmap فئة"
linktitle: "Bitmap"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Bitmap فئة. تمثل صورة bitmap من نوع GDI+. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing/bitmap/
---
## Bitmap class


تمثل صورة bitmap من نوع GDI+. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Bitmap : public System::Drawing::Image
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | يفعل وضع معالجة البكسل. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | ينشئ كائن [Bitmap](./) جديد من الصورة الموجودة المحددة. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | ينشئ كائن [Bitmap](./) جديد من الدفق المحدد. |
| [Bitmap](./bitmap/)(const String\&) | ينشئ كائن [Bitmap](./) جديد من الملف المحدد. |
| [Bitmap](./bitmap/)(const String\&, bool) | ينشئ كائن [Bitmap](./) جديد من الملف المحدد. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | ينشئ كائن [Bitmap](./) جديد يمثل صورة bitmap بالعرض والارتفاع وتنسيق البكسل والبيانات المحددة. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | ينشئ كائن [Bitmap](./) جديد من الصورة الموجودة المحددة، مُقاساً إلى الحجم المحدد. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | ينشئ كائن [Bitmap](./) جديد من الصورة الموجودة المحددة مع تعديل العرض والارتفاع إلى القيم المحددة. |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | ينشئ كائن [Bitmap](./) يمثل نسخة من منطقة من صورة bitmap التي يمثلها الكائن الحالي. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | ينشئ كائن [Bitmap](./) يمثل نسخة من منطقة من صورة bitmap التي يمثلها الكائن الحالي. |
| [ComputeHash](./computehash/)() | يحسب قيمة تجزئة SHA1. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | ينشئ نسخة من صورة bitmap المحددة مع تغيير تنسيق البكسل إلى Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | يعطل وضع معالجة البكسل. |
| [get_Height](./get_height/)() const override | يعيد ارتفاع الصورة بالبكسل. |
| [get_Palette](./get_palette/)() const override | يعيد لوحة الألوان المستخدمة في الصورة التي يمثلها الكائن الحالي. |
| [get_PixelFormat](./get_pixelformat/)() const override | يعيد تنسيق البكسل للصورة التي يمثلها الكائن الحالي. |
| [get_RawFormat](./get_rawformat/)() const override | يعيد تنسيق الملف للصورة التي يمثلها الكائن الحالي. |
| [get_Width](./get_width/)() const override | يعيد عرض الصورة بالبكسل. |
| [GetHbitmap](./gethbitmap/)() | ينشئ كائن bitmap من نوع GDI من الـ bitmap الذي يمثله الكائن الحالي. |
| [GetPixel](./getpixel/)(int, int) | يعيد لون البكسل المحدد. |
| [GetSkBitmap](./getskbitmap/)() const override | يعيد مؤشرًا خامًا إلى كائن SkBitmap الأساسي. |
| [IsMultiImage](./ismultiimage/)() const override | يعيد ما إذا كان التنسيق الأصلي هو صورة متعددة. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | يقفل كائن [Bitmap](./) في ذاكرة النظام. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | يقفل كائن [Bitmap](./) في ذاكرة النظام. |
| [MakeTransparent](./maketransparent/)(Color) | يغيّر لون جميع البكسلات ذات اللون المحدد إلى شفاف. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | يقوم بالضرب المسبق لألوان بكسلات الصورة التي يمثلها الكائن الحالي. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | يدور الصورة إلى مضاعفات 90 درجة ويقلبها. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | يضبط لوحة الألوان المستخدمة بواسطة الصورة التي يمثلها الكائن الحالي. |
| [SetPixel](./setpixel/)(int, int, Color) | يضبط لون البكسل المحدد في صورة bitmap التي يمثلها الكائن الحالي. |
| [SetResolution](./setresolution/)(float, float) | يضبط دقة الصورة. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | يفك قفل صورة bitmap المحددة من ذاكرة النظام. |
## انظر أيضًا

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
