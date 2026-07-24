---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack classe"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack classe. Décrit la feuille de couverture arrière (de fin). Chaque document aura une feuille séparée. La feuille de couverture doit être imprimée avec le PageMediaSize et le PageMediaType utilisés pour la page finale du document. La feuille de couverture doit être intégrée aux options de traitement (telles que DocumentDuplex, DocumentNUp) comme indiqué par l'Option spécifiée. en C++."
type: docs
weight: 1000
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


Décrit la feuille de couverture arrière (de fin). Chaque document aura une feuille séparée. La feuille de couverture doit être imprimée avec le [PageMediaSize](../pagemediasize/) et le [PageMediaType](../pagemediatype/) utilisés pour la page finale du document. La feuille de couverture doit être intégrée aux options de traitement (telles que [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) comme indiqué par l'[Option](../option/) spécifiée. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
