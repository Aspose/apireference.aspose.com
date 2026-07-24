---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. Descrive l'intervallo di output del documento in pagine. Il valore del parametro deve conformarsi alla seguente struttura: in C++."
type: docs
weight: 2200
url: /it/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Descrive l'intervallo di output del documento in pagine. Il valore del parametro deve conformarsi alla seguente struttura:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Crea una nuova istanza. |
## Osservazioni


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Vedi anche

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
