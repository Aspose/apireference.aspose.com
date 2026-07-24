---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin classe"
linktitle: "PageOutputBin"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin classe. Décrit la liste complète des bacs pris en charge pour le dispositif. Permet la spécification du bac de sortie page par page. Les mots‑clés JobOutputBin, DocumentOutputBin et PageOutputBin sont mutuellement exclusifs ; un seul doit être spécifié dans un PrintTicket ou un document Print Capabilities.  en C++."
type: docs
weight: 11400
url: /fr/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Décrit la liste complète des bacs pris en charge pour le dispositif. Permet la spécification du bac de sortie page par page. Les mots‑clés [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) et [PageOutputBin](./) sont mutuellement exclusifs ; un seul doit être spécifié dans un [PrintTicket](../printticket/) ou un document Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
