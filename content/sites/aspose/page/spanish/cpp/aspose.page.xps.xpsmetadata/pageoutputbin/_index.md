---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class"
linktitle: "PageOutputBin"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class. Describe la lista completa de bandejas compatibles para el dispositivo. Permite especificar la bandeja de salida por página. Las palabras clave JobOutputBin, DocumentOutputBin y PageOutputBin son mutuamente excluyentes; solo una debe especificarse en un PrintTicket o documento de Capacidades de impresión.  en C++."
type: docs
weight: 11400
url: /es/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Describe la lista completa de bandejas compatibles para el dispositivo. Permite especificar la bandeja de salida por página. Las palabras clave [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) y [PageOutputBin](./) son mutuamente excluyentes; solo una debe especificarse en un [PrintTicket](../printticket/) o documento de Capacidades de impresión. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
