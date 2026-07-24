---
title: "System::Collections::Generic::IList class"
linktitle: "IList"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IList‑klasse. Interface van een geïndexeerde container van elementen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2600
url: /nl/cpp/system.collections.generic/ilist/
---
## IList class


Interface van een geïndexeerde container van elementen. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Controleert of de collectie een vaste grootte heeft. |
| virtual [idx_get](./idx_get/)(int) const | Haalt element op op de opgegeven index. |
| virtual [idx_set](./idx_set/)(int, T) | Stelt element in op de opgegeven index. |
| virtual [IndexOf](./indexof/)(const T\&) const | Haalt de index op van de eerste verschijning van het item in de container. |
| virtual [Insert](./insert/)(int, const T\&) | Voegt een element in op de opgegeven positie, waarbij andere elementen worden verschoven. |
| virtual [RemoveAt](./removeat/)(int) | Verwijdert element op de opgegeven index. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | RTTI-informatie. |
| [ThisType](./thistype/) | Dit type. |
| [ValueType](./valuetype/) | Waarde‑type. |

## Zie ook

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
