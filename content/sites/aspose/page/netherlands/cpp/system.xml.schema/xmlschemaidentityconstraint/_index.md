---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint klasse"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint klasse. Klasse voor de identiteitbeperkingen: key, keyref en unique elementen in C++."
type: docs
weight: 3400
url: /nl/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Klasse voor de identiteitsbeperkingen: **key**, **keyref**, en **unique** elementen.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Fields](./get_fields/)() | Retourneert de verzameling velden die als kinderen gelden voor de XML Path Language ([XPath](../../system.xml.xpath/)) expressieselector. |
| [get_Name](./get_name/)() | Retourneert de naam van de identiteitbeperking. |
| [get_QualifiedName](./get_qualifiedname/)() | Retourneert de gekwalificeerde naam van de identiteitbeperking, die de post-compilatie‑interpretatie van de **QualifiedName**‑waarde bevat. |
| [get_Selector](./get_selector/)() | Retourneert het [XPath](../../system.xml.xpath/) expressie‑element **selector**. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van de identiteitbeperking in. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Stelt het [XPath](../../system.xml.xpath/) expressie‑element **selector** in. |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaIdentityConstraint](./). |
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
