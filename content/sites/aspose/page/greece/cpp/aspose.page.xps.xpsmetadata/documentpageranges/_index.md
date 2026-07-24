---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. Περιγράφει το εύρος εξόδου του εγγράφου σε σελίδες. Η τιμή της παραμέτρου πρέπει να συμμορφώνεται με την ακόλουθη δομή: σε C++."
type: docs
weight: 2200
url: /el/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Περιγράφει το εύρος εξόδου του εγγράφου σε σελίδες. Η τιμή της παραμέτρου πρέπει να συμμορφώνεται με την ακόλουθη δομή:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Δημιουργεί μια νέα παρουσία. |
## Παρατηρήσεις


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Δείτε επίσης

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
