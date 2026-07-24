---
title: "Clase Aspose::Page::XPS::XpsMetadata::DocumentCoverBack"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::DocumentCoverBack. Describe la hoja de cubierta trasera (final). Cada documento tendrá una hoja separada. La hoja de cubierta debe imprimirse con el PageMediaSize y PageMediaType utilizados para la página final del documento. La hoja de cubierta debe integrarse en las opciones de procesamiento (como DocumentDuplex, DocumentNUp) según lo indique la Option especificada.  en C++."
type: docs
weight: 1000
url: /es/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


Describe la hoja de cubierta trasera (final). Cada documento tendrá una hoja separada. La hoja de cubierta debe imprimirse con el [PageMediaSize](../pagemediasize/) y [PageMediaType](../pagemediatype/) utilizados para la página final del documento. La hoja de cubierta debe integrarse en las opciones de procesamiento (como [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) según lo indique la [Option](../option/) especificada. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
