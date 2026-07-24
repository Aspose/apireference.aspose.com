---
title: "Aspose::Page::XPS::XpsMetadata::Option-Klasse"
linktitle: "Option"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::Option-Klasse. Die Klasse, die eine allgemeine PrintTicketOption implementiert. Die Basisklasse für alle schemaspezifischen Optionen. Ein Option-Element enthält alle zugehörigen Property- und ScoredProperty-Elemente. in C++."
type: docs
weight: 7600
url: /de/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Die Klasse, die eine allgemeine [PrintTicket](../printticket/)**[Option](./)** implementiert. Die Basisklasse für alle schemaspezifischen Optionen. Ein [Option](./)-Element enthält alle zugehörigen [Property](../property/)- und [ScoredProperty](../scoredproperty/)-Elemente. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jeder Eintrag muss eine Instanz von [ScoredProperty](../scoredproperty/) oder [Property](../property/) sein. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Erstellt eine neue [PrintTicket](../printticket/)-Option-Instanz. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Erstellt eine neue [PrintTicket](../printticket/)-Option-Instanz. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Erstellt eine geklonte Optionsinstanz. |
## Siehe auch

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
