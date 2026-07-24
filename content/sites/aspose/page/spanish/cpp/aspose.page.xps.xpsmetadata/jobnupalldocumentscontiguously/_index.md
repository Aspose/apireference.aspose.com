---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class. Describe la salida de múltiples páginas lógicas a una sola hoja física. Todos los documentos del trabajo se compilan juntos de forma contigua. JobNUpAllDocumentsContiguously y DocumentNUp son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave.  en C++."
type: docs
weight: 5900
url: /es/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Describe la salida de múltiples páginas lógicas a una sola hoja física. Todos los documentos del trabajo se compilan juntos de forma contigua. [JobNUpAllDocumentsContiguously](./) y [DocumentNUp](../documentnup/) son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Agrega una opción con un valor de propiedad puntuada **PagesPerSheet**. Especifica el número de páginas lógicas por hoja física. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
