---
title: "System::Xml::Schema::XmlSchemaSimpleType klasse"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleType klasse. Vertegenwoordigt het simpleType‑element voor eenvoudige inhoud van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse definieert een eenvoudige type. Eenvoudige types kunnen informatie en beperkingen specificeren voor de waarde van attributen of elementen met uitsluitend tekstuele inhoud in C++."
type: docs
weight: 6200
url: /nl/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Vertegenwoordigt het **simpleType**‑element voor eenvoudige inhoud van XML [Schema](../) zoals gespecificeerd door de World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse definieert een eenvoudige type. Eenvoudige types kunnen informatie en beperkingen specificeren voor de waarde van attributen of elementen met uitsluitend tekstuele inhoud.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Content](./get_content/)() | Retourneert een van [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), of [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Stelt een van [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), of [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) in. |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaSimpleType](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
