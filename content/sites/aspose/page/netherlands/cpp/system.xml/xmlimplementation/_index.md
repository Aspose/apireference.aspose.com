---
title: "System::Xml::XmlImplementation‑klasse"
linktitle: "XmlImplementation"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlImplementation‑klasse. Definieert de context voor een reeks XmlDocument‑objecten in C++."
type: docs
weight: 2000
url: /nl/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Definieert de context voor een reeks [XmlDocument](../xmldocument/)-objecten.

```cpp
class XmlImplementation : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Maakt een nieuw [XmlDocument](../xmldocument/) aan. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Test of de Document [Object](../../system/object/) Model (DOM)-implementatie een specifieke functie ondersteunt. |
| [XmlImplementation](./xmlimplementation/)() | Initialiseert een nieuw exemplaar van de [XmlImplementation](./)-klasse. |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuw exemplaar van de [XmlImplementation](./)-klasse met de opgegeven [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
