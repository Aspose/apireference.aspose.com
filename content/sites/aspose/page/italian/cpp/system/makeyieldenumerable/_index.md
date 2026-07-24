---
title: "Metodo System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page per C++"
description: "Metodo System::MakeYieldEnumerable. Crea un IEnumerable da una funzione yield in C++."
type: docs
weight: 25300
url: /it/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Crea un IEnumerable da una funzione yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di elementi nella sequenza |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fnc | const Details::YieldFunction\\<T\\>\\& | La funzione yield da eseguire |

### ReturnValue

Puntatore condiviso a IEnumerable

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
