---
title: "System::MakeScopeGuard methode"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page voor C++"
description: "System::MakeScopeGuard methode. Een fabrieksfunctie die instanties van de ScopedGuard class maakt in C++."
type: docs
weight: 24700
url: /nl/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Een fabrieksfunctie die instanties van de ScopedGuard class maakt.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van het functie‑object dat wordt aangeroepen door het geconstrueerde ScopedGuard‑object |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| f | F | Het functie‑object dat aan de constructor van de ScopedGuard class moet worden doorgegeven. |

### ReturnValue

Een nieuwe instantie van de ScopedGuard class

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
