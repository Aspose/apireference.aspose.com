---
title: "System::Xml::Schema::XmlSchemaParticle klasse"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaParticle klasse. Een basisklasse hiervoor is de basisklasse voor alle deeltje types (bijv. XmlSchemaAny) in C++."
type: docs
weight: 5400
url: /nl/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Een basisklasse hiervoor is de basisklasse voor alle deeltje‑types (bijv. [XmlSchemaAny](../xmlschemaany/)).

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Retourneert het maximale aantal keren dat het deeltje kan voorkomen. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Retourneert het getal als een tekenreekswaarde. Maximaal aantal keren dat het deeltje kan voorkomen. |
| [get_MinOccurs](./get_minoccurs/)() | Retourneert het minimale aantal keren dat het deeltje kan voorkomen. |
| [get_MinOccursString](./get_minoccursstring/)() | Retourneert het getal als een tekenreekswaarde. Het minimale aantal keren dat het deeltje kan voorkomen. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Stelt het maximale aantal keren in dat het deeltje kan voorkomen. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Stelt het getal in als een tekenreekswaarde. Maximaal aantal keren dat het deeltje kan voorkomen. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Stelt het minimale aantal keren in dat het deeltje kan voorkomen. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Stelt het getal in als een tekenreekswaarde. Het minimale aantal keren dat het deeltje kan voorkomen. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaParticle](./) klasse. |
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
