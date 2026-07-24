---
title: "System::Compare-methode"
linktitle: "Compare"
second_title: "Aspose.Page voor C++"
description: "System::Compare-methode. Vergelijkt twee waarden in C++."
type: docs
weight: 15800
url: /nl/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Vergelijkt twee waarden.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beschrijving |
| --- | --- |
| TA | Het type van de eerste comparand |
| TB | Het type van de tweede comparand |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| een | const TA\& | De eerste operand |
| b | const TB\& | De tweede operand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Vergelijkt twee floating‑point‑waarden.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beschrijving |
| --- | --- |
| TA | Het type van de eerste comparand |
| TB | Het type van de tweede comparand |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| een | const TA\& | De eerste operand |
| b | const TB\& | De tweede operand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
