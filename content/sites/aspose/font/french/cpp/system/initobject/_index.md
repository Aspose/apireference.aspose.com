---
title: "Méthode System::InitObject"
linktitle: "InitObject"
second_title: "Aspose.Font pour C++"
description: "Méthode System::InitObject. Démarre l'initialisation d'un objet avec une possession partagée en C++."
type: docs
weight: 21900
url: /fr/cpp/system/initobject/
---
## System::InitObject method


Démarre l'initialisation d'un objet avec une possession partagée.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'objet à initialiser |

| Paramètre | Type | Description |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) à initialiser |

### ReturnValue

ObjectBuilder configuré pour la construction de pointeur partagé
## Remarques



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
