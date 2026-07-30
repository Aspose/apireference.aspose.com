---
title: "System::Nullable::operator= méthode"
linktitle: "operator="
second_title: "Aspose.Font pour C++"
description: "System::Nullable::operator= méthode. Remplace la valeur actuellement représentée de l'objet'' par celle spécifiée en C++."
type: docs
weight: 1800
url: /fr/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Remplace la valeur actuellement représentée de l'objet par celle spécifiée.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Paramètre | Description |
| --- | --- |
| Le | type de la nouvelle valeur à représenter par l'objet actuel |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | La nouvelle valeur à représenter par l'objet actuel |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


Remplace la valeur actuellement représentée de l'objet par celle spécifiée.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Paramètre | Description |
| --- | --- |
| Le | type de la nouvelle valeur à représenter par l'objet actuel |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const T1\& | La nouvelle valeur à représenter par l'objet actuel |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Assigne une valeur nulle à l'objet actuel.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Un objet [Nullable](../) qui représente une valeur nulle.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
