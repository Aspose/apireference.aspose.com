---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp فئة"
linktitle: "DocumentNUp"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp فئة. يصف الإخراج وتنسيق صفحات منطقية متعددة على ورقة مادية واحدة. كل مستند يتم تجميعه بشكل منفصل. DocumentNUp وJobNUpAllDocumentsContiguously متنافيان. الأمر متروك للسائق لتحديد معالجة القيود بين هاتين الكلمتين المفتاحيتين.  في C++."
type: docs
weight: 2000
url: /ar/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


يصف الإخراج وتنسيق صفحات منطقية متعددة على ورقة مادية واحدة. كل مستند يتم تجميعه بشكل منفصل. **[DocumentNUp](./)** و[JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) متنافيان. الأمر متروك للسائق لتحديد معالجة القيود بين هاتين الكلمتين المفتاحيتين. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | يضيف خيارًا بقيمة خاصية متدرجة **PagesPerSheet**. يحدد عدد الصفحات المنطقية لكل ورقة مادية. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
