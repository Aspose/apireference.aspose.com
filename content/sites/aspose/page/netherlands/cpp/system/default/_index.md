---
title: "System::Default methode"
linktitle: "Default"
second_title: "Aspose.Page voor C++"
description: "System::Default methode. Retourneert de referentie naar de enige standaard-geconstrueerde instantie van het exceptietype in C++."
type: docs
weight: 16200
url: /nl/cpp/system/default/
---
## System::Default() method


Retourneert de referentie naar de enige standaard-geconstrueerde instantie van het exceptietype.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type waarvan de instantie wordt geretourneerd |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Retourneert de referentie naar de enige standaard-geconstrueerde instantie van het niet-exceptietype.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type waarvan de instantie wordt geretourneerd |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
