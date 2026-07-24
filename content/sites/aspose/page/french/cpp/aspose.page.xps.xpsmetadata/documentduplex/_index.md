---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex classe"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex class. Décrit les caractéristiques duplex de la sortie. La fonction duplex permet l’impression des deux côtés du support. Chaque document est duplexé séparément. DocumentDuplex et JobDuplexAllDocumentsContiguously sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. en C++."
type: docs
weight: 1400
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Décrit les caractéristiques duplex de la sortie. La fonction duplex permet l’impression des deux côtés du support. Chaque document est duplexé séparément. [DocumentDuplex](./) et [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots‑clés. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
