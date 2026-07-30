---
title: "Metodo System::Collections::Generic::IEnumerable::LINQ_Select"
linktitle: "LINQ_Select"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_Select della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2600
url: /it/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Trasforma ogni elemento di una sequenza in una nuova forma incorporando l'indice dell'elemento.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parametro | Descrizione |
| --- | --- |
| ResultType | Il tipo del valore restituito dal **selector**. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Una funzione di trasformazione. |

### ReturnValue

Un [IEnumerable](../) che contiene gli elementi restituiti dalla funzione **selector**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Trasforma gli elementi di una sequenza.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parametro | Descrizione |
| --- | --- |
| ResultType | Il tipo del valore restituito dal **selector**. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Una funzione di trasformazione. |

### ReturnValue

Un [IEnumerable](../) che contiene gli elementi restituiti dalla funzione **selector**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
