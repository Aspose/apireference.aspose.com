---
title: "Méthode System::Nullable::Equals"
linktitle: "Equals"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Nullable::Equals . Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet Nullable spécifié en C++."
type: docs
weight: 200
url: /fr/cpp/system/nullable/equals/
---
## Nullable::Equals method


Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](../) spécifié.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type sous-jacent de l'objet [Nullable](../) à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| other | const T1\& | Une référence constante à l'objet [Nullable](../) à comparer. |

### ReturnValue

Vrai si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](../) spécifié, sinon - faux

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
