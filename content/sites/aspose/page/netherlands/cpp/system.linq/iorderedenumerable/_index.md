---
title: "System::Linq::IOrderedEnumerable class"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Page voor C++"
description: "System::Linq::IOrderedEnumerable class. Vertegenwoordigt een gesorteerde reeks in C++."
type: docs
weight: 300
url: /nl/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Stelt een gesorteerde reeks voor.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de elementen van de reeks. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Voert een vervolgordering uit van de elementen in een reeks in oplopende volgorde op basis van een sleutel. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Comparator](./comparator/) | RTTI-informatie. |

## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)
