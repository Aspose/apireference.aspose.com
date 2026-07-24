---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Compare. Συγκρίνει δύο τιμές σε C++."
type: docs
weight: 15800
url: /el/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Συγκρίνει δύο τιμές.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Περιγραφή |
| --- | --- |
| TA | Ο τύπος του πρώτου συγκρίσιμου |
| TB | Ο τύπος του δεύτερου συγκρίσιμου |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | const TA\& | Ο πρώτος συγκριτέος |
| b | const TB\& | Ο δεύτερος συγκριτέος |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Συγκρίνει δύο τιμές κινητής υποδιαστολής.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Περιγραφή |
| --- | --- |
| TA | Ο τύπος του πρώτου συγκρίσιμου |
| TB | Ο τύπος του δεύτερου συγκρίσιμου |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | const TA\& | Ο πρώτος συγκριτέος |
| b | const TB\& | Ο δεύτερος συγκριτέος |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
