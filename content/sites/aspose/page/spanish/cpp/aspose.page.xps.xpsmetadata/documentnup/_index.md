---
title: "Clase Aspose::Page::XPS::XpsMetadata::DocumentNUp"
linktitle: "DocumentNUp"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::DocumentNUp. Describe la salida y el formato de múltiples páginas lógicas en una sola hoja física. Cada documento se compila por separado. DocumentNUp y JobNUpAllDocumentsContiguously son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave.  en C++."
type: docs
weight: 2000
url: /es/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Describe la salida y el formato de múltiples páginas lógicas en una sola hoja física. Cada documento se compila por separado. **[DocumentNUp](./)** y [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Agrega una opción con un valor de propiedad puntuada **PagesPerSheet**. Especifica el número de páginas lógicas por hoja física. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
