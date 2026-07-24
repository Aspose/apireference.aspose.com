---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges sınıfı"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges sınıfı. Belgenin sayfa cinsinden çıktı aralığını açıklar. Parametre değeri aşağıdaki yapıya uygun olmalıdır: C++'da."
type: docs
weight: 2200
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Belgenin sayfa cinsinden çıktı aralığını tanımlar. Parametre değeri aşağıdaki yapıya uygun olmalıdır:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Yeni bir örnek oluşturur. |
## Açıklamalar


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Ayrıca Bakınız

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
