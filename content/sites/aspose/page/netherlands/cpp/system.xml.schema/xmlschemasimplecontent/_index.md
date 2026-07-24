---
title: "System::Xml::Schema::XmlSchemaSimpleContent klasse"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent klasse. Vertegenwoordigt het simpleContent‑element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse is voor eenvoudige en complexe typen met een eenvoudig inhoudsmodel in C++."
type: docs
weight: 5900
url: /nl/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Vertegenwoordigt het **simpleContent**‑element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse is voor eenvoudige en complexe typen met een eenvoudig inhoudsmodel.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Content](./get_content/)() override | Retourneert een van de [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) of [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Retourneert een van de [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) of [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
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
