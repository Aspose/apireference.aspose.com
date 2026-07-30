---
title: "System::Collections::Generic::IEnumerable::LINQ_Min metodo"
linktitle: "LINQ_Min"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_Min della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2100
url: /it/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Vedi anche

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Invoca una funzione di trasformazione su ogni elemento di una sequenza generica e restituisce il valore minimo risultante.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parametro | Descrizione |
| --- | --- |
| ResultType | Il tipo del valore restituito dal selettore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Una funzione di trasformazione da applicare a ciascun elemento. |

### ReturnValue

Il valore minimo nella sequenza.

## Vedi anche

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
