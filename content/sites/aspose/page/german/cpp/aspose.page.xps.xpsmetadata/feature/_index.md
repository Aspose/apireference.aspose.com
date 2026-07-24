---
title: "Aspose::Page::XPS::XpsMetadata::Feature Klasse"
linktitle: "Feature"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature Klasse. Die Klasse, die ein allgemeines Print‑Schema‑Feature kapselt. Die Basisklasse für alle schemadefinierte Features. Ein Feature‑Element enthält eine vollständige Liste der Option‑ und Property‑Elemente, die ein Geräteattribut, eine Auftragsformatierungseinstellung oder ein anderes relevantes Merkmal vollständig beschreiben.  in C++."
type: docs
weight: 2900
url: /de/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


Die Klasse, die ein gemeinsames Print‑Schema‑Feature kapselt. Die Basisklasse für alle schema‑definierten Features. Ein **[Feature](./)**‑Element enthält eine vollständige Liste der [Option](../option/)- und [Property](../property/)-Elemente, die ein Geräteattribut, eine Job‑Formatierungseinstellung oder ein anderes relevantes Merkmal vollständig beschreiben. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. Jeder Eintrag muss eine Instanz von [Feature](./), [Option](../option/) oder [Property](../property/) sein. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Erstellt eine neue [PrintTicket](../printticket/)-Feature‑Instanz. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Erstellt eine neue [PrintTicket](../printticket/)-Feature‑Instanz. |
## Siehe auch

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
