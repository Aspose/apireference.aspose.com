---
title: "System::Xml::Schema::XmlSchemaGroup klasse"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaGroup klasse. Vertegenwoordigt het **group**-element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse definieert groepen op het **schema**-niveau die worden verwezen vanuit de complexe types. Het groepeert een reeks elementdeclaraties zodat ze als groep kunnen worden opgenomen in complexe type-definities in C++."
type: docs
weight: 3100
url: /nl/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Vertegenwoordigt het **group**-element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse definieert groepen op het **schema**-niveau die worden verwezen vanuit de complexe types. Het groepeert een reeks elementdeclaraties zodat ze als groep kunnen worden opgenomen in complexe type-definities.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Name](./get_name/)() | Retourneert de naam van de schemagroep. |
| [get_Particle](./get_particle/)() | Retourneert een van de [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen. |
| [get_QualifiedName](./get_qualifiedname/)() | Retourneert de gekwalificeerde naam van de schemagroep. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van de schemagroep in. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Stelt een van de [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen in. |
| [XmlSchemaGroup](./xmlschemagroup/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaGroup](./) klasse. |
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
