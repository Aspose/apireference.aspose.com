---
title: "Clase Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Describe la hoja de banner que se debe generar para un documento particular. La hoja de banner debe generarse con el PageMediaSize predeterminado y usando el PageMediaType predeterminado. La hoja de banner también debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como DocumentDuplex, DocumentStaple o DocumentBinding) no debe incluir la hoja de banner. La hoja de banner puede o no estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento del trabajo, puede incluir la hoja de banner del documento. La hoja de banner debe aparecer como la primera hoja del documento.  en C++."
type: docs
weight: 400
url: /es/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Describe la hoja de banner que se debe generar para un documento particular. La hoja de banner debe generarse con el [PageMediaSize](../pagemediasize/) predeterminado y usando el [PageMediaType](../pagemediatype/) predeterminado. La hoja de banner también debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), o [DocumentBinding](../documentbinding/)) no debe incluir la hoja de banner. La hoja de banner puede o no estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento del trabajo, puede incluir la hoja de banner del documento. La hoja de banner debe aparecer como la primera hoja del documento. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
