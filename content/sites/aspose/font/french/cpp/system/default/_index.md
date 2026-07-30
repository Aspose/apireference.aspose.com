---
title: "Méthode System::Default"
linktitle: "Default"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Default. Retourne la référence à l'instance unique construite par défaut du type d'exception en C++."
type: docs
weight: 16300
url: /fr/cpp/system/default/
---
## System::Default() method


Retourne la référence à l'instance unique construite par défaut du type d'exception.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Paramètre | Description |
| --- | --- |
| T | Le type dont l'instance est retournée |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


Retourne la référence à l'instance unique construite par défaut du type non-exception.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Paramètre | Description |
| --- | --- |
| T | Le type dont l'instance est retournée |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
