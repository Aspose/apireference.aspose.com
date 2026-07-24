---
title: "System::Xml::Schema::XmlSchemaInfo klasse"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaInfo klasse. Vertegenwoordigt de post-schema-validatie infoset van een gevalideerde XML-knoop in C++."
type: docs
weight: 3800
url: /nl/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Vertegenwoordigt de post-schema-validatie-infoset van een gevalideerde XML-node.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Retourneert het [XmlSchemaContentType](../xmlschemacontenttype/) object dat overeenkomt met het inhoudstype van deze gevalideerde XML-knoop. |
| [get_IsDefault](./get_isdefault/)() override | Retourneert een waarde die aangeeft of deze gevalideerde XML-knoop is ingesteld als resultaat van een standaardwaarde die is toegepast tijdens XML [Schema](../) Definition Language (XSD) schema-validatie. |
| [get_IsNil](./get_isnil/)() override | Retourneert een waarde die aangeeft of de waarde voor deze gevalideerde XML-knoop **nil** is. |
| [get_MemberType](./get_membertype/)() override | Retourneert het dynamische schematype voor deze gevalideerde XML-knoop. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Retourneert het gecompileerde [XmlSchemaAttribute](../xmlschemaattribute/) object dat overeenkomt met deze gevalideerde XML-knoop. |
| [get_SchemaElement](./get_schemaelement/)() override | Retourneert het gecompileerde [XmlSchemaElement](../xmlschemaelement/) object dat overeenkomt met deze gevalideerde XML-knoop. |
| [get_SchemaType](./get_schematype/)() override | Retourneert het statische XML [Schema](../) Definition Language (XSD) schematype van deze gevalideerde XML-knoop. |
| [get_Validity](./get_validity/)() override | Retourneert de [XmlSchemaValidity](../xmlschemavalidity/) waarde van deze gevalideerde XML-node. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Stelt het [XmlSchemaContentType](../xmlschemacontenttype/) object in dat overeenkomt met het inhoudstype van deze gevalideerde XML-node. |
| [set_IsDefault](./set_isdefault/)(bool) | Stelt een waarde in die aangeeft of deze gevalideerde XML-node is ingesteld als resultaat van een standaard die is toegepast tijdens XML [Schema](../) Definition Language (XSD) schema-validatie. |
| [set_IsNil](./set_isnil/)(bool) | Stelt een waarde in die aangeeft of de waarde voor deze gevalideerde XML-node **nil** is. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt het dynamische schematype in voor deze gevalideerde XML-node. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Stelt het gecompileerde [XmlSchemaAttribute](../xmlschemaattribute/) object in dat overeenkomt met deze gevalideerde XML-node. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Stelt het gecompileerde [XmlSchemaElement](../xmlschemaelement/) object in dat overeenkomt met deze gevalideerde XML-node. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Stelt het statische XML [Schema](../) Definition Language (XSD) schematype in van deze gevalideerde XML-node. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Stelt de [XmlSchemaValidity](../xmlschemavalidity/) waarde in van deze gevalideerde XML-node. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaInfo](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
