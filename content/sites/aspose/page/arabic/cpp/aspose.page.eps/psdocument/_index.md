---
title: "Aspose::Page::EPS::PsDocument فئة"
linktitle: "PsDocument"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument فئة. هذه الفئة تغلف مستندات PS/EPS في C++."
type: docs
weight: 700
url: /ar/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


هذه الفئة تغلف مستندات PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | يضيف قصًا إلى حالة الرسومات الحالية. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | يضيف قصًا إلى حالة الرسومات الحالية ثم يكتب عامل \"newpath\". هذا ضروري لتجنب تلاقي مسار القص هذا وبعض المسارات اللاحقة مثل الرموز المرسومة باستخدام عامل \"charpath\". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | يضيف مستطيل قص إلى حالة الرسومات الحالية. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | يضيف قصًا من مخطط النص المعطى بالخط المعطى. |
| [ClosePage](./closepage/)() | أكمل الصفحة الحالية. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | يحوّل خط Type 1 إلى **TrueType**. سيكون اسم خط TTF المحوّل هو نفسه اسم خط Type 1 المدخل مع امتداد \".ttf\". سيتم حفظ ملف TTF في الدليل المخصص للإخراج. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | يحوّل خط Type 3 إلى **TrueType**. سيكون اسم خط TTF المحوّل هو نفسه اسم ملف خط Type 3 المدخل مع امتداد \".ttf\". سيتم حفظ ملف TTF في الدليل المخصص للإخراج. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | يحوّل خط Type 3 إلى تدفق **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | يقص [PsDocument](./) كملف [EPS](../). يحفظ ملف [EPS](../) الأولي مع %BoundingBox المحدث الموجود أو يتم إنشاء واحد جديد. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | يقص [PsDocument](./) كملف [EPS](../). يحفظ ملف [EPS](../) الأولي مع %BoundingBox المحدث الموجود أو يتم إنشاء واحد جديد. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | ارسم مسارًا عشوائيًا. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | يرسم قوسًا. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | ارسم صورةً مقنّعة. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | ارسم صورةً. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | ارسم صورةً محوّلة مع خلفية. |
| [DrawLine](./drawline/)(double, double, double, double) | يرسم قطعة خط. |
| [DrawOval](./drawoval/)(double, double, double, double) | يرسم بيضاويًا. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | يرسم مضلعًا. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | يرسم مضلعًا. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | يرسم خطًا متعددًا. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | يرسم خطًا متعددًا. |
| [DrawRect](./drawrect/)(double, double, double, double) | يرسم مستطيلًا. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | يرسم مستطيلًا مستدير الزوايا. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | يرسم صورة شفافة محوّلة. إذا لم يكن للصورة قناة ألفا فستُرسم كصورة غير شفافة. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | يقرأ ملف [EPS](../) ويستخرج صندوق الحدود لصورة [EPS](../) من تعليق %BoundingBox أو الحدود لحجم الصفحة الافتراضي (0, 0, 595, 842) إذا لم يكن موجودًا. |
| [ExtractEpsSize](./extractepssize/)() | يقرأ ملف [EPS](../) ويستخرج حجم صورة [EPS](../) من تعليق %BoundingBox أو حجم الصفحة الافتراضي (595, 842) إذا لم يكن موجودًا. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | استخراج النص من ملف PS. يمكن استخراج النص فقط إذا كان مكتوبًا بخط Type 42 (**TrueType**) أو بخط Type 0 يحتوي على خطوط Type 42 في خريطة المتجهات الخاصة به. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | ملء مسار عشوائي. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية بملء داخل الحروف ورسم حدود الحروف. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية بملء داخل الحروف ورسم حدود الحروف. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية بملء داخل الحروف ورسم حدود الحروف. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية بملء داخل الحروف ورسم حدود الحروف. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | يملأ قوسًا. |
| [FillOval](./filloval/)(double, double, double, double) | يملأ بيضاويًا. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | يملأ مضلعًا. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | يملأ مضلعًا. |
| [FillRect](./fillrect/)(double, double, double, double) | يملأ مستطيلًا. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | يملأ مستطيلًا مستدير الزوايا. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | يضيف سلسلة نصية بملء داخل الحروف. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | يضيف سلسلة نصية بملء داخل الحروف. |
| [get_InputStream](./get_inputstream/)() | يُهيئ [PsDocument](./) باستخدام تدفق وخيارات التحميل. |
| [get_NumberOfPages](./get_numberofpages/)() const | يرجع عدد الصفحات في مستند PDF الناتج. |
| [GetPaint](./getpaint/)() | يحصل على طلاء حالة الرسومات الحالية. |
| [GetStroke](./getstroke/)() | يضبط الحد في حالة الرسومات الحالية. |
| [GetXmpMetadata](./getxmpmetadata/)() | يقرأ ملف PS/EPS ويستخرج XmpMetdata إذا كان موجودًا بالفعل أو يضيف واحدًا جديدًا إذا لم يكن موجودًا. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | يدمج ملفات PS/EPS إلى جهاز. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | يدمج ملفات PS/EPS إلى جهاز. |
| [OpenPage](./openpage/)(float, float) | ينشئ صفحة جديدة ويجعلها الحالية. |
| [OpenPage](./openpage/)(System::String) | ينشئ صفحة جديدة بحجم المستند ويجعلها الحالية. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [PsDocument](./psdocument/)() | يُهيئ [PsDocument](./) فارغًا. يُستخدم هذا المُنشئ فقط للعمليات الإضافية التي لا تتعلق بملفات PostScript، مثل تحويل الخطوط. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | يُهيئ [PsDocument](./) فارغًا مع صفحة مبدئية. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | يُهيئ [PsDocument](./) فارغًا مع صفحة مبدئية. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | يُهيئ [PsDocument](./) فارغًا. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | يُهيئ [PsDocument](./) فارغًا. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | يُهيئ [PsDocument](./) فارغًا عندما يكون عدد صفحات مستند [Postscript](../../aspose.page.eps.postscript/) معروفًا مسبقًا. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | يُهيئ [PsDocument](./) فارغًا عندما يكون عدد صفحات مستند [Postscript](../../aspose.page.eps.postscript/) معروفًا مسبقًا. |
| [PsDocument](./psdocument/)(System::String) | يُهيئ [PsDocument](./) بملف PS/EPS مدخل. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | يُهيئ [PsDocument](./) بتدفق ملف PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | يعيد تحجيم [PsDocument](./) المحدد كملف [EPS](../). تُستخدم هذه الطريقة فقط بعد استخراج حجم [EPS](../). يحفظ الملف الأولي [EPS](../) مع تحديث %BoundingBox الموجود أو إنشاء واحد جديد. D:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hدليل الإخراج حيث سيتم حفظ ملف الصورة. سيتم أيضًا ضبط مصفوفة التحويل الخاصة بـ [Page](../../aspose.page/). |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | يعيد تحجيم [PsDocument](./) المحدد كملف [EPS](../). تُستخدم هذه الطريقة فقط بعد استخراج حجم [EPS](../). يحفظ الملف الأولي [EPS](../) مع تحديث %BoundingBox الموجود أو إنشاء واحد جديد. سيتم أيضًا ضبط مصفوفة التحويل الخاصة بـ [Page](../../aspose.page/). |
| [Rotate](./rotate/)(float) | يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية). |
| [Rotate](./rotate/)(int32_t) | يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية). |
| [Save](./save/)(System::String) | يحفظ [PsDocument](./) المحدد كملف [EPS](../). تُستخدم هذه الطريقة فقط بعد تحديث بيانات التعريف [XMP](../../aspose.page.eps.xmp/). يحفظ الملف الأولي [EPS](../) مع تحديث البيانات الموجودة أو إنشاء جديد أثناء استدعاء طريقة GetMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات [EPS](../). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | يحفظ [PsDocument](./) المحدد إلى التدفق. تُستخدم هذه الطريقة فقط بعد تحديث بيانات التعريف [XMP](../../aspose.page.eps.xmp/). يحفظ الملف الأولي [EPS](../) مع تحديث البيانات الموجودة أو إنشاء جديد أثناء استدعاء طريقة GetMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات [EPS](../). |
| [Save](./save/)() | يحفظ [PsDocument](./) المحدد كملف PS أو [EPS](../). تُستخدم هذه الطريقة فقط عندما تم إنشاء [PsDocument](./) من الصفر. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | يحفظ ملف PS/EPS إلى ملف صورة. سيكون دليل الإخراج واسم الملف نفس ما هو في ملف PS المدخل. سيتطابق امتداد الملف مع تنسيق الصورة في معامل "options". إذا تم تهيئة المستند بتدفق ليس FileStream، سيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | يحفظ ملف PS/EPS إلى ملف صورة في الدليل المحدد مع اسم الملف المحدد. سيتطابق امتداد الملف مع تنسيق الصورة في معامل "options". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | يحفظ ملف PS/EPS إلى مصفوفات بايتات الصور. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | يحفظ ملف PS/EPS إلى ملف PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | يحفظ ملف PS/EPS إلى تدفق PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | يحفظ صورة PNG/JPEG/TIFF/BMP/GIF/EMF من التدفق المدخل إلى تدفق إخراج [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | يحفظ صورة PNG/JPEG/TIFF/BMP/GIF/EMF من ملف إلى ملف [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | يحفظ كائن Bitmap إلى ملف [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | يحفظ كائن Bitmap إلى تدفق إخراج [EPS](../). |
| [Scale](./scale/)(float, float) | يضيف مقياسًا إلى حالة الرسومات الحالية (تحجيم المصفوفة الحالية). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | يُهيئ [PsDocument](./) باستخدام تدفق وخيارات التحميل. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | يضبط معلمات جهاز الصفحة (انظر المشغل "setpagedevice" في مواصفات PostScript). قد تشمل هذه حجم الصفحة واللون وغيرها. |
| [SetPageSize](./setpagesize/)(float, float) | يضبط حجم الصفحة. لإنشاء صفحات بأحجام مختلفة في مستند واحد، استخدم طريقة [SetPageDevice](./setpagedevice/) مباشرة بعد هذه الطريقة. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | يضبط الطلاء في حالة الرسومات الحالية. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | يضبط الحد في حالة الرسومات الحالية. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | عيّن التحويل الحالي إلى هذا. |
| [Shear](./shear/)(float, float) | يدور حالة الرسومات الحالية عكس اتجاه عقارب الساعة حول نقطة. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | يضيف التحويل إلى حالة الرسومات الحالية (يضمّ هذه المصفوفة مع الحالية). |
| [Translate](./translate/)(float, float) | يضيف الإزاحة إلى حالة الرسومات الحالية (ينقل المصفوفة الحالية). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | يكتب استعادة حالة الرسومات الحالية (انظر مواصفة PostScript للمعامل "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | يكتب حفظ حالة الرسومات الحالية (انظر مواصفة PostScript للمعامل "gsave"). |
## انظر أيضًا

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
