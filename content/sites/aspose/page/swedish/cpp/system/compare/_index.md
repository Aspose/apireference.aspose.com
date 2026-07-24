---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page för C++"
description: "System::Compare metod. Jämför två värden i C++."
type: docs
weight: 15800
url: /sv/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Jämför två värden.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beskrivning |
| --- | --- |
| TA | Typen för den första jämförelseoperanden |
| TB | Typen för den andra jämförelseoperanden |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | const TA\& | Den första jämförelsetermen |
| b | const TB\& | Den andra jämförelsetermen |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Jämför två flyttalvärden.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Beskrivning |
| --- | --- |
| TA | Typen för den första jämförelseoperanden |
| TB | Typen för den andra jämförelseoperanden |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | const TA\& | Den första jämförelsetermen |
| b | const TB\& | Den andra jämförelsetermen |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
