---
title: "System::Threading::Interlocked::CompareExchange méthode"
linktitle: "CompareExchange"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Interlocked::CompareExchange méthode. Compare-échange la valeur d'une variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| location1 | int32_t\& | Référence de variable à modifier. |
| valeur | int32_t | Valeur à stocker. |
| comparand | int32_t | Valeur à comparer à la valeur de la variable avant l'échange. |
| réussi | bool\& | Référence à la variable qui est mise à true si l'échange a eu lieu et à false sinon. |

### ReturnValue

Valeur de la variable au début de l'opération, qu'elle ait été modifiée ou non.

## Voir aussi

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Paramètre | Description |
| --- | --- |
| T | Type de variable. |

| Paramètre | Type | Description |
| --- | --- | --- |
| location1 | T\& | Référence de variable à modifier. |
| valeur | T | Valeur à stocker. |
| comparand | T | Valeur à comparer à la valeur de la variable avant l'échange. |

### ReturnValue

Valeur de la variable au début de l'opération, qu'elle ait été modifiée ou non.

## Voir aussi

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. Non implémenté.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Paramètre | Description |
| --- | --- |
| T | Type de variable. |

| Paramètre | Type | Description |
| --- | --- | --- |
| location1 | T\& | Référence de variable à modifier. |
| valeur | T | Valeur à stocker. |
| comparand | T | Valeur à comparer à la valeur de la variable avant l'échange. |

### ReturnValue

Valeur de la variable au début de l'opération, qu'elle ait été modifiée ou non.

## Voir aussi

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
