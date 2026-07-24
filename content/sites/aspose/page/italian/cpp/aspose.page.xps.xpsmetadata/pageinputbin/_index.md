---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin classe"
linktitle: "PageInputBin"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin classe. Descrive il vassoio di ingresso installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Consente la specifica del vassoio di ingresso per pagina. Le parole chiave JobInputBin, DocumentInputBin e PageInputBin sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un documento PrintTicket o Print Capabilities.  in C++."
type: docs
weight: 10000
url: /it/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Descrive il vassoio di ingresso installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Consente la specifica del vassoio di ingresso per pagina. Le parole chiave [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) e [PageInputBin](./) sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un [PrintTicket](../printticket/) o documento Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
