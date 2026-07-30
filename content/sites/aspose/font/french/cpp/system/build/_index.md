---
title: "System::Build méthode"
linktitle: "Build"
second_title: "Aspose.Font pour C++"
description: "System::Build méthode. Créez un objet avec une possession directe en C++."
type: docs
weight: 15100
url: /fr/cpp/system/build/
---
## System::Build method


Créez un objet avec une possession directe.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'objet à créer |
| Args | Types d'arguments pour la construction d'objet |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | Args\&&... | Arguments à transmettre au constructeur d'objet |

### ReturnValue

ObjectBuilder configuré pour la construction directe d'objet
## Remarques



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
