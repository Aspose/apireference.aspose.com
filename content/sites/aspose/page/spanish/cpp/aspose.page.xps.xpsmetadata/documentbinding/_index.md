---
title: "Clase Aspose::Page::XPS::XpsMetadata::DocumentBinding"
linktitle: "DocumentBinding"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::DocumentBinding. Describe el método de encuadernación. Cada documento se encuaderna por separado. DocumentBinding y JobBindAllDocuments son mutuamente excluyentes. Corresponde al controlador determinar el manejo de restricciones entre palabras clave. en C++."
type: docs
weight: 600
url: /es/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Describe el método de encuadernación. Cada documento se encuaderna por separado. [DocumentBinding](./) y [JobBindAllDocuments](../jobbindalldocuments/) son mutuamente excluyentes. Corresponde al controlador determinar el manejo de restricciones entre palabras clave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Métodos

| Método | Descripción |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
