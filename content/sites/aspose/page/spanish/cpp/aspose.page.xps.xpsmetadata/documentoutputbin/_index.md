---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Describe la lista completa de bandejas compatibles para el dispositivo. Permite la especificación de la bandeja de salida por documento. Las palabras clave JobOutputBin, DocumentOutputBin y PageOutputBin son mutuamente exclusivas; solo una debe especificarse en un documento PrintTicket o Print Capabilities. en C++."
type: docs
weight: 2100
url: /es/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Describe la lista completa de bandejas compatibles para el dispositivo. Permite la especificación de la bandeja de salida por documento. Las palabras clave [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) y [PageOutputBin](../pageoutputbin/) son mutuamente exclusivas; solo una debe especificarse en un documento [PrintTicket](../printticket/) o Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
