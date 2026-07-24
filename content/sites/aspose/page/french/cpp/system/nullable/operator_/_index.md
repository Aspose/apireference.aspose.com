---
title: "System::Nullable::operator< méthode"
linktitle: "opérateur<"
second_title: "Aspose.Page pour C++"
description: "System::Nullable::operator< méthode. Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator<() à ces valeurs en C++."
type: docs
weight: 1600
url: /fr/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet [Nullable](../) spécifié en appliquant [operator<()](./) à ces valeurs.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) avec lequel comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) avec lequel comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - false

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur spécifiée en appliquant [operator<()](./) à ces valeurs.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la valeur à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Une référence constante à la valeur à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure à la valeur spécifiée, sinon - false

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Renvoie toujours false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator> méthode
titre du lien: operator>
second_title: Aspose.Page pour C++
description: 'System::Nullable::operator> méthode. Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator>() à ces valeurs en C++.'
type: docs
weight: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet [Nullable](../) spécifié en appliquant [operator>()](./) à ces valeurs.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) avec lequel comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) avec lequel comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure à l'objet [Nullable](../) spécifié, sinon - false

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur spécifiée en appliquant [operator>()](./) à ces valeurs.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la valeur à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Une référence constante à la valeur à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure à la valeur spécifiée, sinon - false

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Renvoie toujours false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
