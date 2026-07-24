---
title: "Método System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page para C++"
description: "Método System::MakeScopeGuard. Una función de fábrica que crea instancias de la clase ScopedGuard en C++."
type: docs
weight: 24700
url: /es/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Una función de fábrica que crea instancias de la clase ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parámetro | Descripción |
| --- | --- |
| El | tipo del objeto función que será invocado por el objeto ScopedGuard construido |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| f | F | El objeto función que se pasa al constructor de la clase ScopedGuard. |

### ReturnValue

Una nueva instancia de la clase ScopedGuard

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
