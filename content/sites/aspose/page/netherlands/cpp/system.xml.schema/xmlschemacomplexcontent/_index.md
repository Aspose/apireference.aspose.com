---
title: "System::Xml::Schema::XmlSchemaComplexContent klasse"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaComplexContent klasse. Vertegenwoordigt het complexContent-element van XML Schema zoals gespecificeerd door de World Wide Web Consortium (W3C). Deze klasse vertegenwoordigt het complexe inhoudsmodel voor complexe types. Het bevat extensies of beperkingen op een complex type dat alleen elementen of gemengde inhoud heeft in C++."
type: docs
weight: 1800
url: /nl/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Vertegenwoordigt het **complexContent**-element van XML [Schema](../) zoals gespecificeerd door de World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse vertegenwoordigt het complexe inhoudsmodel voor complexe types. Het bevat extensies of beperkingen op een complex type dat alleen elementen of gemengde inhoud heeft.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Content](./get_content/)() override | Retourneert de inhoud. |
| [get_IsMixed](./get_ismixed/)() | Retourneert informatie die bepaalt of het type een gemengd inhoudsmodel heeft. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Stelt de inhoud in. |
| [set_IsMixed](./set_ismixed/)(bool) | Stelt informatie in die bepaalt of het type een gemengd inhoudsmodel heeft. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaComplexContent](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
