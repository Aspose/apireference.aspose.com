---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions فئة"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions فئة. فئة لخيارات حفظ XPS كـ PDF في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


فئة لخيارات حفظ XPS كـ PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | يحدد حجم جزء من الصفحات لتمريره من عقدة إلى أخرى. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | مجموعة معالجات الأحداث التي تُجري تعديلات على صفحة [XPS](../../aspose.page.xps/) قبل حفظها مباشرةً. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | يحصل على تفاصيل التشفير. إذا لم يتم تعيينه، فلن يتم تنفيذ أي تشفير. |
| [get_ImageCompression](./get_imagecompression/)() const | يحدد نوع الضغط الذي سيُستخدم لجميع الصور في المستند. القيمة الافتراضية هي [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | يحدد إلى أي مستوى يجب توسيع مخطط المستند عند فتح ملف PDF في عارض. 1 - يتم عرض عناصر المخطط من المستوى الأول فقط، 2 - يتم عرض عناصر المخطط من المستوى الأول والثاني فقط، وهكذا. القيمة الافتراضية هي 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | يحدد ارتفاع شجرة مخطط المستند التي سيتم حفظها. 0 - لن يتم تحويل شجرة المخطط، 1 - سيتم تحويل عناصر المخطط من المستوى الأول فقط، وهكذا. القيمة الافتراضية هي 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | يحصل على/يضبط مصفوفة أرقام الصفحات للتحويل. |
| [get_PreserveText](./get_preservetext/)() override | في [XPS](../../aspose.page.xps/)، قد تحتوي بعض عناصر النص على مراجع لأشكال الحروف البديلة التي لا تتطابق مع أي رمز حرف في الخط. إذا تم تعيين هذه العلامة إلى true، يتم تحويل النص من هذه العناصر إلى أشكال رسومية. ثم يظهر النص نفسه شفافًا في الأعلى. يظل نص هذه العناصر قابلًا للتحديد. لكن الأثر الجانبي هو أن ملف الإخراج قد يكون أكبر بكثير من الأصلي. إذا تم تعيين هذه العلامة إلى false، يتم استبدال الأحرف التي يجب عرضها كأشكال بديلة بأحرف أخرى تُطابق تلك الأشكال. وبالتالي، على الرغم من أن النص لا يزال قابلًا للتحديد، سيُعدل وربما يصبح غير قابل للقراءة. القيمة الافتراضية هي false. |
| [get_TextCompression](./get_textcompression/)() const | يحدد أي مستوى في مخطط المستند لعرض كائنات [ApsBookmark](../). 0 - غير معروض. 1 في المستوى الأول وهكذا. القيمة الافتراضية هي 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | ينشئ نسخة جديدة من الخيارات. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | يحدد حجم جزء من الصفحات لتمريره من عقدة إلى أخرى. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | يضبط تفاصيل التشفير. إذا لم يتم تعيينه، فلن يتم تنفيذ أي تشفير. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | يحدد نوع الضغط الذي سيُستخدم لجميع الصور في المستند. القيمة الافتراضية هي [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | يحدد إلى أي مستوى يجب توسيع مخطط المستند عند فتح ملف PDF في عارض. 1 - يتم عرض عناصر المخطط من المستوى الأول فقط، 2 - يتم عرض عناصر المخطط من المستوى الأول والثاني فقط، وهكذا. القيمة الافتراضية هي 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | يحدد ارتفاع شجرة مخطط المستند التي سيتم حفظها. 0 - لن يتم تحويل شجرة المخطط، 1 - سيتم تحويل عناصر المخطط من المستوى الأول فقط، وهكذا. القيمة الافتراضية هي 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | يحصل على/يضبط مصفوفة أرقام الصفحات للتحويل. |
| [set_PreserveText](./set_preservetext/)(bool) override | في [XPS](../../aspose.page.xps/)، قد تحتوي بعض عناصر النص على مراجع لأشكال الحروف البديلة التي لا تتطابق مع أي رمز حرف في الخط. إذا تم تعيين هذه العلامة إلى true، يتم تحويل النص من هذه العناصر إلى أشكال رسومية. ثم يظهر النص نفسه شفافًا في الأعلى. يظل نص هذه العناصر قابلًا للتحديد. لكن الأثر الجانبي هو أن ملف الإخراج قد يكون أكبر بكثير من الأصلي. إذا تم تعيين هذه العلامة إلى false، يتم استبدال الأحرف التي يجب عرضها كأشكال بديلة بأحرف أخرى تُطابق تلك الأشكال. وبالتالي، على الرغم من أن النص لا يزال قابلًا للتحديد، سيُعدل وربما يصبح غير قابل للقراءة. القيمة الافتراضية هي false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | يحدد أي مستوى في مخطط المستند لعرض كائنات [ApsBookmark](../). 0 - غير معروض. 1 في المستوى الأول وهكذا. القيمة الافتراضية هي 0. |
## انظر أيضًا

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
