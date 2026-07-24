---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. يصف نطاق الإخراج للمستند بالصفحات. يجب أن تتطابق قيمة المعامل مع البنية التالية: في C++."
type: docs
weight: 2200
url: /ar/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


يصف نطاق مخرجات المستند بالصفحات. يجب أن تتوافق قيمة المعامل مع البنية التالية:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | ينشئ مثيلًا جديدًا. |
## ملاحظات


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## انظر أيضًا

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
