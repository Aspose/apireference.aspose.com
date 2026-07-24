---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges klass"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges klass. Beskriver dokumentets utskriftsintervall i sidor. Parametervärdet måste följa följande struktur: i C++."
type: docs
weight: 2200
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Beskriver utskriftsintervallet för dokumentet i sidor. Parametervärdet måste följa följande struktur:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Skapar en ny instans. |
## Anmärkningar


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Se även

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
