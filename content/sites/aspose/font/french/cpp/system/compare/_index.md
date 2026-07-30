---
title: "Méthode System::Compare"
linktitle: "Compare"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Compare. Compare deux valeurs en C++."
type: docs
weight: 15900
url: /fr/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Compare deux valeurs.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Paramètre | Description |
| --- | --- |
| TA | Le type du premier comparand |
| TB | Le type du second comparand |

| Paramètre | Type | Description |
| --- | --- | --- |
| a | const TA\& | Le premier comparande |
| b | const TB\& | Le deuxième comparande |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Compare deux valeurs à virgule flottante.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Paramètre | Description |
| --- | --- |
| TA | Le type du premier comparand |
| TB | Le type du second comparand |

| Paramètre | Type | Description |
| --- | --- | --- |
| a | const TA\& | Le premier comparande |
| b | const TB\& | Le deuxième comparande |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
