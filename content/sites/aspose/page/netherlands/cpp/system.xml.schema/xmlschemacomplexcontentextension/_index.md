---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension‑klasse"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension‑klasse. Stelt het extension‑element uit XML Schema voor, zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse is bedoeld voor complexe types met een complex inhoudsmodel dat is afgeleid door extensie. Het breidt het complexe type uit door attributen of elementen toe te voegen in C++."
type: docs
weight: 1900
url: /nl/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Stelt het **extension**‑element uit XML [Schema](../) voor, zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse is bedoeld voor complexe types met een complex inhoudsmodel dat is afgeleid door extensie. Het breidt het complexe type uit door attributen of elementen toe te voegen.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe inhoudsmodel. |
| [get_Attributes](./get_attributes/)() | Retourneert de verzameling attributen voor de complexe inhoud. Bevat de elementen [XmlSchemaAttribute](../xmlschemaattribute/) en [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Retourneert de naam van het complexe type waarvan dit type is afgeleid door extensie. |
| [get_Particle](./get_particle/)() | Retourneert een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe inhoudsmodel in. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van het complexe type waarvan dit type is afgeleid door extensie. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Stelt een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen in. |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaComplexContentExtension](./)‑klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
