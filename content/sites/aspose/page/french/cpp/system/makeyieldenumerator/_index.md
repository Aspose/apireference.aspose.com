---
title: "System::MakeYieldEnumerator méthode"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page pour C++"
description: "System::MakeYieldEnumerator méthode. Crée un IEnumerator à partir d'une fonction yield en C++."
type: docs
weight: 25400
url: /fr/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Crée un IEnumerator à partir d'une fonction yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments dans la séquence |

| Paramètre | Type | Description |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | La fonction yield à exécuter |

### ReturnValue

Pointeur partagé vers l'IEnumerator

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
