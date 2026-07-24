---
title: "System::BoxedEnum klasse"
linktitle: "BoxedEnum"
second_title: "Aspose.Page voor C++"
description: "System::BoxedEnum klasse. Vertegenwoordigt een verpakte enumeratiewaarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system/boxedenum/
---
## BoxedEnum class


Vertegenwoordigt een verpakte enumeratiewaarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | Beschrijving |
| --- | --- |
| E | Type van de enumeratiewaarde |
| UT | Het onderliggende type van enumeratie **E** |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Construeert een instantie die de opgegeven enumeratiewaarde vertegenwoordigt. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Converteert de waarde van de verpakte enumeratie‑constante naar een 64‑bit geheel getal. |
| [IsBoxedEnum](./isboxedenum/)() override | Bepaalt of het huidige object een verpakte waarde van een enum‑type vertegenwoordigt. |
| [ToString](./tostring/)() const override | Converteert de door het huidige object vertegenwoordigde verpakte waarde naar een string. |

## Zie ook

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
