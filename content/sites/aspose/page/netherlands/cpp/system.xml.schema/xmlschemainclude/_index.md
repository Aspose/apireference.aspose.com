---
title: "System::Xml::Schema::XmlSchemaInclude klasse"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaInclude klasse. Vertegenwoordigt het include-element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse wordt gebruikt om declaraties en definities van een extern schema op te nemen. De opgenomen declaraties en definities zijn vervolgens beschikbaar voor verwerking in het omvattende schema in C++."
type: docs
weight: 3600
url: /nl/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


Stelt het **include**-element uit XML [Schema](../) voor zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse wordt gebruikt om declaraties en definities uit een extern schema op te nemen. De opgenomen declaraties en definities zijn vervolgens beschikbaar voor verwerking in het omvattende schema.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Retourneert de **annotation**‑waarde. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Stelt de **annotation**‑waarde in. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaInclude](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
