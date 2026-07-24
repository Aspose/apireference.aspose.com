---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin فئة"
linktitle: "PageInputBin"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin فئة. يصف صينية الإدخال المثبتة في جهاز أو القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صينية الإدخال على أساس كل صفحة. الكلمات المفتاحية JobInputBin و DocumentInputBin و PageInputBin متعارضة. لا يجب تحديد كلاهما في وقت واحد في مستند PrintTicket أو مستند قدرات الطباعة. في C++."
type: docs
weight: 10000
url: /ar/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


يصف صينية الإدخال المثبتة في جهاز أو القائمة الكاملة للصناديق المدعومة للجهاز. يسمح بتحديد صينية الإدخال على أساس كل صفحة. الكلمات المفتاحية [JobInputBin](../jobinputbin/)، [DocumentInputBin](../documentinputbin/) و [PageInputBin](./) متعارضة. لا يجب تحديد كلاهما في وقت واحد في [PrintTicket](../printticket/) أو مستند قدرات الطباعة. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
