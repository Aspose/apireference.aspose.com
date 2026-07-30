---
title: "System::Linq::IOrderedEnumerable classe"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font pour C++"
description: "System::Linq::IOrderedEnumerable classe. Représente une séquence triée en C++."
type: docs
weight: 300
url: /fr/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Représente une séquence triée.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de la séquence. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Effectue un tri supplémentaire des éléments d'une séquence par ordre croissant selon une clé. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Comparator](./comparator/) | Informations RTTI. |

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
