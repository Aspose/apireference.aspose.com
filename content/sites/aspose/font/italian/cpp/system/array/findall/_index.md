---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Font per C++"
description: "System::Array::FindAll method. Recupera tutti gli elementi che soddisfano le condizioni definite dal predicato specificato in C++."
type: docs
weight: 5200
url: /it/cpp/system/array/findall/
---
## Array::FindAll method


Recupera tutti gli elementi che corrispondono alle condizioni definite dal predicato specificato.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) per cercare elementi in |
| corrispondenza | System::Predicate\<T\> | Un predicato che definisce le condizioni per confrontare gli elementi dell'array |

### ReturnValue

Un [Array](../) contenente tutti gli elementi che soddisfano le condizioni definite dal predicato specificato, se trovati; altrimenti, un [Array](../) vuoto.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
