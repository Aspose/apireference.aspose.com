---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet classe"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet classe. Décrit la feuille bannière à produire pour un document particulier. La feuille bannière doit être produite avec la taille de page par défaut PageMediaSize et le type de support par défaut PageMediaType. La feuille bannière doit également être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que DocumentDuplex, DocumentStaple ou DocumentBinding) ne doit pas inclure la feuille bannière. La feuille bannière peut ou non être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement du travail peut inclure la feuille bannière du document. La feuille bannière doit apparaître comme la première feuille du document.  en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Décrit la feuille bannière à produire pour un document particulier. La feuille bannière doit être produite avec la [PageMediaSize](../pagemediasize/) par défaut et en utilisant le [PageMediaType](../pagemediatype/) par défaut. La feuille bannière doit également être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement (telle que [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), ou [DocumentBinding](../documentbinding/)) ne doit pas inclure la feuille bannière. La feuille bannière peut ou non être isolée du reste du travail. Cela signifie que toute option de finition ou de traitement du travail peut inclure la feuille bannière du document. La feuille bannière doit apparaître comme la première feuille du document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
