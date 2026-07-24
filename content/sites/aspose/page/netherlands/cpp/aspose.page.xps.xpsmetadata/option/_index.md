---
title: "Aspose::Page::XPS::XpsMetadata::Option klasse"
linktitle: "Option"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::Option klasse. De klasse die een algemene PrintTicketOption implementeert. De basisklasse voor alle schema-gedefinieerde opties. Een Option‑element bevat alle Property‑ en ScoredProperty‑elementen die bij deze optie horen.  in C++."
type: docs
weight: 7600
url: /nl/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


De klasse die een algemene [PrintTicket](../printticket/)**[Option](./)** implementeert. De basisklasse voor alle schema‑gedefinieerde opties. Een [Option](./) element bevat alle [Property](../property/) en [ScoredProperty](../scoredproperty/) elementen die bij deze optie horen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Voegt een lijst met items toe aan het einde van de itemlijst van deze optie. Elk item moet een [ScoredProperty](../scoredproperty/) of [Property](../property/) instantie zijn. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Maakt een nieuwe [PrintTicket](../printticket/) optie‑instantie. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Maakt een nieuwe [PrintTicket](../printticket/) optie‑instantie. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Maakt een gekloonde optie‑instantie. |
## Zie ook

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
