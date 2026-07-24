---
title: "فئة Aspose::Page::XPS::XpsMetadata::PageOutputBin"
linktitle: "PageOutputBin"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsMetadata::PageOutputBin. يصف القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صندوق الإخراج لكل صفحة. الكلمات المفتاحية JobOutputBin و DocumentOutputBin و PageOutputBin متعارضة ولا يجوز تحديد أكثر من واحدة في وثيقة PrintTicket أو وثيقة إمكانات الطباعة.  في C++."
type: docs
weight: 11400
url: /ar/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


يصف القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صندوق الإخراج لكل صفحة. الكلمات المفتاحية [JobOutputBin](../joboutputbin/)، [DocumentOutputBin](../documentoutputbin/) و [PageOutputBin](./) متعارضة ولا يجوز تحديد أكثر من واحدة في وثيقة [PrintTicket](../printticket/) أو وثيقة إمكانات الطباعة. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
