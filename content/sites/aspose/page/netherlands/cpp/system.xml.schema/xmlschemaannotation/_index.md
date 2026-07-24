---
title: "System::Xml::Schema::XmlSchemaAnnotation klasse"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAnnotation klasse. Vertegenwoordigt het World Wide Web Consortium (W3C) **annotation**-element in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Vertegenwoordigt het World Wide [Web](../../system.web/) Consortium (W3C) **annotation**-element.

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Id](./get_id/)() | Retourneert de tekenreeks‑id. |
| [get_Items](./get_items/)() | Retourneert de **Items**-collectie die wordt gebruikt om de **appinfo**- en **documentation**-kindelementen op te slaan. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Retourneert de gekwalificeerde attributen die niet tot de doel-namespace van het schema behoren. |
| [set_Id](./set_id/)(const String\&) | Stelt de string id in. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Stelt de gekwalificeerde attributen in die niet tot de doel-namespace van het schema behoren. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaAnnotation](./). |
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
