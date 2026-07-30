---
title: "System::Default metodo"
linktitle: "Predefinito"
second_title: "Aspose.Font per C++"
description: "Metodo System::Default. Restituisce il riferimento all'unica istanza costruita con il costruttore predefinito del tipo di eccezione in C++."
type: docs
weight: 16300
url: /it/cpp/system/default/
---
## System::Default() method


Restituisce il riferimento all'unica istanza costruita con il costruttore predefinito del tipo di eccezione.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo la cui istanza viene restituita |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


Restituisce il riferimento all'unica istanza costruita con il costruttore predefinito del tipo non eccezione.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo la cui istanza viene restituita |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
