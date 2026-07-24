---
title: "System::Xml::Schema::XmlSchemaAttributeGroup klasse"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup klasse. Vertegenwoordigt het attributeGroup-element uit het XML Schema zoals gespecificeerd door de World Wide Web Consortium (W3C). AttributesGroups biedt een mechanisme om een reeks attribuutdeclaraties te groeperen zodat ze als groep kunnen worden opgenomen in complexe type-definities in C++."
type: docs
weight: 1200
url: /nl/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Stelt het **attributeGroup**-element uit de XML [Schema](../) voor, zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). AttributesGroups biedt een mechanisme om een reeks attribuutdeclaraties te groeperen zodat ze als groep kunnen worden opgenomen in complexe type-definities.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van de attribuutgroep. |
| [get_Attributes](./get_attributes/)() | Retourneert de verzameling attributen voor de attribuutgroep. Bevat de elementen [XmlSchemaAttribute](../xmlschemaattribute/) en [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Retourneert de naam van de attribuutgroep. |
| [get_QualifiedName](./get_qualifiedname/)() | Retourneert de gekwalificeerde naam van de attribuutgroep. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Retourneert de opnieuw gedefinieerde attribuutgroepeigenschap uit de XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt het [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van de attribuutgroep in. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van de attribuutgroep in. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaAttributeGroup](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
