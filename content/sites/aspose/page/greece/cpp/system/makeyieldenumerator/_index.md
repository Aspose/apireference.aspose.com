---
title: "System::MakeYieldEnumerator μέθοδος"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page για C++"
description: "System::MakeYieldEnumerator μέθοδος. Δημιουργεί ένα IEnumerator από μια συνάρτηση yield σε C++."
type: docs
weight: 25400
url: /el/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Δημιουργεί ένα IEnumerator από μια συνάρτηση yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων στη σειρά |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Η συνάρτηση απόδοσης για εκτέλεση |

### ReturnValue

Κοινός δείκτης προς το IEnumerator

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
