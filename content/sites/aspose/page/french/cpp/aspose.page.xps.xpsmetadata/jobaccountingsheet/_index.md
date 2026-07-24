---
title: "classe Aspose::Page::XPS::XpsMetadata::JobAccountingSheet"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page pour C++"
description: "classe Aspose::Page::XPS::XpsMetadata::JobAccountingSheet. Décrit la feuille de comptabilité à produire pour le travail. La feuille de comptabilité doit être imprimée avec la taille de support PageMediaSize par défaut et en utilisant le type de support PageMediaType par défaut. La feuille de comptabilité doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que JobDuplex, JobStaple ou JobBinding) ne doit pas inclure la feuille de comptabilité. La feuille de comptabilité peut apparaître comme première ou dernière page du travail à la discrétion de l’implémenteur.  en C++."
type: docs
weight: 4400
url: /fr/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Décrit la feuille de comptabilité à générer pour le travail. La feuille de comptabilité doit être générée avec la [PageMediaSize](../pagemediasize/) par défaut et en utilisant le [PageMediaType](../pagemediatype/) par défaut. La feuille de comptabilité doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que **JobDuplex**, **JobStaple** ou **JobBinding**) ne doit pas inclure la feuille de comptabilité. La feuille de comptabilité peut apparaître comme première ou dernière page du travail à la discrétion de l'implémenteur. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
