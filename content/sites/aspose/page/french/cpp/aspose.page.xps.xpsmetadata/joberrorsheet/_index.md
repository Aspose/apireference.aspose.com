---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet classe"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet classe. Décrit la sortie de la feuille d'erreur. L'ensemble du travail comportera une seule feuille d'erreur. La feuille d'erreur doit être imprimée avec le PageMediaSize par défaut et en utilisant le PageMediaType par défaut. La feuille d'erreur doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que JobDuplex, JobStaple ou JobBinding) ne doit pas inclure la feuille d'erreur. La feuille d'erreur doit apparaître comme la dernière feuille du travail.  en C++."
type: docs
weight: 5300
url: /fr/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Décrit la sortie de la feuille d'erreur. L'ensemble du travail comportera une seule feuille d'erreur. La feuille d'erreur doit être imprimée avec le [PageMediaSize](../pagemediasize/) par défaut et en utilisant le [PageMediaType](../pagemediatype/) par défaut. La feuille d'erreur doit être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que **JobDuplex**, **JobStaple** ou **JobBinding**) ne doit pas inclure la feuille d'erreur. La feuille d'erreur doit apparaître comme la dernière feuille du travail. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
