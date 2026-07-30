---
title: "System::Collections::Generic::IEnumerable::LINQ_Max metodo"
linktitle: "LINQ_Max"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_Max della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2000
url: /it/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Vedi anche

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Invoca una funzione di trasformazione su ogni elemento di una sequenza generica e restituisce il valore massimo risultante.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parametro | Descrizione |
| --- | --- |
| ResultType | Il tipo del valore restituito dal selettore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Una funzione di trasformazione da applicare a ciascun elemento. |

### ReturnValue

Il valore massimo nella sequenza.

## Vedi anche

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
