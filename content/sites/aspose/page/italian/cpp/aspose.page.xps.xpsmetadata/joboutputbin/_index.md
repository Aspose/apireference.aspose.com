---
title: "Aspose::Page::XPS::XpsMetadata::JobOutputBin classe"
linktitle: "JobOutputBin"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::JobOutputBin classe. Descrive il vassoio di uscita installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Le parole chiave JobOutputBin, DocumentOutputBin e PageOutputBin sono mutualmente esclusive; solo una dovrebbe essere specificata in un documento PrintTicket o Print Capabilities.  in C++."
type: docs
weight: 6100
url: /it/cpp/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class


Descrive il vassoio di uscita installato in un dispositivo o l'elenco completo dei vassoi supportati per un dispositivo. Le parole chiave [JobOutputBin](./), [DocumentOutputBin](../documentoutputbin/) e [PageOutputBin](../pageoutputbin/) sono mutualmente esclusive; solo una dovrebbe essere specificata in un [PrintTicket](../printticket/) o documento Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin).

```cpp
class JobOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [JobOutputBin](./joboutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
