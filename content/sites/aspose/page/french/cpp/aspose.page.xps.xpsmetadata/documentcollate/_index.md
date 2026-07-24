---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate classe"
linktitle: "DocumentCollate"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate classe. Décrit les caractéristiques de regroupement de la sortie. Toutes les pages de chaque document individuel sont regroupées. DocumentCollate et JobCollateAlldocuments sont mutuellement exclusifs. Le comportement et l’implémentation de la prise en charge de l’un ou l’autre de ces mots‑clés sont laissés au pilote. en C++."
type: docs
weight: 800
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Décrit les caractéristiques de regroupement de la sortie. Toutes les pages de chaque document individuel sont regroupées. [DocumentCollate](./) et JobCollateAlldocuments sont mutuellement exclusifs. Le comportement et l’implémentation de la prise en charge de l’un ou l’autre de ces mots‑clés sont laissés au pilote. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
