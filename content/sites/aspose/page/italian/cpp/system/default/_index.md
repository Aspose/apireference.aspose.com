---
title: "Metodo System::Default"
linktitle: "Default"
second_title: "Aspose.Page per C++"
description: "Metodo System::Default. Restituisce il riferimento all'unica istanza costruita di default del tipo di eccezione in C++."
type: docs
weight: 16200
url: /it/cpp/system/default/
---
## System::Default() method


Restituisce il riferimento all'unica istanza costruita di default del tipo di eccezione.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo la cui istanza è restituita |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Restituisce il riferimento all'unica istanza costruita di default del tipo non eccezione.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo la cui istanza è restituita |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
