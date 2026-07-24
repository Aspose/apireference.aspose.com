---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously classe"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously classe. Descrive l'output di più pagine logiche su un unico foglio fisico. Tutti i documenti nel lavoro sono compilati insieme in modo contiguo. JobNUpAllDocumentsContiguously e DocumentNUp sono mutualmente esclusivi. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave.  in C++."
type: docs
weight: 5900
url: /it/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Descrive l'output di più pagine logiche su un unico foglio fisico. Tutti i documenti nel lavoro sono compilati insieme in modo contiguo. [JobNUpAllDocumentsContiguously](./) e [DocumentNUp](../documentnup/) sono mutualmente esclusivi. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Aggiunge un'opzione con un valore di proprietà valutata **PagesPerSheet**. Specifica il numero di pagine logiche per foglio fisico. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
