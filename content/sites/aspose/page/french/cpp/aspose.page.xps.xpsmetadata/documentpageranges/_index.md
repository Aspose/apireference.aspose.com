---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges classe"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges classe. Décrit la plage de sortie du document en pages. La valeur du paramètre doit respecter la structure suivante : en C++."
type: docs
weight: 2200
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Décrit la plage de sortie du document en pages. La valeur du paramètre doit respecter la structure suivante :

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Crée une nouvelle instance. |
## Remarques


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Voir aussi

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
