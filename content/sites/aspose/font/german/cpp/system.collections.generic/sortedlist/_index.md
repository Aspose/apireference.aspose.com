---
title: "System::Collections::Generic::SortedList Klasse"
linktitle: "SortedList"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::SortedList Klasse. Sortierte Liste, die die FlatMap-Struktur kapselt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 4200
url: /de/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Sortierte Liste, die die FlatMap-Struktur kapselt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Parameter | Beschreibung |
| --- | --- |
| TKey | Schlüsseltyp. |
| TValue | Werttyp. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [crbegin](./crbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte const‑qualifizierte Element der Sammlung zurück (erstes im Reverse). |
| [crend](./crend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes const‑qualifiziertes Element vor dem Beginn der Sammlung zurück. |
| [get_Capacity](./get_capacity/)() const | Ermittelt die aktuelle Listenkapazität. |
| virtual [get_Keys](./get_keys/)() const | Greift auf die Schlüsselsammlung zu. |
| virtual [get_Values](./get_values/)() const | Greift auf die Wertsammlung zu. |
| [GetEnumerator](./getenumerator/)() override | Ruft den Enumerator ab, der durch die aktuelle Liste iteriert. |
| [IndexOfKey](./indexofkey/)(TKey) const | Sucht nach einem bestimmten Schlüssel. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Sucht nach einem bestimmten Wert. |
| [rbegin](./rbegin/)() | Gibt einen Reverse‑Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [RemoveAt](./removeat/)(int) | Entfernt das Element an der angegebenen Position. |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [set_Capacity](./set_capacity/)(int) | Setzt die Kapazität der aktuellen Liste. |
| [SortedList](./sortedlist/)() | Erstellt eine leere Liste. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Erstellt eine leere Liste. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopierkonstruktor. |
| [SortedList](./sortedlist/)(const map_t\&) | Kopierkonstruktor. |
| [SortedList](./sortedlist/)(int) | Erstellt eine leere Liste. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [const_reverse_iterator](./const_reverse_iterator/) | Typ des konstanten Reverse-Iterators. |
| [IEnumerablePtr](./ienumerableptr/) | Sammlung desselben Paartyps. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [iterator](./iterator/) | Iteratortyp. |
| [KeyCollection](./keycollection/) | Schlüssel‑Sammlungstyp. |
| [KVPair](./kvpair/) | Typ für Schlüssel‑Wert‑Paar. |
| [map_t](./map_t/) | Zugrundeliegender Datentyp. |
| [Ptr](./ptr/) | Zeigertyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
| [this_t](./this_t/) | Dieser Typ. |
| [ValueCollection](./valuecollection/) | Typ für Wertsammlung. |

## Siehe auch

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
