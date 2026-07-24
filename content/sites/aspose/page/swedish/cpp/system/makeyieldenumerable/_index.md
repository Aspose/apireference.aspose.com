---
title: "Metoden System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page för C++"
description: "Metoden System::MakeYieldEnumerable. Skapar ett IEnumerable från en yield‑funktion i C++."
type: docs
weight: 25300
url: /sv/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Skapar ett IEnumerable från en yield‑funktion.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i sekvensen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Yield-funktionen att exekvera |

### ReturnValue

Delad pekare till IEnumerable

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
