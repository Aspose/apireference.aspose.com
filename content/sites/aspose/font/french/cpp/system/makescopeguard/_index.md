---
title: "System::MakeScopeGuard méthode"
linktitle: "CréerGardePortée"
second_title: "Aspose.Font pour C++"
description: "System::MakeScopeGuard méthode. Une fonction de fabrique qui crée des instances de la classe ScopedGuard en C++."
type: docs
weight: 24800
url: /fr/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Une fonction de fabrique qui crée des instances de la classe ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Paramètre | Description |
| --- | --- |
| Le | type de l'objet fonction à invoquer par l'objet ScopedGuard construit |

| Paramètre | Type | Description |
| --- | --- | --- |
| f | F | L'objet fonction à passer au constructeur de la classe ScopedGuard. |

### ReturnValue

Une nouvelle instance de la classe ScopedGuard

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
