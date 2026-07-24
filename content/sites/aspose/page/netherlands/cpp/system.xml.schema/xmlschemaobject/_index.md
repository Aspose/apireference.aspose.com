---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaObject class. Stelt de rootklasse voor de Xml-schema-objectmodelhiërarchie voor en dient als basisklasse voor klassen zoals de XmlSchema-klasse in C++."
type: docs
weight: 5000
url: /nl/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


Stelt de rootklasse voor de [Xml](../../system.xml/) schema-objectmodelhiërarchie voor en dient als basisklasse voor klassen zoals de [XmlSchema](../xmlschema/) klasse.

```cpp
class XmlSchemaObject : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Retourneert het regelnummmer in het bestand waarnaar het **schema** element verwijst. |
| [get_LinePosition](./get_lineposition/)() | Retourneert de regelpositie in het bestand waarnaar het **schema** element verwijst. |
| [get_Namespaces](./get_namespaces/)() | Retourneert de XmlSerializerNamespaces die met dit schema‑object moeten worden gebruikt. |
| [get_Parent](./get_parent/)() | Retourneert de ouder van dit [XmlSchemaObject](./). |
| [get_SourceUri](./get_sourceuri/)() | Retourneert de bronlocatie van het bestand dat het schema heeft geladen. |
| [set_LineNumber](./set_linenumber/)(int32_t) | Stelt het regelnummmer in het bestand in waarnaar het **schema** element verwijst. |
| [set_LinePosition](./set_lineposition/)(int32_t) | Stelt de regelpositie in het bestand in waarnaar het **schema** element verwijst. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Stelt de XmlSerializerNamespaces in die gebruikt worden met dit schema-object. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Stelt de ouder van dit [XmlSchemaObject](./) in. |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Stelt de bronlocatie in voor het bestand dat het schema heeft geladen. |
| [XmlSchemaObject](./xmlschemaobject/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaObject](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
