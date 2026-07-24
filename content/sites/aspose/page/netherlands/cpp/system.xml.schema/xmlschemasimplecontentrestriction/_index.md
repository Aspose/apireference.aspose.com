---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction klasse"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction klasse. Vertegenwoordigt het restrictie-element voor eenvoudige inhoud van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige types af te leiden via restrictie. Dergelijke afleidingen kunnen worden gebruikt om het bereik van waarden voor het element te beperken tot een subset van de waarden die zijn gespecificeerd in het geërfde eenvoudige type in C++."
type: docs
weight: 6100
url: /nl/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Vertegenwoordigt het **restriction** element voor eenvoudige inhoud van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige types af te leiden via restriction. Dergelijke afleidingen kunnen worden gebruikt om het bereik van waarden voor het element te beperken tot een subset van de waarden die zijn gespecificeerd in het geërfde eenvoudige type.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert een [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) die gebruikt kan worden voor de attribuutwaarde. |
| [get_Attributes](./get_attributes/)() | Retourneert de [XmlSchemaAttribute](../xmlschemaattribute/) en [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) collectie van attributen voor het eenvoudige type. |
| [get_BaseType](./get_basetype/)() | Retourneert de basiswaarde van het eenvoudige type. |
| [get_BaseTypeName](./get_basetypename/)() | Retourneert de naam van het ingebouwde gegevenstype of eenvoudige type waaruit dit type is afgeleid. |
| [get_Facets](./get_facets/)() | Retourneert een [Xml](../../system.xml/)[Schema](../) facet. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt een [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) in die moet worden gebruikt voor de attribuutwaarde. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt de basiswaarde van het eenvoudige type in. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam van het ingebouwde gegevenstype of eenvoudige type waaruit dit type is afgeleid in. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaSimpleContentRestriction](./) klasse. |
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
