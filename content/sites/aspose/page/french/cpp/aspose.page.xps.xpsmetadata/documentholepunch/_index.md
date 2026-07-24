---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch classe"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch classe. Décrit les caractéristiques de perforation du résultat. Chaque document est perforé séparément. Les mots‑clés JobHolePunch et DocumentHolePunch sont mutuellement exclusifs. Aucun des deux ne doit être spécifié simultanément dans un PrintTicket ou un document Print Capabilities.  en C++."
type: docs
weight: 1500
url: /fr/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Décrit les caractéristiques de perforation du résultat. Chaque document est perforé séparément. Les mots‑clés [JobHolePunch](../jobholepunch/) et [DocumentHolePunch](./) sont mutuellement exclusifs. Aucun des deux ne doit être spécifié simultanément dans un [PrintTicket](../printticket/) ou un document Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
