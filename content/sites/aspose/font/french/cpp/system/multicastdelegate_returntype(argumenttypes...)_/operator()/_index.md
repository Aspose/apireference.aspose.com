---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method"
linktitle: "operator()"
second_title: "Aspose.Font pour C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method. Invoque tous les délégués actuellement présents dans la collection de délégués. Les délégués sont invoqués dans le même ordre que celui dans lequel ils ont été ajoutés à la collection. L'opérateur bloque pendant l'exécution des délégués en C++."
type: docs
weight: 1500
url: /fr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


Exécute tous les délégués actuellement présents dans la collection de délégués. Les délégués sont exécutés dans le même ordre que celui dans lequel ils ont été ajoutés à la collection. L'opérateur se bloque pendant l'exécution des délégués.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| args | ArgumentTypes... | Arguments à transmettre aux délégués à invoquer |

### ReturnValue

Valeur de retour du dernier délégué invoqué

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
