---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany metodo"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_SelectMany della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2700
url: /it/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Proietta ogni elemento di una sequenza e combina le sequenze risultanti in un'unica sequenza.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parametro | Descrizione |
| --- | --- |
| ResultType | Il tipo del valore restituito dal **selector**. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Una funzione di trasformazione. |

### ReturnValue

Un [IEnumerable](../) che contiene il risultato dell'invocazione di una funzione di proiezione uno-a-molti su ogni elemento della sequenza di input.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
