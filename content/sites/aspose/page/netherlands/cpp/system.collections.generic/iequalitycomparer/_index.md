---
title: "System::Collections::Generic::IEqualityComparer klasse"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IEqualityComparer klasse. Interface die een manier biedt om twee objecten op gelijkheid te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2400
url: /nl/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Interface die een manier biedt om twee objecten op gelijkheid te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type dat wordt vergeleken. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI-informatie. |
| virtual [GetHashCode](./gethashcode/)(T) const | Haalt de hashcode op voor een object. |

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
