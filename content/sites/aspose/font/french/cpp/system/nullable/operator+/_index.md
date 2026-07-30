---
title: "Méthode System::Nullable::operator+"
linktitle: "opérateur+"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Nullable::operator+ . Additionne les valeurs nullables en C++."
type: docs
weight: 1200
url: /fr/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Additionne les valeurs nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Type d’opérande droite. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const Nullable\<T1\>\& | valeur à ajouter. |

### ReturnValue

Résultat de l'addition.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


Additionne les valeurs nullable et non nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Type d’opérande droite. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | valeur à ajouter. |

### ReturnValue

Résultat de l'addition.

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Renvoie une instance construite par défaut de la classe Nullable<T>.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Voir aussi

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
