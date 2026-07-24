---
title: "Méthode System::Threading::Interlocked::Exchange"
linktitle: "Échange"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Threading::Interlocked::Exchange. Échange la valeur d'une variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage en C++."
type: docs
weight: 400
url: /fr/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Échange la valeur d'une variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Paramètre | Description |
| --- | --- |
| T | Type de variable. |

| Paramètre | Type | Description |
| --- | --- | --- |
| location1 | T\& | Référence de variable à modifier. |
| value | T | Valeur à stocker. |

### ReturnValue

Valeur de la variable juste avant qu'elle ne soit modifiée.

## Voir aussi

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Échange la valeur d'une variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage. Non implémenté.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Paramètre | Description |
| --- | --- |
| T | Type de variable. |

| Paramètre | Type | Description |
| --- | --- | --- |
| location1 | T\& | Référence de variable à modifier. |
| value | T | Valeur à stocker. |

### ReturnValue

Valeur de la variable juste avant qu'elle ne soit modifiée.

## Voir aussi

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
