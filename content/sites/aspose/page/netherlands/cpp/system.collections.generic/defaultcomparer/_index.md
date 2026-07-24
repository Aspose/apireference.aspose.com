---
title: "System::Collections::Generic::DefaultComparer-klasse"
linktitle: "DefaultComparer"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::DefaultComparer-klasse. Standaard vergelijkingsklasse. Gebruikt operator < en operator == om waarden te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Standaard vergelijkingsklasse. Gebruikt operator < en operator == om waarden te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type dat wordt vergeleken. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI-informatie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Geïmplementeerde interface. |
| [ThisType](./thistype/) | Huidig type. |

## Zie ook

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
