---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef klasse"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef klasse. Vertegenwoordigt het attributeGroup-element met het ref-attribuut uit het XML Schema zoals gespecificeerd door de . AttributesGroupRef is de referentie voor een attributeGroup, de eigenschap name bevat de attribute group waarnaar wordt verwezen in C++."
type: docs
weight: 1300
url: /nl/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Vertegenwoordigt het **attributeGroup** element met het **ref** attribuut uit het XML [Schema](../) zoals gespecificeerd door de [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef is de referentie voor een attributeGroup, de eigenschap name bevat de attribute group waarnaar wordt verwezen.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_RefName](./get_refname/)() | Retourneert de naam van het verwezen **attributeGroup** element. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam van het verwezen **attributeGroup** element in. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaAttributeGroupRef](./) klasse. |
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
