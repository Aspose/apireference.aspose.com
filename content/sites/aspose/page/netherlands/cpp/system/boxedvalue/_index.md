---
title: "System::BoxedValue klasse"
linktitle: "BoxedValue"
second_title: "Aspose.Page voor C++"
description: "System::BoxedValue klasse. Vertegenwoordigt een verpakte waarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 800
url: /nl/cpp/system/boxedvalue/
---
## BoxedValue class


Vertegenwoordigt een verpakte waarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)-pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van de verpakte waarde die door de klasse wordt vertegenwoordigd. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Construeert een object dat de opgegeven verpakte waarde vertegenwoordigt. |
| [Equals](./equals/)(ptr) override | Bepaalt de gelijkheid van de verpakte waarden die door het huidige en het opgegeven object worden vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const override | Retourneert een hashcode voor het huidige object. |
| [GetType](./gettype/)() const override | Haalt het werkelijke type van het object op. |
| [GetTypeCode](./gettypecode/)() const override | Retourneert de waarde die het type van de verpakte waarde vertegenwoordigt die door het huidige object wordt weergegeven. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Retourneert de numerieke waarde van het verpakte object als het kan worden gecast, anders nul. |
| [is](./is/)() const | Bepaalt of het type van de verpakte waarde die door het huidige object wordt weergegeven **V** is. |
| [IsBoxedEnum](./isboxedenum/)() override | Bepaalt of het huidige object een verpakte waarde van een enumtype vertegenwoordigt. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Verpakt de waarde van een enumeratie‑constante van de opgegeven enumeratie met de opgegeven naam. Een parameter geeft aan of hoofdlettergevoeligheid moet worden genegeerd bij het interpreteren van de tekenreeks die de naam van de enumeratie‑constante specificeert. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Verpakt de waarde van een enumeratie‑constante van de opgegeven enumeratie met de opgegeven naam. |
| [ToString](./tostring/)() const override | Converteert de verpakte waarde die door het huidige object wordt weergegeven naar een tekenreeks. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Converteert het verpakte object naar een tekenreeks met behulp van de opgegeven opmaak‑tekenreeks. |
| [unbox](./unbox/)() const | Pakt de waarde uit die wordt weergegeven door het huidige object. |

## Zie ook

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
