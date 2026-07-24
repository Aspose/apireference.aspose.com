---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction klasse"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction klasse. Vertegenwoordigt het **restriction**-element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse is voor complexe types met een complex inhoudsmodel afgeleid door restrictie. Het beperkt de inhoud van het complexe type tot een subset van het geërfde complexe type in C++."
type: docs
weight: 2000
url: /nl/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Vertegenwoordigt het **restriction**-element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse is voor complexe types met een complex inhoudsmodel afgeleid door restrictie. Het beperkt de inhoud van het complexe type tot een subset van het geërfde complexe type.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe inhoudsmodel. |
| [get_Attributes](./get_attributes/)() | Retourneert de verzameling attributen voor het complexe type. Bevat de [XmlSchemaAttribute](../xmlschemaattribute/) en [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) elementen. |
| [get_BaseTypeName](./get_basetypename/)() | Retourneert de naam van een complex type waarvan dit type is afgeleid door restrictie. |
| [get_Particle](./get_particle/)() | Retourneert een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe inhoudsmodel in. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een complex type waarvan dit type is afgeleid door restrictie. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Stelt een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen in. |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaComplexContentRestriction](./) klasse. |
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
