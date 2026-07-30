---
title: "Méthode System::Nullable::operator<"
linktitle: "operator<"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Nullable::operator<. Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator<() à ces valeurs en C++."
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
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - false

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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
| autre | const T1\& | Une référence constante à la valeur à comparer |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure à la valeur spécifiée, sinon - false

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Retourne toujours false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: Méthode System::Nullable::operator>
titreLien: operator>
deuxième_titre: Aspose.Font pour C++
description: 'Méthode System::Nullable::operator>. Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator>() à ces valeurs en C++.'
type: documentation
poids: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet [Nullable](../) spécifié en appliquant [operator>()](./) à ces valeurs.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - false

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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
| autre | const T1\& | Une référence constante à la valeur à comparer |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure à la valeur spécifiée, sinon - false

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Retourne toujours false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
