---
title: "Aspose::Page::XPS::XpsMetadata::Feature klasse"
linktitle: "Functie"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature klasse. De klasse die een algemene Print Schema‑functie incapsuleert. De basisklasse voor alle schema‑gedefinieerde functies. Een Feature‑element bevat een volledige lijst van de Option‑ en Property‑elementen die een apparaat‑attribuut, taak‑opmaakinstelling of ander relevant kenmerk volledig beschrijven.  in C++."
type: docs
weight: 2900
url: /nl/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


De klasse die een algemene Print Schema‑functie incapsuleert. De basisklasse voor alle schema‑gedefinieerde functies. Een **[Feature](./)** element bevat een volledige lijst van de [Option](../option/) en [Property](../property/) elementen die een apparaat‑attribuut, taak‑opmaakinstelling of ander relevant kenmerk volledig beschrijven. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Voegt een lijst van items toe aan het einde van de itemlijst van deze feature. Elk item moet een [Feature](./), een [Option](../option/) of een [Property](../property/) instantie zijn. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Maakt een nieuw [PrintTicket](../printticket/) feature‑object aan. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Maakt een nieuw [PrintTicket](../printticket/) feature‑object aan. |
## Zie ook

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
