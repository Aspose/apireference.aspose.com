---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class"
linktitle: "DocumentCollate"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Describe las características de agrupación de la salida. Todas las páginas de cada documento individual se agrupan. DocumentCollate y JobCollateAlldocuments son mutuamente excluyentes. El comportamiento y la implementación de si ambos o solo uno de estas palabras clave se implementa queda a cargo del controlador.  en C++."
type: docs
weight: 800
url: /es/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Describe las características de agrupación de la salida. Todas las páginas de cada documento individual se agrupan. [DocumentCollate](./) y JobCollateAlldocuments son mutuamente excluyentes. El comportamiento y la implementación de si ambos o solo uno de estas palabras clave se implementa queda a cargo del controlador. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
