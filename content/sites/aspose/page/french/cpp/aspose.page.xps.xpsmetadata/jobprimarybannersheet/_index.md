---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet classe"
linktitle: "JobPrimaryBannerSheet"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet classe. Décrit la feuille de bannière à produire pour le travail. La feuille de bannière doit être produite avec le PageMediaSize par défaut et en utilisant le PageMediaType par défaut. La feuille de bannière doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que JobDuplexAllDocumentsContiguously, JobStapleAllDocuments ou JobBindAllDocuments) ne doit pas inclure la feuille de bannière. La feuille de bannière doit apparaître comme la première feuille du travail en C++."
type: docs
weight: 6400
url: /fr/cpp/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class


Décrit la feuille de bannière à produire pour le travail. La feuille de bannière doit être produite avec le [PageMediaSize](../pagemediasize/) par défaut et en utilisant le [PageMediaType](../pagemediatype/) par défaut. La feuille de bannière doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/), [JobStapleAllDocuments](../jobstaplealldocuments/), ou [JobBindAllDocuments](../jobbindalldocuments/)) ne doit pas inclure la feuille de bannière. La feuille de bannière doit apparaître comme la première feuille du travail.

```cpp
class JobPrimaryBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                              public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryBannerSheet::BannerSheetOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
