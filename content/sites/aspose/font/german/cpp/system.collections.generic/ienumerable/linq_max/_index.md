---
title: "System::Collections::Generic::IEnumerable::LINQ_Max Methode"
linktitle: "LINQ_Max"
second_title: "Aspose.Font für C++"
description: "Wie man die LINQ_Max‑Methode der Klasse System::Collections::Generic::IEnumerable in C++ verwendet."
type: docs
weight: 2000
url: /de/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Siehe auch

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Ruft für jedes Element einer generischen Sequenz eine Transformationsfunktion auf und gibt den maximalen resultierenden Wert zurück.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Beschreibung |
| --- | --- |
| ResultType | Der Typ des von selector zurückgegebenen Werts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Eine Transformationsfunktion, die auf jedes Element angewendet wird. |

### ReturnValue

Der maximale Wert in der Sequenz.

## Siehe auch

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
