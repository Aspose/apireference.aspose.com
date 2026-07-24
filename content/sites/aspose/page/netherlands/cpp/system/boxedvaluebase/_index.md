---
title: "System::BoxedValueBase klasse"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page voor C++"
description: "System::BoxedValueBase klasse. Een basisklasse die een interface definieert en enkele fundamentele methoden implementeert van een afgeleide klasse die een verpakte waarde vertegenwoordigt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Een basisklasse die een interface definieert en enkele fundamentele methoden implementeert van een afgeleide klasse die een verpakte waarde vertegenwoordigt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class BoxedValueBase : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Retourneert de waarde die het type van de verpakte waarde vertegenwoordigt die door het huidige object wordt weergegeven. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Converteert de verpakte waarde die door het huidige object wordt vertegenwoordigd naar een 64‑bit geheel getal. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Bepaalt of het huidige object een verpakte waarde van een enumtype vertegenwoordigt. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Verpakt de waarde van een enumeratie‑constante van de opgegeven enumeratie met de opgegeven naam. Een parameter geeft aan of hoofdlettergevoeligheid moet worden genegeerd bij het interpreteren van de tekenreeks die de naam van de enumeratie‑constante specificeert. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Verpakt de waarde van een enumeratie‑constante van de opgegeven enumeratie met de opgegeven naam. |
| [ToString](./tostring/)(const System::String\&) const | Converteert het verpakte object naar een tekenreeks met behulp van de opgegeven opmaak‑tekenreeks. |
| virtual [ToString](./tostring/)() const | Analoge van de C#-methode [Object.ToString()](../object/tostring/). Maakt het converteren van aangepaste objecten naar een string mogelijk. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
