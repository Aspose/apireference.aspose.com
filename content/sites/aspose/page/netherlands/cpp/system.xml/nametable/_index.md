---
title: "System::Xml::NameTable klasse"
linktitle: "NameTable"
second_title: "Aspose.Page voor C++"
description: "System::Xml::NameTable klasse. Implementeert een single‑threaded XmlNameTable in C++."
type: docs
weight: 500
url: /nl/cpp/system.xml/nametable/
---
## NameTable class


Implementeert een single‑threaded [XmlNameTable](../xmlnametable/).

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const String\&) override | Atomiseert de opgegeven string en voegt deze toe aan de [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Atomiseert de opgegeven string en voegt deze toe aan de [NameTable](./). |
| [Get](./get/)(const String\&) override | Retourneert de geatomiseerde string met de opgegeven waarde. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Retourneert de geatomiseerde string die dezelfde tekens bevat als het opgegeven bereik van tekens in de gegeven array. |
| [NameTable](./nametable/)() | Initialiseert een nieuw exemplaar van de [NameTable](./)-klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
