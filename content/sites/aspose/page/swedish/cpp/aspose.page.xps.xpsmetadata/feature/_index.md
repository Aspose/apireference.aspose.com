---
title: "Aspose::Page::XPS::XpsMetadata::Feature klass"
linktitle: "Funktion"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature klass. Klassen som kapslar en gemensam Print Schema-funktion. Basklassen för alla schemadefinierade funktioner. Ett Feature-element innehåller en komplett lista över Option- och Property-element som fullt beskriver en enhetsattribut, jobbformateringsinställning eller annan relevant egenskap.  i C++."
type: docs
weight: 2900
url: /sv/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


The class that incapsulates a common Print Schema feature. The base class for all schema-defined features. A **[Feature](./)** element contains a complete list of the [Option](../option/) and [Property](../property/) elements that fully describe a device attribute, job formatting setting, or other relevant characteristic. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Varje objekt måste vara en [Feature](./), ett [Option](../option/) eller ett [Property](../property/)-instans. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Skapar en ny [PrintTicket](../printticket/) funktionsinstans. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Skapar en ny [PrintTicket](../printticket/) funktionsinstans. |
## Se även

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
