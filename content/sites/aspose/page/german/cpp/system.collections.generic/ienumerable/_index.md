---
title: "System::Collections::Generic::IEnumerable Klasse"
linktitle: "IEnumerable"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::IEnumerable Klasse. Schnittstelle eines Objekts, das in C++ einen Enumerator für die enthaltenen Elemente bereitstellt."
type: docs
weight: 2200
url: /de/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Schnittstelle eines Objekts, das einen Enumerator für die enthaltenen Elemente bereitstellt.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [begin](./begin/)() | Gibt einen Iterator zurück, der auf das erste Element (falls vorhanden) der Sammlung zeigt. Dieser Iterator kann nicht verwendet werden, um ein referenziertes Objekt zu ändern, weil [GetEnumerator()](./getenumerator/) ein Kopie-Objekt von T zurückgibt. |
| [begin](./begin/)() const | Gibt den Iterator zurück, der auf das erste Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| [cbegin](./cbegin/)() const | Gibt den Iterator zurück, der auf das erste const‑qualifizierte Element (falls vorhanden) der Sammlung zeigt. |
| [cend](./cend/)() const | Gibt den Iterator zurück, der direkt nach dem letzten const‑qualifizierten Element (falls vorhanden) der Sammlung zeigt. |
| [end](./end/)() | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der Sammlung zeigt. Dieser Iterator kann nicht verwendet werden, um ein referenziertes Objekt zu ändern, weil [GetEnumerator()](./getenumerator/) ein Kopie-Objekt von T zurückgibt. |
| [end](./end/)() const | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| virtual [GetEnumerator](./getenumerator/)() | Ruft den Enumerator ab. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Wendet eine Akkumulatorfunktion auf eine Sequenz an. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Bestimmt, ob alle Elemente einer Sequenz eine Bedingung erfüllen. |
| [LINQ_Any](./linq_any/)() | Bestimmt, ob eine Sequenz irgendwelche Elemente enthält. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Bestimmt, ob ein Element einer Sequenz existiert oder eine Bedingung erfüllt. |
| [LINQ_Cast](./linq_cast/)() | Wandelt die Elemente in den angegebenen Typ um. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Verkettet zwei Sequenzen. |
| [LINQ_Contains](./linq_contains/)(T) | Bestimmt, ob eine Sequenz einen angegebenen Wert enthält. |
| [LINQ_Count](./linq_count/)() | Gibt die Anzahl der Elemente in der Sequenz zurück (berechnet durch direkte Zählung). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Gibt die Anzahl der Elemente in der Sequenz zurück, die die angegebene Bedingung erfüllen. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Gibt das Element an einem angegebenen Index in einer Sequenz zurück. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Gibt das Element an einem angegebenen Index in einer Sequenz zurück. |
| [LINQ_First](./linq_first/)() | Gibt das erste Element einer Sequenz zurück. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Gibt das erste Element einer Sequenz zurück, das die angegebene Bedingung erfüllt. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Gibt das erste Element einer Sequenz zurück oder einen Standardwert, wenn die Sequenz leer ist. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Gibt das erste Element der Sequenz zurück, das eine Bedingung erfüllt, oder einen Standardwert, wenn kein solches Element gefunden wird. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Gruppiert die Elemente einer Sequenz. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | Gibt das letzte Element einer Sequenz zurück. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Gibt das letzte Element einer Sequenz zurück, oder einen Standardwert, wenn die Sequenz leer ist. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Ruft für jedes Element einer generischen Sequenz eine Transformationsfunktion auf und gibt den maximalen resultierenden Wert zurück. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Ruft für jedes Element einer generischen Sequenz eine Transformationsfunktion auf und gibt den minimalen resultierenden Wert zurück. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Filtert die Elemente der Sequenz basierend auf dem angegebenen Typ. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Sortiert die Elemente einer Sequenz in aufsteigender Reihenfolge gemäß den vom keySelector ausgewählten Schlüsselwerten. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Sortiert die Elemente einer Sequenz in absteigender Reihenfolge gemäß den vom keySelector ausgewählten Schlüsselwerten. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Kehrt die Reihenfolge der Elemente in einer Sequenz um. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Transformiert Elemente einer Sequenz. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Transformiert jedes Element einer Sequenz in eine neue Form, indem der Index des Elements einbezogen wird. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Projiziert jedes Element einer Sequenz und kombiniert die resultierenden Sequenzen zu einer einzigen Sequenz. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Gibt eine angegebene Anzahl zusammenhängender Elemente vom Anfang einer Sequenz zurück. |
| [LINQ_ToArray](./linq_toarray/)() | Erstellt ein Array aus einer Sequenz. |
| [LINQ_ToList](./linq_tolist/)() | Erstellt ein [List<T>](../list/) aus einer Sequenz. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Filtert eine Sequenz basierend auf dem angegebenen Prädikat. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Konstanter Iterator-Typ. |
| [IEnumeratorType](./ienumeratortype/) | RTTI-Informationen. |
| [iterator](./iterator/) | Iterator-Typ. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Basistyp des inneren Iterators. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Elementtyp des inneren Iterators. |

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
