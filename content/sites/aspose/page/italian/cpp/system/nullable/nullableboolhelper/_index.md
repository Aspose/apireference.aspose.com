---
title: "System::Nullable::NullableBoolHelper metodo"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page per C++"
description: "System::Nullable::NullableBoolHelper metodo. Funzione di supporto per verificare se **this** e **other** sono entrambi non null e chiamare una lambda in tal caso. Utilizzata nelle implementazioni in C++."
type: docs
weight: 800
url: /it/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Funzione di supporto per verificare se questo e **other** sono entrambi non nulli e chiamare una lambda in tal caso. Utilizzata nelle implementazioni.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Altro tipo nullable. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Altro valore nullable da confrontare. |
| f | const std::function\<bool()>\& | Lambda da chiamare se sia **this** che **other** non sono null. |
| default_if_both_are_null | bool | Valore di ritorno se entrambi i valori sono null. |

### ReturnValue

false se **this** o **other** è null; **default_if_both_are_null** se entrambi sono null; risultato della chiamata **f** se entrambi non sono null.

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
