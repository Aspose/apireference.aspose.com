---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin clase"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin clase. Describe la bandeja de entrada instalada en un dispositivo o la lista completa de bandejas compatibles para un dispositivo. Las palabras clave JobInputBin, DocumentInputBin y PageInputBin son mutuamente exclusivas. Ambas no deben especificarse simultáneamente en un PrintTicket o en un documento de Capacidades de impresión.  en C++."
type: docs
weight: 1800
url: /es/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Describe la bandeja de entrada instalada en un dispositivo o la lista completa de bandejas compatibles para un dispositivo. Las palabras clave [JobInputBin](../jobinputbin/), [DocumentInputBin](./) y [PageInputBin](../pageinputbin/) son mutuamente exclusivas. Ambas no deben especificarse simultáneamente en un [PrintTicket](../printticket/) o en un documento de Capacidades de impresión. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
