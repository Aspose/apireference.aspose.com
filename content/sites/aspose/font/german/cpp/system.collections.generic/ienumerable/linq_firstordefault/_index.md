---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault Methode"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault Methode. Gibt das erste Element einer Sequenz zurück, oder einen Standardwert, wenn die Sequenz in C++ leer ist."
type: docs
weight: 1600
url: /de/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Gibt das erste Element einer Sequenz zurück oder einen Standardwert, wenn die Sequenz leer ist.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Erstes Element in der Sequenz oder ein standardkonstruiertes Ergebnis, wenn die Sequenz leer ist.

## Siehe auch

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Gibt das erste Element der Sequenz zurück, das eine Bedingung erfüllt, oder einen Standardwert, wenn kein solches Element gefunden wird.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Prädikat | std::function\<bool(T)> | Eine Funktion, um jedes Element auf eine Bedingung zu prüfen. |

### ReturnValue

default(T) wenn die Quelle leer ist oder kein Element den durch das Prädikat angegebenen Test besteht; andernfalls das erste Element in der Quelle, das den durch das Prädikat angegebenen Test besteht.

## Siehe auch

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
