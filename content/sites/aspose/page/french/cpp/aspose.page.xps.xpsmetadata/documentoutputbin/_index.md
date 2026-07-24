---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin classe"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin classe. Décrit la liste complète des bacs pris en charge pour le dispositif. Permet la spécification du bac de sortie par document. Les mots-clés JobOutputBin, DocumentOutputBin et PageOutputBin sont mutuellement exclusifs ; un seul doit être spécifié dans un document PrintTicket ou Print Capabilities. en C++."
type: docs
weight: 2100
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Décrit la liste complète des bacs pris en charge pour le dispositif. Permet la spécification du bac de sortie par document. Les mots-clés [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) et [PageOutputBin](../pageoutputbin/) sont mutuellement exclusifs ; un seul doit être spécifié dans un document [PrintTicket](../printticket/) ou Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
