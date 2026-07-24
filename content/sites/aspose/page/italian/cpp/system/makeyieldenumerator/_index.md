---
title: "System::MakeYieldEnumerator metodo"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page per C++"
description: "System::MakeYieldEnumerator metodo. Crea un IEnumerator da una funzione yield in C++."
type: docs
weight: 25400
url: /it/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Crea un IEnumerator da una funzione yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di elementi nella sequenza |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fnc | const Details::YieldFunction\\<T\\>\\& | La funzione yield da eseguire |

### ReturnValue

Puntatore condiviso a IEnumerator

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
