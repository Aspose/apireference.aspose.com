---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaChoice class. Vertegenwoordigt het choice-element (compositor) uit de XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). De choice staat slechts één van zijn kinderen toe om in een instantie te verschijnen in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Vertegenwoordigt het **choice**-element (compositor) van de XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). De **choice** staat slechts één van zijn kinderen toe om in een instantie te verschijnen.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Items](./get_items/)() override | Geeft de verzameling van de elementen terug die zijn opgenomen in de compositor (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), of [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Initialiseert een nieuwe instantie van de klasse [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
