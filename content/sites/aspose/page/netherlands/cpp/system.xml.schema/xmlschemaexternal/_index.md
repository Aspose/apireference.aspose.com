---
title: "System::Xml::Schema::XmlSchemaExternal klasse"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaExternal klasse. Biedt informatie over het opgenomen schema in C++."
type: docs
weight: 2800
url: /nl/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Biedt informatie over het opgenomen schema.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Id](./get_id/)() | Retourneert de tekenreeks‑id. |
| [get_Schema](./get_schema/)() | Retourneert de [XmlSchema](../xmlschema/) voor het gerefereerde schema. |
| [get_SchemaLocation](./get_schemalocation/)() | Retourneert de Uniform Resource Identifier (URI) locatie voor het schema, die de schema‑processor vertelt waar het schema fysiek zich bevindt. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Retourneert de gekwalificeerde attributen, die niet tot de doel‑namespace van het schema behoren. |
| [set_Id](./set_id/)(const String\&) | Stelt de string id in. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Stelt de [XmlSchema](../xmlschema/) in voor het gerefereerde schema. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Stelt de Uniform Resource Identifier (URI)-locatie in voor het schema, die de schemaprocessor vertelt waar het schema fysiek zich bevindt. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Stelt de gekwalificeerde attributen in, die niet tot de doel-namespace van het schema behoren. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaExternal](./)-klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
