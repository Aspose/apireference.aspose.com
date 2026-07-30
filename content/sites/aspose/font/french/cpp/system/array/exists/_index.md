---
title: "System::Array::Exists méthode"
linktitle: "Exists"
second_title: "Aspose.Font pour C++"
description: "System::Array::Exists méthode. Détermine si l'objet Array spécifié contient un élément qui satisfait aux exigences du prédicat spécifié en C++."
type: docs
weight: 5000
url: /fr/cpp/system/array/exists/
---
## Array::Exists method


Détermine si l'objet [Array](../) spécifié contient un élément qui satisfait aux exigences du prédicat spécifié.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Le tableau dans lequel chercher l'élément |
| correspondance | std::function\<bool(T)> | Objet fonction qui définit les exigences et vérifie si un élément les satisfait |

### ReturnValue

Vrai si **arr** contient un élément qui satisfait les exigences définies par **match**

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
