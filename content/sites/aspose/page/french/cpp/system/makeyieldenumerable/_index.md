---
title: "Méthode System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page pour C++"
description: "Méthode System::MakeYieldEnumerable. Crée un IEnumerable à partir d'une fonction yield en C++."
type: docs
weight: 25300
url: /fr/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Crée un IEnumerable à partir d'une fonction yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments dans la séquence |

| Paramètre | Type | Description |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | La fonction yield à exécuter |

### ReturnValue

Pointeur partagé vers l'IEnumerable

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
