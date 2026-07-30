---
title: "System::Nullable::operator<= méthode"
linktitle: "operator<="
second_title: "Aspose.Font pour C++"
description: "System::Nullable::operator<= méthode. Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur représentée par l'objet Nullable spécifié en appliquant operator<=() à ces valeurs en C++."
type: docs
weight: 1700
url: /fr/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur représentée par l'objet [Nullable](../) spécifié en appliquant [operator<=()](./) à ces valeurs.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur spécifiée en appliquant [operator<=()](./) à ces valeurs.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la valeur à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Une référence constante à la valeur à comparer |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur spécifiée, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Retourne toujours false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
titre: System::Nullable::operator>= méthode
titreLien: operator>=
deuxième_titre: Aspose.Font pour C++
description: 'System::Nullable::operator>= méthode. Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet Nullable spécifié en appliquant operator>=() à ces valeurs en C++.'
type: documentation
poids: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet [Nullable](../) spécifié en appliquant [operator>=()](./) à ces valeurs.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet spécifié en appliquant [operator>=()](./) à ces valeurs.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de la valeur à comparer à la valeur représentée par l'objet actuel |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Une référence constante à un objet avec lequel comparer l'objet actuel |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet spécifié, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Retourne toujours false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Toujours - false

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator|= méthode
linktitle: operator|=
deuxième_titre: Aspose.Font pour C++
description: 'System::Nullable::operator|= method. Applique operator|=() à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit en C++.'
type: documentation
weight: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Applique [operator|=()](./) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le paramètre de modèle pour faire fonctionner SFINAE. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | bool | Une valeur booléenne qui est utilisée comme valeur du côté droit de [operator | =()](./) appliquée à la valeur représentée par l'objet actuel. |

### ReturnValue

Une référence à l'objet lui-même.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
