---
title: "System::Collections::ObjectModel::Collection Klasse"
linktitle: "Sammlung"
second_title: "Aspose.Page für C++"
description: "System::Collections::ObjectModel::Collection Klasse. Basistyp für generische Sammlungen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.collections.objectmodel/collection/
---
## Collection class


Basistyp für generische Sammlungen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const T\&) override | Fügt dem Container einen Wert hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Collection](./collection/)() | Erstellt eine leere Sammlung. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Prüft, ob das Element in der Sammlung vorhanden ist. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopiert Sammlungs‑Elemente in vorhandene Array‑Elemente. |
| [crbegin](./crbegin/)() const | Ruft einen Reverse-Iterator zum letzten const‑qualifizierten Element der Sammlung ab (erstes im Reverse). |
| [crend](./crend/)() const | Ruft einen Reverse-Iterator für ein nicht existierendes const‑qualifiziertes Element vor dem Beginn der Sammlung ab. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente. |
| [get_Items](./get_items/)() | Interner Zugriff auf die Datenstruktur. |
| [get_Items](./get_items/)() const | Interner Zugriff auf die Datenstruktur. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, um durch die Sammlung zu iterieren. |
| [idx_get](./idx_get/)(int) const override | Gibt den Wert am angegebenen Index zurück. |
| [idx_set](./idx_set/)(int, T) override | Setzt den Wert an einem angegebenen Index. |
| [IndexOf](./indexof/)(const T\&) const override | Sucht nach einem Element in der Sammlung. |
| [Insert](./insert/)(int, const T\&) override | Fügt ein Element an der angegebenen Position ein. |
| [operator[]](./operator[]/)(int) | Gibt den Wert am angegebenen Index zurück. |
| [operator[]](./operator[]/)(int) const | Gibt den Wert am angegebenen Index zurück. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [Remove](./remove/)(const T\&) override | Entfernt ein bestimmtes Element. |
| [RemoveAt](./removeat/)(int) override | Entfernt ein Element an einer bestimmten Position. |
| [rend](./rend/)() | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Macht gespeicherte Zeiger schwach (falls zutreffend). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Siehe auch

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
