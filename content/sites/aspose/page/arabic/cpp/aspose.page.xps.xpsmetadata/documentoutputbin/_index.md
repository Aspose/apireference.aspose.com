---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. يصف القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صندوق الإخراج على أساس كل مستند. الكلمات المفتاحية JobOutputBin و DocumentOutputBin و PageOutputBin متعارضة ولا يجوز تحديد سوى واحدة في وثيقة PrintTicket أو وثيقة إمكانات الطباعة.  في C++."
type: docs
weight: 2100
url: /ar/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


يصف القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صندوق الإخراج على أساس كل مستند. الكلمات المفتاحية [JobOutputBin](../joboutputbin/)، [DocumentOutputBin](./) و [PageOutputBin](../pageoutputbin/) متعارضة ولا يجوز تحديد سوى واحدة في وثيقة [PrintTicket](../printticket/) أو وثيقة إمكانات الطباعة. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
