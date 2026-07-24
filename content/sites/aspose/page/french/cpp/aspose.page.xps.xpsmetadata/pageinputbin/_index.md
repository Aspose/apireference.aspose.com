---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin classe"
linktitle: "PageInputBin"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin classe. Décrit le bac d'entrée installé dans un appareil ou la liste complète des bacs pris en charge pour un appareil. Permet la spécification du bac d'entrée page par page. Les mots-clés JobInputBin, DocumentInputBin et PageInputBin sont mutuellement exclusifs. Aucun des deux ne doit être spécifié simultanément dans un document PrintTicket ou Print Capabilities. en C++."
type: docs
weight: 10000
url: /fr/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Décrit le bac d'entrée installé dans un appareil ou la liste complète des bacs pris en charge pour un appareil. Permet la spécification du bac d'entrée page par page. Les mots-clés [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) et [PageInputBin](./) sont mutuellement exclusifs. Aucun des deux ne doit être spécifié simultanément dans un [PrintTicket](../printticket/) ou un document Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
