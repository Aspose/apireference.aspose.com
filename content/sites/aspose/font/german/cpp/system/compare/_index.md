---
title: "System::Compare‑Methode"
linktitle: "Compare"
second_title: "Aspose.Font für C++"
description: "System::Compare‑Methode. Vergleicht zwei Werte in C++."
type: docs
weight: 15900
url: /de/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Vergleicht zwei Werte.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beschreibung |
| --- | --- |
| TA | Der Typ des ersten Vergleichswerts |
| TB | Der Typ des zweiten Vergleichswerts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | const TA\& | Der erste Operand |
| b | const TB\& | Der zweite Operand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Vergleicht zwei Gleitkommawerte.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beschreibung |
| --- | --- |
| TA | Der Typ des ersten Vergleichswerts |
| TB | Der Typ des zweiten Vergleichswerts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | const TA\& | Der erste Operand |
| b | const TB\& | Der zweite Operand |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
