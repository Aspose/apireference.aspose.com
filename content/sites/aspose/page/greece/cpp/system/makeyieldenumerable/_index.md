---
title: "Μέθοδος System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::MakeYieldEnumerable. Δημιουργεί ένα IEnumerable από μια συνάρτηση yield σε C++."
type: docs
weight: 25300
url: /el/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Δημιουργεί ένα IEnumerable από μια συνάρτηση yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων στη σειρά |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Η συνάρτηση απόδοσης για εκτέλεση |

### ReturnValue

Κοινός δείκτης προς το IEnumerable

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
