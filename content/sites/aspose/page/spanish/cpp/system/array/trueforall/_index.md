---
title: "System::Array::TrueForAll método"
linktitle: "TrueForAll"
second_title: "Aspose.Page para C++"
description: "System::Array::TrueForAll método. Determina si todos los elementos del array especificado satisfacen las condiciones definidas por el predicado especificado en C++."
type: docs
weight: 5900
url: /es/cpp/system/array/trueforall/
---
## Array::TrueForAll method


Determina si todos los elementos del arreglo especificado cumplen las condiciones definidas por el predicado especificado.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Elementos del [Array](../) que deben coincidir con las condiciones |
| coincidir | System::Predicate\<T\> | Un predicado que define las condiciones para coincidir con los elementos del arreglo |

### ReturnValue

true si todos los elementos del array arr satisfacen las condiciones definidas por la coincidencia del predicado, de lo contrario false

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
