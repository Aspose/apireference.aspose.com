---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex classe"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex class. Descrive le caratteristiche duplex dell'output. La funzione duplex consente la stampa su entrambi i lati del supporto. Ogni documento è duplexato separatamente. DocumentDuplex e JobDuplexAllDocumentsContiguously sono mutualmente esclusivi. Spetta al driver determinare la gestione delle restrizioni tra queste parole chiave.  in C++."
type: docs
weight: 1400
url: /it/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Descrive le caratteristiche duplex dell'output. La funzione duplex consente la stampa su entrambi i lati del supporto. Ogni documento è duplexato separatamente. [DocumentDuplex](./) e [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) sono mutualmente esclusivi. Spetta al driver determinare la gestione delle restrizioni tra queste parole chiave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
