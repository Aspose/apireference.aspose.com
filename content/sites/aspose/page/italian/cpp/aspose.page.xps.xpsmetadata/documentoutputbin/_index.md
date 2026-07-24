---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Descrive l'elenco completo dei vassoi supportati dal dispositivo. Consente la specifica del vassoio di output per documento. Le parole chiave JobOutputBin, DocumentOutputBin e PageOutputBin sono mutualmente esclusive; solo una dovrebbe essere specificata in un documento PrintTicket o Print Capabilities. in C++."
type: docs
weight: 2100
url: /it/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Descrive l'elenco completo dei vassoi supportati dal dispositivo. Consente la specifica del vassoio di output per documento. Le parole chiave [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) e [PageOutputBin](../pageoutputbin/) sono mutualmente esclusive; solo una dovrebbe essere specificata in un documento [PrintTicket](../printticket/) o Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
