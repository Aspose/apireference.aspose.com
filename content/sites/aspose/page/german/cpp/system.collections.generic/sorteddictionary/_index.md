---
title: "System::Collections::Generic::SortedDictionary Klasse"
linktitle: "SortedDictionary"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::SortedDictionary Klasse. Vorwärtsdeklaration des Typs SortedDictionary in C++."
type: docs
weight: 4000
url: /de/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Vorwärtsdeklaration des sortierten Wörterbuchtyps.

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
| [crbegin](./crbegin/)() const | Ruft einen Reverse-Iterator zum letzten const‑qualifizierten Element der Sammlung ab (erstes im Reverse). |
| [crend](./crend/)() const | Ruft einen Reverse-Iterator für ein nicht existierendes const‑qualifiziertes Element vor dem Beginn der Sammlung ab. |
| [get_Comparer](./get_comparer/)() const | Gibt den [IComparer<TKey>](../icomparer/) zurück, der zum Ordnen der Elemente des SortedDictionary<TKey,TValue> verwendet wird. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Singleton‑Zugriffs‑Funktion. |
| [GetEnumerator](./getenumerator/)() override | Gibt den Enumerator zurück, um das aktuelle Wörterbuch zu durchlaufen. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [rend](./rend/)() | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [SortedDictionary](./sorteddictionary/)() | Erstellt ein leeres Wörterbuch. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Erstellt ein leeres Wörterbuch. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopierkonstruktor. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Kopierkonstruktor. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Konstanter Iterator-Typ. |
| [const_reverse_iterator](./const_reverse_iterator/) | Konstanter Reverse-Iterator-Typ. |
| [IEnumerablePtr](./ienumerableptr/) | Sammlung gleicher Elemente. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [iterator](./iterator/) | Iterator-Typ. |
| [KeyCollection](./keycollection/) | Typ der Schlüsselsammlung. |
| [KVPair](./kvpair/) | Typ des Schlüssel‑Wert‑Paares. |
| [map_t](./map_t/) | Zugrunde liegender Datentyp. |
| [Ptr](./ptr/) | Zeigertyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iterator-Typ. |
| [this_t](./this_t/) | Selbsttyp. |
| [ValueCollection](./valuecollection/) | Typ der Wertsammlung. |
## Hinweise


SortedDictionary‑Klasse, die die STL‑map kapselt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
