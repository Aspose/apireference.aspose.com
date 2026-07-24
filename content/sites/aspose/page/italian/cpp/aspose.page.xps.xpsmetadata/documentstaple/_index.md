---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class"
linktitle: "DocumentStaple"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class. Descrive le caratteristiche di rilegatura dell'output. Ogni documento è rilegato separatamente. Le parole chiave JobStapleAllDocuments e DocumentStaple sono mutualmente esclusive. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave.  in C++."
type: docs
weight: 2600
url: /it/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Descrive le caratteristiche di rilegatura dell'output. Ogni documento è rilegato separatamente. Le parole chiave [JobStapleAllDocuments](../jobstaplealldocuments/) e [DocumentStaple](./) sono mutualmente esclusive. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
