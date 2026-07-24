---
title: "méthode System::Compare"
linktitle: "Compare"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Compare. Compare deux valeurs en C++."
type: docs
weight: 15800
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
| TB | Le type du deuxième comparand |

| Paramètre | Type | Description |
| --- | --- | --- |
| a | const TA\& | Le premier comparand |
| b | const TB\& | Le deuxième comparand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Compare deux valeurs à virgule flottante.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Paramètre | Description |
| --- | --- |
| TA | Le type du premier comparand |
| TB | Le type du deuxième comparand |

| Paramètre | Type | Description |
| --- | --- | --- |
| a | const TA\& | Le premier comparand |
| b | const TB\& | Le deuxième comparand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
