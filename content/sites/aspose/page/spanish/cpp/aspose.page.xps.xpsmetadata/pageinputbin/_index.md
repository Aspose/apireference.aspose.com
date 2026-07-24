---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin clase"
linktitle: "PageInputBin"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin clase. Describe la bandeja de entrada instalada en un dispositivo o la lista completa de bandejas compatibles para un dispositivo. Permite la especificación de la bandeja de entrada por página. Las palabras clave JobInputBin, DocumentInputBin y PageInputBin son mutuamente excluyentes. No deben especificarse simultáneamente en un documento PrintTicket o de Capacidades de Impresión.  en C++."
type: docs
weight: 10000
url: /es/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Describe la bandeja de entrada instalada en un dispositivo o la lista completa de bandejas compatibles para un dispositivo. Permite la especificación de la bandeja de entrada por página. Las palabras clave [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) y [PageInputBin](./) son mutuamente excluyentes. No deben especificarse simultáneamente en un [PrintTicket](../printticket/) o documento de Capacidades de Impresión. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
