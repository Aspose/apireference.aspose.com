---
title: "méthode System::MakeYieldEnumerator"
linktitle: "CréerÉnumérateurYield"
second_title: "Aspose.Font pour C++"
description: "méthode System::MakeYieldEnumerator. Crée un IEnumerator à partir d'une fonction yield en C++."
type: docs
weight: 25500
url: /fr/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Crée un IEnumerator à partir d'une fonction yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de la séquence |

| Paramètre | Type | Description |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | La fonction yield à exécuter |

### ReturnValue

Pointeur partagé vers l'IEnumerator

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
