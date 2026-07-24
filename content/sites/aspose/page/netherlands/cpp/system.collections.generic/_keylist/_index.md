---
title: "System::Collections::Generic::_KeyList klasse"
linktitle: "_KeyList"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::_KeyList klasse. Implementeert een lijst van sleutels van een dictionary. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 200
url: /nl/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Implementeert een lijst van sleutels van een dictionary. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parameter | Beschrijving |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Initialiseert een collectie die verwijst naar de opgegeven dictionary. |
| [Contains](./contains/)(const TKey\&) const override | Controleert of de opgegeven sleutel aanwezig is in de collectie. |
| [idx_get](./idx_get/)(int) const override | Haalt de sleutel op op de opgegeven positie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [TKey](./tkey/) | Sleuteltype. |

## Zie ook

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
