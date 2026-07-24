---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin classe"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin classe. Descrive il vassoio di ingresso installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Le parole chiave JobInputBin, DocumentInputBin e PageInputBin sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un documento PrintTicket o Print Capabilities.  in C++."
type: docs
weight: 1800
url: /it/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Descrive il vassoio di ingresso installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Le parole chiave [JobInputBin](../jobinputbin/), [DocumentInputBin](./) e [PageInputBin](../pageinputbin/) sono mutualmente esclusive. Entrambe non dovrebbero essere specificate simultaneamente in un documento [PrintTicket](../printticket/) o Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
