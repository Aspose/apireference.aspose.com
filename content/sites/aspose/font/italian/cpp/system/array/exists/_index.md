---
title: "Metodo System::Array::Exists"
linktitle: "Exists"
second_title: "Aspose.Font per C++"
description: "Metodo System::Array::Exists. Determina se l'oggetto Array specificato contiene un elemento che soddisfa i requisiti del predicato specificato in C++."
type: docs
weight: 5000
url: /it/cpp/system/array/exists/
---
## Array::Exists method


Determina se l'oggetto [Array](../) specificato contiene un elemento che soddisfa i requisiti del predicato specificato.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | L'array in cui cercare l'elemento |
| corrispondenza | std::function\<bool(T)> | Oggetto funzione che definisce i requisiti e verifica se un elemento li soddisfa |

### ReturnValue

Vero se **arr** contiene un elemento che soddisfa i requisiti definiti da **match**

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
