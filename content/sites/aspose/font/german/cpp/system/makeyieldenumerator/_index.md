---
title: "System::MakeYieldEnumerator Methode"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font für C++"
description: "System::MakeYieldEnumerator Methode. Erstellt einen IEnumerator aus einer Yield-Funktion in C++."
type: docs
weight: 25500
url: /de/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Erstellt einen IEnumerator aus einer Yield-Funktion.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente in der Sequenz |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Die auszuführende Yield‑Funktion |

### ReturnValue

Gemeinsamer Zeiger auf den IEnumerator

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
