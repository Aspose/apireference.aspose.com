---
title: "System::Collections::Generic::SortedList klasse"
linktitle: "SortedList"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedList klasse. Gesorteerde lijst die een FlatMap‑structuur omsluit. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 4200
url: /nl/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Gesorteerde lijst die een FlatMap‑structuur omsluit. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TValue | Waarde‑type. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [crbegin](./crbegin/)() const | Haalt een reverse‑iterator op naar het laatste const‑gekwalificeerde element van de collectie (eerste in reverse). |
| [crend](./crend/)() const | Haalt een reverse‑iterator op voor een niet‑bestaand const‑gekwalificeerd element vóór het begin van de collectie. |
| [get_Capacity](./get_capacity/)() const | Haalt de huidige capaciteit van de lijst op. |
| virtual [get_Keys](./get_keys/)() const | Benadert de sleutelcollectie. |
| virtual [get_Values](./get_values/)() const | Benadert de waardecollectie. |
| [GetEnumerator](./getenumerator/)() override | Haalt de enumerator op die door de huidige lijst iterereert. |
| [IndexOfKey](./indexofkey/)(TKey) const | Zoekt naar een specifieke sleutel. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Zoekt naar een specifieke waarde. |
| [rbegin](./rbegin/)() | Haalt een reverse iterator op naar het laatste element van de collectie (eerste in omgekeerde volgorde). |
| [rbegin](./rbegin/)() const | Haalt een reverse iterator op naar het laatste element van de const‑gekwalificeerde collectie (eerste in omgekeerde volgorde). |
| [RemoveAt](./removeat/)(int) | Verwijdert item op de opgegeven positie. |
| [rend](./rend/)() | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de collectie. |
| [rend](./rend/)() const | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de const‑gekwalificeerde collectie. |
| [set_Capacity](./set_capacity/)(int) | Stelt de capaciteit van de huidige lijst in. |
| [SortedList](./sortedlist/)() | Construeert een lege lijst. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Construeert een lege lijst. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Copy-constructor. |
| [SortedList](./sortedlist/)(const map_t\&) | Copy-constructor. |
| [SortedList](./sortedlist/)(int) | Construeert een lege lijst. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse-iterator type. |
| [IEnumerablePtr](./ienumerableptr/) | Collectie van hetzelfde paartype. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Iterator type. |
| [KeyCollection](./keycollection/) | Sleutelverzamelingstype. |
| [KVPair](./kvpair/) | Type sleutel‑waarde‑paar. |
| [map_t](./map_t/) | Onderliggend datatype. |
| [Ptr](./ptr/) | Pointertype. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
| [this_t](./this_t/) | Dit type. |
| [ValueCollection](./valuecollection/) | Waardeverzamelingstype. |

## Zie ook

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
