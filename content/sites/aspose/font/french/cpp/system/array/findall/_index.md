---
title: "System::Array::FindAll méthode"
linktitle: "FindAll"
second_title: "Aspose.Font pour C++"
description: "System::Array::FindAll méthode. Récupère tous les éléments qui correspondent aux conditions définies par le prédicat spécifié en C++."
type: docs
weight: 5200
url: /fr/cpp/system/array/findall/
---
## Array::FindAll method


Récupère tous les éléments qui correspondent aux conditions définies par le prédicat spécifié.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) pour rechercher des éléments dans |
| correspondance | System::Predicate\<T\> | Un prédicat qui définit les conditions pour correspondre aux éléments du tableau |

### ReturnValue

Un [Array](../) contenant tous les éléments qui correspondent aux conditions définies par le prédicat spécifié, s'ils sont trouvés ; sinon, un [Array](../) vide.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
