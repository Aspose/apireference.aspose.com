---
title: "فئة Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet. تصف ورقة البانر التي يجب إخراجها لوثيقة معينة. يجب إخراج ورقة البانر باستخدام حجم PageMediaSize الافتراضي واستخدام نوع PageMediaType الافتراضي. يجب أيضًا عزل ورقة البانر عن باقي المهمة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل DocumentDuplex أو DocumentStaple أو DocumentBinding) يجب ألا تشمل ورقة البانر. قد تكون ورقة البانر معزولة أو غير معزولة عن باقي المهمة. هذا يعني أن أي خيارات إنهاء أو معالجة للمهمة قد تشمل ورقة البانر للوثيقة. يجب أن تظهر ورقة البانر كأول ورقة في الوثيقة.  في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


تصف ورقة البانر التي يجب إخراجها لوثيقة معينة. يجب إخراج ورقة البانر باستخدام [PageMediaSize](../pagemediasize/) الافتراضي واستخدام [PageMediaType](../pagemediatype/) الافتراضي. يجب أيضًا عزل ورقة البانر عن باقي المهمة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل [DocumentDuplex](../documentduplex/)، [DocumentStaple](../documentstaple/)، أو [DocumentBinding](../documentbinding/)) يجب ألا تشمل ورقة البانر. قد تكون ورقة البانر معزولة أو غير معزولة عن باقي المهمة. هذا يعني أن أي خيارات إنهاء أو معالجة للمهمة قد تشمل ورقة البانر للوثيقة. يجب أن تظهر ورقة البانر كأول ورقة في الوثيقة. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
