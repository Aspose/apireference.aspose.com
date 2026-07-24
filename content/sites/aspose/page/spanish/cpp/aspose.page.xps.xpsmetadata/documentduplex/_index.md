---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex clase"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex class. Describe las características dúplex de la salida. La función dúplex permite imprimir en ambos lados del medio. Cada documento se procesa en dúplex de forma independiente. DocumentDuplex y JobDuplexAllDocumentsContiguously son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave.  en C++."
type: docs
weight: 1400
url: /es/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Describe las características dúplex de la salida. La función dúplex permite imprimir en ambos lados del medio. Cada documento se procesa en dúplex de forma independiente. [DocumentDuplex](./) y [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
