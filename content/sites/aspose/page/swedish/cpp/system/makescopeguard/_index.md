---
title: "System::MakeScopeGuard‑metod"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page för C++"
description: "System::MakeScopeGuard‑metod. En fabrikfunktion som skapar instanser av ScopedGuard‑klassen i C++."
type: docs
weight: 24700
url: /sv/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


En fabrikfunktion som skapar instanser av ScopedGuard‑klassen.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | Beskrivning |
| --- | --- |
| Den | typ av funktionsobjektet som ska anropas av det konstruerade ScopedGuard‑objektet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| f | F | Funktionsobjektet att skicka till ScopedGuard class' konstruktor. |

### ReturnValue

En ny instans av ScopedGuard class

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
