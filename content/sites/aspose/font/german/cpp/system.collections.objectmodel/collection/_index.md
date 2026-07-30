---
title: "System::Collections::ObjectModel::Collection class"
linktitle: "Sammlung"
second_title: "Aspose.Font für C++"
description: "System::Collections::ObjectModel::Collection Klasse. Basistyp für generische Sammlungen. Objekte dieser Klasse sollten nur mit der System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.collections.objectmodel/collection/
---
## Collection class


Basistyp für generische Sammlungen. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopiert Sammlungs-Elemente in bestehende Array-Elemente. |
| [crbegin](./crbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte const‑qualifizierte Element der Sammlung zurück (erstes im Reverse). |
| [crend](./crend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes const‑qualifiziertes Element vor dem Beginn der Sammlung zurück. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Elemente zurück. |
| [get_Items](./get_items/)() | Interner Zugriff auf die Datenstruktur. |
| [get_Items](./get_items/)() const | Interner Zugriff auf die Datenstruktur. |
| [GetEnumerator](./getenumerator/)() override | Liefert einen Enumerator, um durch die Sammlung zu iterieren. |
| [idx_get](./idx_get/)(int) const override | Liefert den Wert am angegebenen Index. |
| [idx_set](./idx_set/)(int, T) override | Setzt den Wert an dem angegebenen Index. |
| [IndexOf](./indexof/)(const T\&) const override | Sucht nach einem Element in der Sammlung. |
| [Insert](./insert/)(int, const T\&) override | Fügt ein Element an der angegebenen Position ein. |
| [operator[]](./operator[]/)(int) | Liefert den Wert am angegebenen Index. |
| [operator[]](./operator[]/)(int) const | Liefert den Wert am angegebenen Index. |
| [rbegin](./rbegin/)() | Gibt einen Reverse‑Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [Remove](./remove/)(const T\&) override | Entfernt ein bestimmtes Element. |
| [RemoveAt](./removeat/)(int) override | Entfernt ein Element an einer bestimmten Position. |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Macht gespeicherte Zeiger schwach (falls zutreffend). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Siehe auch

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
