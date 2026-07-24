---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp class"
linktitle: "DocumentNUp"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp class. Descrive l'output e il formato di più pagine logiche su un unico foglio fisico. Ogni documento è compilato separatamente. DocumentNUp e JobNUpAllDocumentsContiguously sono mutualmente esclusivi. Spetta al driver determinare la gestione dei vincoli tra questi termini.  in C++."
type: docs
weight: 2000
url: /it/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Descrive l'output e il formato di più pagine logiche su un unico foglio fisico. Ogni documento è compilato separatamente. **[DocumentNUp](./)** e [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) sono mutualmente esclusivi. Spetta al driver determinare la gestione dei vincoli tra questi termini. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Aggiunge un'opzione con un valore di proprietà valutata **PagesPerSheet**. Specifica il numero di pagine logiche per foglio fisico. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
