---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class. Descrive la copertina posteriore (finale). Ogni documento avrà una foglio separato. La copertina deve essere stampata con il PageMediaSize e il PageMediaType utilizzati per l'ultima pagina del documento. La copertina deve essere integrata nelle opzioni di elaborazione (come DocumentDuplex, DocumentNUp) come indicato dall'Option specificato.  in C++."
type: docs
weight: 1000
url: /it/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


Descrive la copertina posteriore (finale). Ogni documento avrà un foglio separato. La copertina deve essere stampata con il [PageMediaSize](../pagemediasize/) e il [PageMediaType](../pagemediatype/) utilizzati per l'ultima pagina del documento. La copertina deve essere integrata nelle opzioni di elaborazione (come [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) come indicato dall'[Option](../option/) specificato. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
