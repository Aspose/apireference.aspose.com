---
title: "Metodo System::MakeYieldEnumerator"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font per C++"
description: "Metodo System::MakeYieldEnumerator. Crea un IEnumerator da una funzione yield in C++."
type: docs
weight: 25500
url: /it/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Crea un IEnumerator da una funzione yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi nella sequenza |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fnc | const Details::YieldFunction\\<T\\>\\& | La funzione yield da eseguire |

### ReturnValue

Puntatore condiviso a IEnumerator

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
