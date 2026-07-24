---
title: "Aspose::Page::EPS::Device::PdfDevice فئة"
linktitle: "PdfDevice"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::Device::PdfDevice class. هذه الفئة تُجَسِّد عملية تحويل المستند إلى PDF في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


تغلف هذه الفئة عملية تحويل المستند إلى PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [AUTHOR](./author/)() | \"Author\" قيمة الخاصية. |
| static [BACKGROUND](./background/)() | \"Background\" مفتاح الخاصية. |
| static [BACKGROUND_COLOR](./background_color/)() | \"Background color\" مفتاح الخاصية. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | يقص باستخدام الشكل المحدد. يوجه إلى writeClip(Rectangle)، writeClip(RectangleF) أو writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | يقص المستطيل. يستدعي clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | يقوم بالتحضير اللازم للجهاز بعد أن تم عرض الصفحة. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | \"Compress\" مفتاح الخاصية. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | ينشئ نسخة من هذا الجهاز. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | يقوم بتحرير سياق الرسومات. إذا كان restoreOnDispose صحيحًا عند الإنشاء، سيتم استدعاء writeGraphicsRestore(). |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | يرسم مسارًا. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | يرسم صورة مع التحويل المعين والخلفية. |
| [DrawString](./drawstring/)(System::String, double, double) override | يرسم نصًا عند النقطة المحددة. |
| static [EMBED_FONTS](./embed_fonts/)() | \"Embed font in document\" مفتاح الخاصية. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | \"What font type is used for embedding\" مفتاح الخاصية. |
| static [EMIT_ERRORS](./emit_errors/)() | \"Emit errors\" قيمة الخاصية. |
| static [EMIT_WARNINGS](./emit_warnings/)() | \"Emit warnings\" قيمة الخاصية. |
| [EndDocument](./enddocument/)() override | يقوم بالتحضير اللازم للجهاز بعد أن تم عرض المستند. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | يملأ مسارًا. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | \"Fit content to page\" مفتاح الخاصية. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | رقم الصفحة الحالي. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | يرسم إطارًا ولافتة حول نص. تحسب الطريقة وتعيد النقطة التي يجب وضع مؤشر النص فيها قبل رسم النص. |
| [get_OutputStream](./get_outputstream/)() override | يحدد أو يُعيد تدفق الإخراج. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | يحصل على التحويل الحالي. |
| [InitClip](./initclip/)() override | يُهيئ مقطع الجهاز. |
| [InitPageNumbers](./initpagenumbers/)() override | يُهيئ عدد الصفحات للإخراج. |
| static [KEYWORDS](./keywords/)() | قيمة الخاصية "Keywords". |
| [OpenPage](./openpage/)(System::String) override | يقوم بالتحضير الضروري للجهاز قبل عرض الصفحة. |
| [OpenPage](./openpage/)(float, float) override | يقوم بالتحضير الضروري للجهاز قبل عرض كل صفحة. |
| static [ORIENTATION](./orientation/)() | مفتاح الخاصية "Orientation". |
| static [PAGE_MARGINS](./page_margins/)() | مفتاح الخاصية "Page margins". |
| static [PAGE_SIZE_](./page_size_/)() | مفتاح الخاصية "Page size". |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | يُهيئ نسخة جديدة من [PdfDevice](./) مع تدفق الإخراج. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | يُهيئ نسخة جديدة من [PdfDevice](./) مع تدفق الإخراج وحجم الصفحة المحدد. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | منشئ النسخ. يُهيئ نسخة جديدة من [PdfDevice](./) باستخدام جهاز موجود. |
| [ReNew](./renew/)() override | إعادة ضبط الجهاز إلى الحالة الأولية للمستند بأكمله. يُستخدم لإعادة ضبط تدفق الإخراج. |
| [ReNewForMerge](./renewformerge/)(bool) override | إعادة ضبط الجهاز إلى الحالة الأولية للمستند بأكمله أثناء دمج عدة مستندات. يُستخدم لإعادة ضبط تدفق الإخراج. |
| [Reset](./reset/)() override | إذا تم ضبط معلمات جهاز الصفحة، تسمح هذه الطريقة بإعادة تدفق الكتابة إلى بداية الصفحة. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | تدوير التحويل الحالي حول محور Z. يستدعي writeTransform(Transform). التدوير بزاوية موجبة θ يدور النقاط على المحور x الموجب نحو المحور y الموجب. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | يقوم بتكبير مصفوفة التحويل الحالية. يستدعي writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | يحدد الخط الحالي. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | يحدد أو يُعيد تدفق الإخراج. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | يعيد أو يحدد الطلاء الحالي. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | يعيد أو يحدد الحد الحالي. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | يحدد مقطع الجهاز. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | يحدد التحويل الحالي. بما أن معظم صيغ الإخراج لا تنفذ هذه الوظيفة، يتم حساب التحويل العكسي للـ currentTransform ويُضرب في التحويل المراد تعيينه. ثم يُمرّر النتيجة عبر استدعاء writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | يقوم بقص مصفوفة التحويل الحالية. يستدعي writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | يقوم بالتحضير الضروري للجهاز قبل بدء عرض المستند. |
| static [SUBJECT](./subject/)() | قيمة الخاصية "Subject". |
| static [TITLE](./title/)() | قيمة الخاصية "Title". |
| [ToString](./tostring/)() const override | يعيد اسم نوع الجهاز. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | يحوّل مصفوفة التحويل الحالية. يستدعي writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | يترجم مصفوفة التحويل الحالية. يستدعي writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | مفتاح الخاصية "Transparent". |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | يحدّث معلمات الصفحة من جهاز متعدد الصفحات آخر. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | مفتاح الخاصية "Format of images". |
| [WriteBackground](./writebackground/)() override | يكتب الخلفية الحالية. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | يكتب غطاء الخط. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | يكتب تعليقًا. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | يكتب الفاصل للخط. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | يكتب الفهرس، معلومات المستند، التفضيلات، و(نظرًا لأننا نستخدم إخراج صفحة واحدة فقط) شجرة الصفحات. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | يكتب وصل الخط. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | يكتب آخر طلاء مكتوب. يكون مفيدًا في الحالات التي يتم فيها استعادة الرسومات بعد كتابة الطلاء ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | يكتب حد الميتر للخط. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | يكتب الطلاء باللون المحدد. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | يكتب الطلاء بالتدرج المحدد. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | يكتب الطلاء بالنقش المحدد. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | يكتب الطلاء. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | يكتب سلسلة باستخدام الخط المحدد. |
| [WriteTrailer](./writetrailer/)() | يكتب التذييل لمستند PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | اكتب مصفوفة التحويل المحددة إلى الملف. |
| [WriteWarning](./writewarning/)(System::String) override | يكتب تحذيرًا، بشكل افتراضي إلى System.err. |
| [WriteWidth](./writewidth/)(float) override | يكتب عرض الخط. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [VERSION](./version/) | مفتاح الخاصية "Version". |
| static [VERSION5](./version5/) | قيمة الخاصية "Version of Adobe Acrobat Reader". |

## Deprecated
فئة PdfDevice مهجّرة بدءًا من الإصدار 24.3. يرجى استخدام طريقة SaveAsPdf في فئة PsDocument بدلاً من ذلك. في الإصدار 24.6 سيتم إخفاء هذه الفئة بالكامل.

## انظر أيضًا

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
