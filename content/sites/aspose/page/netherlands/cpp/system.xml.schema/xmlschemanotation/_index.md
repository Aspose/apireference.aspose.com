---
title: "System::Xml::Schema::XmlSchemaNotation class"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaNotation class. Vertegenwoordigt het notation-element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Een XML Schemanotation-declaratie is een reconstructie van XML 1.0 NOTATION-declaraties. Het doel van notaties is het beschrijven van het formaat van niet-XML-gegevens binnen een XML-document in C++."
type: docs
weight: 4800
url: /nl/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Vertegenwoordigt het **notation** element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Een XML [Schema](../)**notation** declaratie is een reconstructie van **XML** 1.0 NOTATION declaraties. Het doel van notaties is het beschrijven van het formaat van niet-XML-gegevens binnen een XML-document.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Name](./get_name/)() | Retourneert de naam van de notatie. |
| [get_Public](./get_public/)() | Retourneert de **public** identifier. |
| [get_System](./get_system/)() | Retourneert de **system** identifier. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van de notatie in. |
| [set_Public](./set_public/)(const String\&) | Stelt de **public** identifier in. |
| [set_System](./set_system/)(const String\&) | Stelt de **system** identifier in. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaNotation](./) klasse. |
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
