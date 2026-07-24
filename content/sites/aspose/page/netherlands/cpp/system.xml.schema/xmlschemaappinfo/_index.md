---
title: "System::Xml::Schema::XmlSchemaAppInfo klasse"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAppInfo klasse. Vertegenwoordigt het World Wide Web Consortium (W3C) appinfo‑element in C++."
type: docs
weight: 1000
url: /nl/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


Vertegenwoordigt het World Wide [Web](../../system.web/) Consortium (W3C) **appinfo**‑element.

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Markup](./get_markup/)() | Retourneert een array van [XmlNode](../../system.xml/xmlnode/) objecten die de **appinfo**‑kindknooppunten vertegenwoordigen. |
| [get_Source](./get_source/)() | Retourneert de bron van de toepassingsinformatie. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Stelt een array van [XmlNode](../../system.xml/xmlnode/) objecten in die de **appinfo**‑kindknooppunten vertegenwoordigen. |
| [set_Source](./set_source/)(const String\&) | Stelt de bron van de toepassingsinformatie in. |
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
