---
title: "classe System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font per C++"
description: "classe System::Linq::IOrderedEnumerable. Rappresenta una sequenza ordinata in C++."
type: docs
weight: 300
url: /it/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Rappresenta una sequenza ordinata.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi della sequenza. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Esegue un ordinamento successivo degli elementi in una sequenza in ordine crescente secondo una chiave. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Comparator](./comparator/) | Informazioni RTTI. |

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
