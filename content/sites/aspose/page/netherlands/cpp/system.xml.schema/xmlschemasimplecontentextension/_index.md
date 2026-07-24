---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension klasse"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension klasse. Vertegenwoordigt het **extension**‑element voor eenvoudige inhoud uit XML‑Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige typen af te leiden door extensie. Dergelijke afleidingen worden gebruikt om de inhoud van het eenvoudige type van het element uit te breiden door attributen toe te voegen in C++."
type: docs
weight: 6000
url: /nl/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Vertegenwoordigt het **extension**‑element voor eenvoudige inhoud uit XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige typen af te leiden door extensie. Dergelijke afleidingen worden gebruikt om de inhoud van het eenvoudige type van het element uit te breiden door attributen toe te voegen.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert de [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) die moet worden gebruikt voor de attribuutwaarde. |
| [get_Attributes](./get_attributes/)() | Retourneert de collectie van [XmlSchemaAttribute](../xmlschemaattribute/) en [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Retourneert de naam van een ingebouwd gegevenstype of eenvoudig type waaruit dit type is uitgebreid. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt de [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) in die moet worden gebruikt voor de attribuutwaarde. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een ingebouwd gegevenstype of eenvoudig type waaruit dit type is uitgebreid. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaSimpleContentExtension](./) klasse. |
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
