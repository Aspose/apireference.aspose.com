---
title: "System::Xml::XmlQualifiedName klasse"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlQualifiedName klasse. Vertegenwoordigt een XML-gekwalificeerde naam in C++."
type: docs
weight: 3200
url: /nl/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Stelt een XML-gekwalificeerde naam voor.

```cpp
class XmlQualifiedName : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bepaalt of het opgegeven [XmlQualifiedName](./)-object gelijk is aan het huidige [XmlQualifiedName](./)-object. |
| [get_IsEmpty](./get_isempty/)() const | Retourneert een waarde die aangeeft of de [XmlQualifiedName](./) leeg is. |
| [get_Name](./get_name/)() const | Retourneert een tekenreeksrepresentatie van de gekwalificeerde naam van de [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | Retourneert een tekenreeksrepresentatie van de namespace van de [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Retourneert de hashcode voor de [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Retourneert de tekenreekswaarde van de [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Retourneert de tekenreekswaarde van de [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | Initialiseert een nieuw exemplaar van de [XmlQualifiedName](./) klasse. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Initialiseert een nieuw exemplaar van de [XmlQualifiedName](./) klasse met de opgegeven naam. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Initialiseert een nieuw exemplaar van de [XmlQualifiedName](./) klasse met de opgegeven naam en namespace. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Biedt een lege [XmlQualifiedName](./). |
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
