---
title: "System::MakeYieldEnumerator‑metod"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page för C++"
description: "System::MakeYieldEnumerator‑metod. Skapar en IEnumerator från en yield‑funktion i C++."
type: docs
weight: 25400
url: /sv/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Skapar en IEnumerator från en yield‑funktion.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i sekvensen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Yield-funktionen att exekvera |

### ReturnValue

Delad pekare till IEnumerator

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
