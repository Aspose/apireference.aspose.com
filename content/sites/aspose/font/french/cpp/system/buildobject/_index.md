---
title: "System::BuildObject méthode"
linktitle: "BuildObject"
second_title: "Aspose.Font pour C++"
description: "System::BuildObject méthode. Créez un objet avec une possession partagée en C++."
type: docs
weight: 15300
url: /fr/cpp/system/buildobject/
---
## System::BuildObject method


Construisez un objet avec une possession partagée.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'objet à créer |
| Args | Types d'arguments pour la construction d'objet |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | Args\&&... | Arguments à transmettre au constructeur d'objet |

### ReturnValue

ObjectBuilder configuré pour la construction de pointeur partagé
## Remarques



Crée un [SharedPtr<T>](../sharedptr/) et renvoie un constructeur pour celui-ci
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
