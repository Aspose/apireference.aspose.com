---
title: Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class
linktitle: DocumentPageRanges
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. Describes the output range of the document in pages. The parameter value must conform to the following structure: in C++.'
type: docs
weight: 2200
url: /cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Describes the output range of the document in pages. The parameter value must conform to the following structure:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Creates a new instance. |
## Remarks


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## See Also

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
