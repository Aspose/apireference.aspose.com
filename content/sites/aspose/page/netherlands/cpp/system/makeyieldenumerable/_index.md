---
title: "System::MakeYieldEnumerable methode"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page voor C++"
description: "System::MakeYieldEnumerable methode. Maakt een IEnumerable aan vanuit een yield-functie in C++."
type: docs
weight: 25300
url: /nl/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Maakt een IEnumerable aan vanuit een yield-functie.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van elementen in de reeks |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | De yield-functie om uit te voeren |

### ReturnValue

Gedeelde pointer naar de IEnumerable

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
