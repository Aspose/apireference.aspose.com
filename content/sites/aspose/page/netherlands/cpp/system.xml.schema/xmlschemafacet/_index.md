---
title: "System::Xml::Schema::XmlSchemaFacet klasse"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaFacet klasse. Een basisklasse voor alle facetten die worden gebruikt wanneer eenvoudige typen worden afgeleid door beperking in C++."
type: docs
weight: 2900
url: /nl/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Een basisklasse voor alle facetten die worden gebruikt wanneer eenvoudige types worden afgeleid door beperking.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Retourneert informatie die aangeeft dat dit facet vast is. |
| [get_Value](./get_value/)() | Retourneert het **value** attribuut van het facet. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Stelt informatie in die aangeeft dat dit facet vast is. |
| [set_Value](./set_value/)(const String\&) | Stelt het **value** attribuut van het facet in. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaFacet](./) klasse. |
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
