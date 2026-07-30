---
title: "فئة System::Drawing::Image"
linktitle: "صورة"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Drawing::Image. فئة أساسية لـ System::Drawing::Bitmap و System::Drawing::Metafile توفر وظائف أساسية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.drawing/image/
---
## Image class


فئة أساسية لـ [System::Drawing::Bitmap](../bitmap/) و System::Drawing::Metafile توفر وظائف أساسية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Image : public virtual System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | ينشئ نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد التي حصل عليها الكائن الحالي. |
| static [FromFile](./fromfile/)(const String\&, bool) | ينشئ كائنًا من نوع [Image](./) من الملف المحدد. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | يبني كائنًا من نوع [Bitmap](../bitmap/) من صورة GDI المحددة. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | ينشئ كائنًا من نوع [Image](./) من الدفق المحدد. |
| virtual [get_Flags](./get_flags/)() const | يعيد تركيبة بتية من قيم تعداد ImageFlags التي تمثل خصائص الصورة. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | يعيد مصفوفة من GUIDs التي تمثل أبعاد الإطارات داخل الصورة التي يمثلها الكائن الحالي. |
| virtual [get_Height](./get_height/)() const | يعيد ارتفاع الصورة بالبكسل. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | يعيد الدقة الأفقية للصورة التي يمثلها الكائن الحالي بوحدة بكسل لكل بوصة. |
| virtual [get_Palette](./get_palette/)() const | يعيد لوحة الألوان المستخدمة في الصورة التي يمثلها الكائن الحالي. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | يعيد تنسيق البكسل للصورة التي يمثلها الكائن الحالي. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | يحصل على معرّفات عناصر الخاصية المخزنة في هذه الصورة. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | يحصل على جميع عناصر الخاصية (قطع من البيانات الوصفية) المخزنة في هذه الصورة. |
| virtual [get_RawFormat](./get_rawformat/)() const | يعيد تنسيق الملف للصورة التي يمثلها الكائن الحالي. |
| [get_Size](./get_size/)() const | يعيد كائن [Size](../size/) الذي يمثل عرض وارتفاع الصورة بالبكسل. |
| virtual [get_Tag](./get_tag/)() const | يحصل على كائن يوفر بيانات إضافية حول الصورة. |
| [get_VerticalResolution](./get_verticalresolution/)() const | يعيد الدقة العمودية للصورة التي يمثلها الكائن الحالي بوحدة بكسل لكل بوصة. |
| virtual [get_Width](./get_width/)() const | يعيد عرض الصورة بالبكسل. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | يعيد حدود الصورة بوحدات القياس المحددة. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | يعيد عدد الإطارات للبعد الإطاري المحدد. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | يعيد عدد البتات المستخدمة لتمثيل عمق اللون في تنسيق البكسل المحدد. |
| virtual [GetSkBitmap](./getskbitmap/)() const | يعيد كائن SkBitmap الأساسي. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | يحصل على صورة مصغرة لهذا الكائن [System::Drawing::Image](./). |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | يحدد ما إذا كان تنسيق البكسل المحدد يحتوي على معلومات ألفا. |
| virtual [IsMultiImage](./ismultiimage/)() const | يعيد ما إذا كان التنسيق الأصلي هو صورة متعددة. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | يدور الصورة إلى مضاعف 90 درجة ويعكسها. |
| [Save](./save/)(const String\&) | يحفظ الصورة التي يمثلها الكائن الحالي إلى الملف المحدد بصيغة PNG. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | يحفظ الصورة التي يمثلها الكائن الحالي إلى الملف المحدد بالصيغ المحددة. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | يحفظ الصورة التي يمثلها الكائن الحالي إلى الدفق المحدد بالصيغ المحددة. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | يحفظ الصورة التي يمثلها الكائن الحالي إلى الملف المحدد باستخدام المشفر المحدد ومعلمات المشفر. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | يحفظ الصورة التي يمثلها الكائن الحالي إلى الدفق المحدد باستخدام المشفر المحدد ومعلمات المشفر. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | يضيف إطارًا إلى الملف أو الدفق المحدد في استدعاء سابق لطريقة [Save()](./save/). |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | يضيف إطارًا إلى الملف أو الدفق المحدد في استدعاء سابق لطريقة [Save()](./save/). |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | يختار الإطار المحدد. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | يضبط لوحة الألوان المستخدمة بواسطة الصورة التي يمثلها الكائن الحالي. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | يضبط كائنًا يوفر بيانات إضافية حول الصورة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | دالة رد نداء لإلغاء تنفيذ GetThumbnailImage. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
