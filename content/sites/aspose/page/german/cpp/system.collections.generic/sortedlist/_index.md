---
title: "Klasse System::Collections::Generic::SortedList"
linktitle: "SortedList"
second_title: "Aspose.Page für C++"
description: "Klasse System::Collections::Generic::SortedList. Sortierte Liste, die die FlatMap-Struktur kapselt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 4200
url: /de/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Sortierte Liste, die die FlatMap-Struktur kapselt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
| [crbegin](./crbegin/)() const | Ruft einen Reverse-Iterator zum letzten const‑qualifizierten Element der Sammlung ab (erstes im Reverse). |
| [crend](./crend/)() const | Ruft einen Reverse-Iterator für ein nicht existierendes const‑qualifiziertes Element vor dem Beginn der Sammlung ab. |
| [get_Capacity](./get_capacity/)() const | Ermittelt die aktuelle Kapazität der Liste. |
| virtual [get_Keys](./get_keys/)() const | Greift auf die Schlüsselsammlung zu. |
| virtual [get_Values](./get_values/)() const | Greift auf die Wertsammlung zu. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, der durch die aktuelle Liste iteriert. |
| [IndexOfKey](./indexofkey/)(TKey) const | Sucht nach einem bestimmten Schlüssel. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Sucht nach einem bestimmten Wert. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [RemoveAt](./removeat/)(int) | Entfernt das Element an der angegebenen Position. |
| [rend](./rend/)() | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [set_Capacity](./set_capacity/)(int) | Setzt die Kapazität der aktuellen Liste. |
| [SortedList](./sortedlist/)() | Erstellt eine leere Liste. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Erstellt eine leere Liste. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopierkonstruktor. |
| [SortedList](./sortedlist/)(const map_t\&) | Kopierkonstruktor. |
| [SortedList](./sortedlist/)(int) | Erstellt eine leere Liste. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Konstanter Iterator-Typ. |
| [const_reverse_iterator](./const_reverse_iterator/) | Konstanter Reverse-Iterator-Typ. |
| [IEnumerablePtr](./ienumerableptr/) | Sammlung desselben Paar-Typs. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [iterator](./iterator/) | Iterator-Typ. |
| [KeyCollection](./keycollection/) | Typ der Schlüsselsammlung. |
| [KVPair](./kvpair/) | Typ für Schlüssel‑Wert‑Paar. |
| [map_t](./map_t/) | Zugrunde liegender Datentyp. |
| [Ptr](./ptr/) | Zeigertyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iterator-Typ. |
| [this_t](./this_t/) | Dieser Typ. |
| [ValueCollection](./valuecollection/) | Typ der Wertsammlung. |

## Siehe auch

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
