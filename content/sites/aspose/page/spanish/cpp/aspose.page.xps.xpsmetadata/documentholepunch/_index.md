---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class. Describe las características de perforación del documento de salida. Cada documento se perfora por separado. Las palabras clave JobHolePunch y DocumentHolePunch son mutuamente excluyentes. Ambas no deben especificarse simultáneamente en un PrintTicket o documento de Capacidades de impresión.  en C++."
type: docs
weight: 1500
url: /es/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Describe las características de perforación del documento de salida. Cada documento se perfora por separado. Las palabras clave [JobHolePunch](../jobholepunch/) y [DocumentHolePunch](./) son mutuamente excluyentes. Ambas no deben especificarse simultáneamente en un [PrintTicket](../printticket/) o documento de Capacidades de impresión. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
