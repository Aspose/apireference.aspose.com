---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding classe"
linktitle: "DocumentBinding"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding classe. Décrit la méthode de reliure. Chaque document est relié séparément. DocumentBinding et JobBindAllDocuments sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre les mots-clés. en C++."
type: docs
weight: 600
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Décrit la méthode de reliure. Chaque document est relié séparément. [DocumentBinding](./) et [JobBindAllDocuments](../jobbindalldocuments/) sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre les mots-clés. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
