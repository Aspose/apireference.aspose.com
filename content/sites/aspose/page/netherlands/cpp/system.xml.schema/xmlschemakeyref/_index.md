---
title: "System::Xml::Schema::XmlSchemaKeyref klasse"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaKeyref klasse. Deze klasse vertegenwoordigt het keyref‑element van XMLSchema zoals gespecificeerd door het World Wide Web Consortium (W3C) in C++."
type: docs
weight: 4000
url: /nl/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Deze klasse vertegenwoordigt het **keyref** element van XMLSchema zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Refer](./get_refer/)() | Retourneert de naam van de sleutel waar deze beperking naar verwijst in een ander eenvoudig of complex type. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam van de sleutel in waar deze beperking naar verwijst in een ander eenvoudig of complex type. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaKeyref](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
