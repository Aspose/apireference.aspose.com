---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp classe"
linktitle: "DocumentNUp"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp classe. Décrit la sortie et le format de plusieurs pages logiques sur une seule feuille physique. Chaque document est compilé séparément. DocumentNUp et JobNUpAllDocumentsContiguously sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. en C++."
type: docs
weight: 2000
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Décrit la sortie et le format de plusieurs pages logiques sur une seule feuille physique. Chaque document est compilé séparément. **[DocumentNUp](./)** et [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Ajoute une option avec une valeur de propriété notée **PagesPerSheet**. Spécifie le nombre de pages logiques par feuille physique. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
