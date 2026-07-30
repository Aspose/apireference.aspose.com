---
title: "Metodo System::Compare"
linktitle: "Compare"
second_title: "Aspose.Font per C++"
description: "Metodo System::Compare. Confronta due valori in C++."
type: docs
weight: 15900
url: /it/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Confronta due valori.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parametro | Descrizione |
| --- | --- |
| TA | Il tipo del primo comparando |
| TB | Il tipo del secondo comparando |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | const TA\& | Il primo comparando |
| b | const TB\& | Il secondo comparando |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Confronta due valori a virgola mobile.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parametro | Descrizione |
| --- | --- |
| TA | Il tipo del primo comparando |
| TB | Il tipo del secondo comparando |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | const TA\& | Il primo comparando |
| b | const TB\& | Il secondo comparando |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
