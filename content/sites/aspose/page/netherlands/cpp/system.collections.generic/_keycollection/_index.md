---
title: "System::Collections::Generic::_KeyCollection klasse"
linktitle: "_KeyCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::_KeyCollection klasse. Collectie van de sleutels van Dictionary. Verwijst naar de collectie, kopieert niets. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Collectie van de sleutels van [Dictionary](../dictionary/). Verwijst naar de collectie, kopieert niets. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Initialiseert een collectie die verwijst naar de opgegeven dictionary. |
| [Contains](./contains/)(const TKey\&) const override | Controleert of het item aanwezig is in de container. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op die door de sleutels iterereert. |
| [idx_get](./idx_get/)(int) const override | Implementeert de [IList](../ilist/) methode. Niet ondersteund. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [TKey](./tkey/) | Sleuteltype. |

## Zie ook

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
