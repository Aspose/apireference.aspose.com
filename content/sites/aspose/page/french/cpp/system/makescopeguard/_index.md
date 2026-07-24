---
title: "Méthode System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page pour C++"
description: "Méthode System::MakeScopeGuard. Une fonction fabrique qui crée des instances de la classe ScopedGuard en C++."
type: docs
weight: 24700
url: /fr/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Une fonction fabrique qui crée des instances de la classe ScopedGuard.

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
* Library [Aspose.Page for C++](../../)
