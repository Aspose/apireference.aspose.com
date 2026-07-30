---
title: "Metodo System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Font per C++"
description: "Metodo System::MakeScopeGuard. Una funzione factory che crea istanze della classe ScopedGuard in C++."
type: docs
weight: 24800
url: /it/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Una funzione factory che crea istanze della classe ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parametro | Descrizione |
| --- | --- |
| Il | tipo dell'oggetto funzione da invocare dall'oggetto ScopedGuard costruito |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| f | F | L'oggetto funzione da passare al costruttore della classe ScopedGuard. |

### ReturnValue

Una nuova istanza della classe ScopedGuard

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
