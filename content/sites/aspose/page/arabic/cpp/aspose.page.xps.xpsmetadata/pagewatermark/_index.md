---
title: "فئة Aspose::Page::XPS::XpsMetadata::PageWatermark"
linktitle: "PageWatermark"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. يصف إعداد العلامة المائية للإخراج وخصائص العلامة المائية. تُطبق العلامات المائية على الصفحة المنطقية، وليس على الصفحة الفيزيائية. على سبيل المثال، إذا تم تمكين DocumentDuplex، ستظهر علامة مائية على كل صفحة **NUp** على كل ورقة. إذا كان DocumentDuplex، **PagesPerSheet**=2، فستحتوي كل ورقة على علامتين مائيتين.  in C++."
type: docs
weight: 13100
url: /ar/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


يصف إعداد العلامة المائية للإخراج وخصائص العلامة المائية. تُطبق العلامات المائية على الصفحة المنطقية، وليس على الصفحة الفيزيائية. على سبيل المثال، إذا كان [DocumentDuplex](../documentduplex/) مفعلاً، ستظهر علامة مائية على كل صفحة **[NUp](../nup/)** على كل ورقة. إذا كان [DocumentDuplex](../documentduplex/)، **PagesPerSheet**=2، فستحتوي كل ورقة على علامتين مائيتين. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
