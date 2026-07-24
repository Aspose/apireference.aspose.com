---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin classe"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin classe. Décrit le bac d'entrée installé dans un appareil ou la liste complète des bacs pris en charge pour un appareil. Les mots-clés JobInputBin, DocumentInputBin et PageInputBin sont mutuellement exclusifs. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou de capacités d'impression.  en C++."
type: docs
weight: 1800
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Décrit le bac d'entrée installé dans un appareil ou la liste complète des bacs pris en charge pour un appareil. Les mots-clés [JobInputBin](../jobinputbin/), [DocumentInputBin](./) et [PageInputBin](../pageinputbin/) sont mutuellement exclusifs. Les deux ne doivent pas être spécifiés simultanément dans un [PrintTicket](../printticket/) ou un document de capacités d'impression. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
