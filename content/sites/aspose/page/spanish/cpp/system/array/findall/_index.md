---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Page para C++"
description: "System::Array::FindAll method. Recupera todos los elementos que coinciden con las condiciones definidas por el predicado especificado en C++."
type: docs
weight: 5200
url: /es/cpp/system/array/findall/
---
## Array::FindAll method


Recupera todos los elementos que coinciden con las condiciones definidas por el predicado especificado.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) para buscar elementos en |
| coincidir | System::Predicate\<T\> | Un predicado que define las condiciones para coincidir con los elementos del arreglo |

### ReturnValue

Un [Array](../) que contiene todos los elementos que coinciden con las condiciones definidas por el predicado especificado, si se encuentran; de lo contrario, un [Array](../) vacío.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
