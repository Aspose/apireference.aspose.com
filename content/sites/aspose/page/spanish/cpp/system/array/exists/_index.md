---
title: "Método System::Array::Exists"
linktitle: "Exists"
second_title: "Aspose.Page para C++"
description: "Método System::Array::Exists. Determina si el objeto Array especificado contiene un elemento que satisface los requisitos del predicado especificado en C++."
type: docs
weight: 5000
url: /es/cpp/system/array/exists/
---
## Array::Exists method


Determina si el objeto [Array](../) especificado contiene un elemento que satisface los requisitos del predicado especificado.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | La matriz en la que buscar el elemento |
| coincidir | std::function\<bool(T)> | Objeto función que define los requisitos y verifica si un elemento los satisface |

### ReturnValue

Verdadero si **arr** contiene un elemento que satisface los requisitos definidos por **match**

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
