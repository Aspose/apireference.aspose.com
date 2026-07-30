---
title: "System::Linq::IOrderedEnumerable-Klasse"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font für C++"
description: "System::Linq::IOrderedEnumerable-Klasse. Stellt eine sortierte Sequenz in C++ dar."
type: docs
weight: 300
url: /de/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Stellt eine sortierte Sequenz dar.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente der Sequenz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Führt eine nachfolgende Sortierung der Elemente einer Sequenz in aufsteigender Reihenfolge gemäß einem Schlüssel durch. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Comparator](./comparator/) | RTTI-Informationen. |

## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
