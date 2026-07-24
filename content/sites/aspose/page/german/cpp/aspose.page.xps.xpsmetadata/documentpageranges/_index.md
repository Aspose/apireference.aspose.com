---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. Beschreibt den Ausgabebereich des Dokuments in Seiten. Der Parameterwert muss der folgenden Struktur entsprechen: in C++."
type: docs
weight: 2200
url: /de/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Beschreibt den Ausgabebereich des Dokuments in Seiten. Der Parameterwert muss der folgenden Struktur entsprechen:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Erstellt eine neue Instanz. |
## Hinweise


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Siehe auch

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
