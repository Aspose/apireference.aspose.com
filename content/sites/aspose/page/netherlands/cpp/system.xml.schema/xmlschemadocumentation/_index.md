---
title: "System::Xml::Schema::XmlSchemaDocumentation klasse"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaDocumentation klasse. Vertegenwoordigt het documentatie‑element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse specificeert informatie die door mensen gelezen of gebruikt kan worden binnen een annotatie in C++."
type: docs
weight: 2500
url: /nl/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Vertegenwoordigt het **documentation**‑element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse specificeert informatie die door mensen gelezen of gebruikt kan worden binnen een **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Language](./get_language/)() | Retourneert het **xml:lang**‑attribuut. Dit dient als een indicator van de taal die in de inhoud wordt gebruikt. |
| [get_Markup](./get_markup/)() | Retourneert een array van [XmlNode](../../system.xml/xmlnode/) objecten die de documentatie‑kindknooppunten vertegenwoordigen. |
| [get_Source](./get_source/)() | Retourneert de Uniform Resource Identifier (URI)‑bron van de informatie. |
| [set_Language](./set_language/)(const String\&) | Stelt het **xml:lang**‑attribuut in. Dit dient als een indicator van de taal die in de inhoud wordt gebruikt. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Stelt een array van [XmlNode](../../system.xml/xmlnode/) objecten in die de documentatie‑kindknooppunten vertegenwoordigen. |
| [set_Source](./set_source/)(const String\&) | Stelt de Uniform Resource Identifier (URI)‑bron van de informatie in. |
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
