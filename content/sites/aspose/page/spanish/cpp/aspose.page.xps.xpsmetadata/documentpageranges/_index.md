---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. Describe el rango de salida del documento en páginas. El valor del parámetro debe ajustarse a la siguiente estructura: en C++."
type: docs
weight: 2200
url: /es/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Describe el rango de salida del documento en páginas. El valor del parámetro debe ajustarse a la siguiente estructura:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Crea una nueva instancia. |
## Observaciones


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Ver también

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
