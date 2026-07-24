---
title: "classe Aspose::Page::XPS::XpsMetadata::PageOutputBin"
linktitle: "PageOutputBin"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::XPS::XpsMetadata::PageOutputBin. Descrive l'elenco completo dei contenitori supportati per il dispositivo. Consente la specifica del contenitore di output per pagina. Le parole chiave JobOutputBin, DocumentOutputBin e PageOutputBin sono mutualmente esclusive; solo una dovrebbe essere specificata in un PrintTicket o in un documento Print Capabilities. in C++."
type: docs
weight: 11400
url: /it/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Descrive l'elenco completo dei contenitori supportati per il dispositivo. Consente la specifica del contenitore di output per pagina. Le parole chiave [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) e [PageOutputBin](./) sono mutualmente esclusive; solo una dovrebbe essere specificata in un [PrintTicket](../printticket/) o in un documento Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
