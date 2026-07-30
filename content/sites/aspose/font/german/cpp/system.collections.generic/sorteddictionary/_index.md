---
title: "System::Collections::Generic::SortedDictionary Klasse"
linktitle: "SortedDictionary"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::SortedDictionary Klasse. Vorwärtsdeklaration des Typs SortedDictionary in C++."
type: docs
weight: 4000
url: /de/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Vorwärtsdeklaration des Typs sortiertes Wörterbuch.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Holt den [IComparer<TKey>](../icomparer/), der verwendet wird, um die Elemente des SortedDictionary<TKey,TValue> zu sortieren. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Singleton‑Zugriffsfunktion. |
| [GetEnumerator](./getenumerator/)() override | Holt den Enumerator, um das aktuelle Wörterbuch zu durchlaufen. |
| [rbegin](./rbegin/)() | Gibt einen Reverse‑Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [SortedDictionary](./sorteddictionary/)() | Konstruiert ein leeres Wörterbuch. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Konstruiert ein leeres Wörterbuch. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopierkonstruktor. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Kopierkonstruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [const_reverse_iterator](./const_reverse_iterator/) | Typ des konstanten Reverse-Iterators. |
| [IEnumerablePtr](./ienumerableptr/) | Sammlung gleicher Elemente. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [iterator](./iterator/) | Iteratortyp. |
| [KeyCollection](./keycollection/) | Schlüssel‑Sammlungstyp. |
| [KVPair](./kvpair/) | Typ für Schlüssel‑Wert‑Paar. |
| [map_t](./map_t/) | Zugrundeliegender Datentyp. |
| [Ptr](./ptr/) | Zeigertyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
| [this_t](./this_t/) | Selbsttyp. |
| [ValueCollection](./valuecollection/) | Typ für Wertsammlung. |
## Hinweise


Sortierte Wörterbuch‑Klasse, die STL‑map kapselt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
