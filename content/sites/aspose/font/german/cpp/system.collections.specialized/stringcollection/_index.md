---
title: "System::Collections::Specialized::StringCollection Klasse"
linktitle: "StringCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::Specialized::StringCollection Klasse. Indizierte Liste von Zeichenketten. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Indizierte Liste von Zeichenketten. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::String\&) | Fügt einen Wert am Ende der Liste hinzu. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Fügt Elemente in den Container ein. |
| [begin](./begin/)() | Gibt einen Iterator auf das erste Element des Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [end()](./end/). |
| [begin](./begin/)() const | Gibt einen Iterator auf das erste Element des const‑qualifizierten Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [end()](./end/). |
| [cbegin](./cbegin/)() const | Gibt einen Iterator auf das erste const‑qualifizierte Element des Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [cend()](./cend/). |
| [cend](./cend/)() const | Gibt einen Iterator auf das Element zurück, das dem letzten Element des Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [Clear](./clear/)() | Löscht alle Elemente. |
| [Contains](./contains/)(const System::String\&) const | Überprüft, ob eine bestimmte Zeichenkette im Container vorhanden ist. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Kopiert Elemente in vorhandene Array‑Elemente. |
| [crbegin](./crbegin/)() const | Gibt einen Reverse‑Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Ist der Container leer, ist der zurückgegebene Iterator gleich [crend()](./crend/). |
| [crend](./crend/)() const | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [data](./data/)() | Interner Zugriff auf die Datenstruktur. |
| [data](./data/)() const | Interner Zugriff auf die Datenstruktur. |
| [end](./end/)() | Gibt einen Iterator auf das Element zurück, das dem letzten Element des Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [end](./end/)() const | Gibt einen Iterator auf das Element zurück, das dem letzten Element des const‑qualifizierten Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [get_Count](./get_count/)() const | Ermittelt die Anzahl der Elemente in der Sammlung. |
| [GetEnumerator](./getenumerator/)() override | Ermittelt den Enumerator, der durch die aktuelle Sammlung iteriert. |
| [idx_get](./idx_get/)(int) const | Erhält den Wert an der angegebenen Position. |
| [idx_set](./idx_set/)(int, const System::String\&) | Setzt den Wert an der angegebenen Position. |
| [IndexOf](./indexof/)(const System::String\&) const | Sucht nach einer bestimmten Zeichenkette im Container. |
| [Insert](./insert/)(int, const System::String\&) | Fügt einen bestimmten Wert in den Container ein. |
| [operator[]](./operator[]/)(int) | Accessor‑Funktion. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Entfernt das erste Vorkommen der angegebenen Zeichenkette. |
| [RemoveAt](./removeat/)(int) | Entfernt das Element an der angegebenen Position. |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [StringCollection](./stringcollection/)() | Erstellt eine leere Zeichenkettensammlung. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [const_reverse_iterator](./const_reverse_iterator/) | Typ des konstanten Reverse-Iterators. |
| [iterator](./iterator/) | Iteratortyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
