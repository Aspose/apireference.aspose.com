---
title: "Méthode System::Nullable::operator-"
linktitle: "operator-"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Nullable::operator-. Soustrait des valeurs nullable en C++."
type: docs
weight: 1400
url: /fr/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Soustrait les valeurs nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Type de l'opérande droite. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const Nullable\<T1\>\& | valeur à soustraire. |

### ReturnValue

Résultat de la soustraction.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


Soustrait les valeurs nullable et non nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Type de l'opérande droite. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | valeur à soustraire. |

### ReturnValue

Résultat de la soustraction.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


Soustrait les valeurs nullable et les valeurs à pointeur nul.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Type de l'opérande droit, doit être nullptr_t. |

### ReturnValue

Objet [Nullable](../) vide.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
