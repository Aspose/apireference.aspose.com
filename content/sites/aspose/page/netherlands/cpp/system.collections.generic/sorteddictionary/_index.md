---
title: "System::Collections::Generic::SortedDictionary klasse"
linktitle: "SortedDictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedDictionary klasse. Voorwaartse declaratie van het gesorteerde woordenboektype in C++."
type: docs
weight: 4000
url: /nl/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Sorted dictionary type forward declaratie.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Haalt de [IComparer<TKey>](../icomparer/) op die wordt gebruikt om de elementen van de SortedDictionary<TKey,TValue> te ordenen. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Singleton accessor‑functie. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door het huidige woordenboek te itereren. |
| [rbegin](./rbegin/)() | Haalt een reverse iterator op naar het laatste element van de collectie (eerste in omgekeerde volgorde). |
| [rbegin](./rbegin/)() const | Haalt een reverse iterator op naar het laatste element van de const‑gekwalificeerde collectie (eerste in omgekeerde volgorde). |
| [rend](./rend/)() | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de collectie. |
| [rend](./rend/)() const | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de const‑gekwalificeerde collectie. |
| [SortedDictionary](./sorteddictionary/)() | Construeert een leeg woordenboek. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Construeert een leeg woordenboek. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Copy-constructor. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Copy-constructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse-iterator type. |
| [IEnumerablePtr](./ienumerableptr/) | Collectie van dezelfde elementen. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Iterator type. |
| [KeyCollection](./keycollection/) | Sleutelverzamelingstype. |
| [KVPair](./kvpair/) | Sleutel‑waarde‑paartype. |
| [map_t](./map_t/) | Onderliggend datatype. |
| [Ptr](./ptr/) | Pointertype. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
| [this_t](./this_t/) | Zelftype. |
| [ValueCollection](./valuecollection/) | Waardeverzamelingstype. |
## Opmerkingen


Gesorteerde dictionary‑klasse die STL‑map omsluit. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
