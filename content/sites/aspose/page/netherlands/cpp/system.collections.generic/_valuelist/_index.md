---
title: "System::Collections::Generic::_ValueList klasse"
linktitle: "_ValueList"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::_ValueList klasse. Implementeert een lijst van de waarden van een dictionary. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implementeert een lijst van de waarden van een dictionary. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Beschrijving |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Initialiseert een collectie die verwijst naar de opgegeven dictionary. |
| virtual [idx_get](./idx_get/)(int) const | Haalt de waarde op op de opgegeven positie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [TValue](./tvalue/) | Waarde‑type. |

## Zie ook

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
