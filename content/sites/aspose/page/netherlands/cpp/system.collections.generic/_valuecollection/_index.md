---
title: "System::Collections::Generic::_ValueCollection klasse"
linktitle: "_ValueCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::_ValueCollection klasse. Collectie van de waarden van een Dictionary. Verwijst naar de collectie, kopieert niets. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Collectie van de waarden van een [Dictionary](../dictionary/). Verwijst naar de collectie, kopieert niets. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Initialiseert een collectie die verwijst naar de opgegeven dictionary. |
| [Contains](./contains/)(const TValue\&) const override | Controleert of het item aanwezig is in de container. |
| [GetEnumerator](./getenumerator/)() override | Haalt een enumerator op die door de waarden iterereert. |
| [idx_get](./idx_get/)(int) const override | Implementeert de [IList](../ilist/) methode. Niet ondersteund. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [TValue](./tvalue/) | Waarde‑type. |

## Zie ook

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
