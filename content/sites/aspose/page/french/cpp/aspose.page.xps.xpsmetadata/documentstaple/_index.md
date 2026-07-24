---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple classe"
linktitle: "DocumentStaple"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple classe. Décrit les caractéristiques d’agrafeuse de la sortie. Chaque document est agrafé séparément. Les mots‑clés JobStapleAllDocuments et DocumentStaple sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. en C++."
type: docs
weight: 2600
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Décrit les caractéristiques d’agrafeuse de la sortie. Chaque document est agrafé séparément. Les mots‑clés [JobStapleAllDocuments](../jobstaplealldocuments/) et [DocumentStaple](./) sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
