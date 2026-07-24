---
title: "System::MakeYieldEnumerator methode"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::MakeYieldEnumerator methode. Maakt een IEnumerator aan vanuit een yield‑functie in C++."
type: docs
weight: 25400
url: /nl/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Maakt een IEnumerator aan vanuit een yield‑functie.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van elementen in de reeks |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | De yield-functie om uit te voeren |

### ReturnValue

Gedeelde pointer naar de IEnumerator

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
