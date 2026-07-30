---
title: "Methode System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Font für C++"
description: "Methode System::MakeYieldEnumerable. Erstellt ein IEnumerable aus einer Yield‑Funktion in C++."
type: docs
weight: 25400
url: /de/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Erstellt ein IEnumerable aus einer Yield‑Funktion.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente in der Sequenz |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Die auszuführende Yield‑Funktion |

### ReturnValue

Shared‑Pointer auf das IEnumerable

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
