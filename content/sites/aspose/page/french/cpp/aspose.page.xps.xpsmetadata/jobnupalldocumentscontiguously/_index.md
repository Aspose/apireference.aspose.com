---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class. Décrit la sortie de plusieurs pages logiques sur une seule feuille physique. Tous les documents du travail sont compilés ensemble de manière contiguë. JobNUpAllDocumentsContiguously et DocumentNUp sont mutuellement exclusifs. C'est au pilote de déterminer la gestion des contraintes entre ces mots-clés.  en C++."
type: docs
weight: 5900
url: /fr/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Décrit la sortie de plusieurs pages logiques sur une seule feuille physique. Tous les documents du travail sont compilés ensemble de manière contiguë. [JobNUpAllDocumentsContiguously](./) et [DocumentNUp](../documentnup/) sont mutuellement exclusifs. C'est au pilote de déterminer la gestion des contraintes entre ces mots-clés. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Ajoute une option avec une valeur de propriété notée **PagesPerSheet**. Spécifie le nombre de pages logiques par feuille physique. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
