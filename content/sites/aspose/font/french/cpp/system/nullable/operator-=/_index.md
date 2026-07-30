---
title: "System::Nullable::operator-= méthode"
linktitle: "operator-="
second_title: "Aspose.Font pour C++"
description: "Méthode System::Nullable::operator-=. Applique operator-=() à la valeur représentée par l'objet actuel en utilisant la valeur représentée par l'objet Nullable spécifié comme argument du côté droit en C++."
type: docs
weight: 1500
url: /fr/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Applique [operator-=()](./) à la valeur représentée par l'objet actuel en utilisant la valeur représentée par l'objet [Nullable](../) spécifié comme argument du côté droit.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent d'un objet [Nullable](../) dont la valeur représentée est utilisée comme argument du côté droit de [operator-=()](./) |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) dont la valeur représentée est utilisée comme argument du côté droit de [operator-=()](./) appliqué à la valeur représentée par l'objet actuel. |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


Applique [operator-=()](./) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la valeur utilisée comme valeur du côté droit de [operator-=()](./) |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const T1\& | Une référence constante à la valeur qui est utilisée comme valeur du côté droit de [operator-=()](./) appliquée à la valeur représentée par l'objet actuel. |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


Renvoie une instance de la classe [Nullable](../) qui représente une valeur nulle.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
