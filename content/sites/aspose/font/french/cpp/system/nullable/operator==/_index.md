---
title: "System::Nullable::operator== méthode"
linktitle: "operator=="
second_title: "Aspose.Font pour C++"
description: "System::Nullable::operator== méthode. Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet Nullable spécifié en C++."
type: docs
weight: 1900
url: /fr/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](../) spécifié.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


Détermine si la valeur représentée par l'objet actuel est égale à la valeur spécifiée.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la valeur à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Une référence constante à la valeur à comparer |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est égale à la valeur spécifiée, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Détermine si la valeur représentée par l'objet actuel est nulle.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

Vrai si la valeur représentée par l'objet actuel est null, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
