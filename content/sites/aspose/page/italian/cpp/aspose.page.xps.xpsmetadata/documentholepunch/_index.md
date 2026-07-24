---
title: "classe Aspose::Page::XPS::XpsMetadata::DocumentHolePunch"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::XPS::XpsMetadata::DocumentHolePunch. Descrive le caratteristiche di foratura dell'output. Ogni documento è forato separatamente. Le parole chiave JobHolePunch e DocumentHolePunch sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un PrintTicket o in un documento Print Capabilities. in C++."
type: docs
weight: 1500
url: /it/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Descrive le caratteristiche di foratura dell'output. Ogni documento è forato separatamente. Le parole chiave [JobHolePunch](../jobholepunch/) e [DocumentHolePunch](./) sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un [PrintTicket](../printticket/) o in un documento Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
