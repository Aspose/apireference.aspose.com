---
title: "System::MakeScopeGuard-Methode"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Font für C++"
description: "System::MakeScopeGuard-Methode. Eine Fabrikfunktion, die Instanzen der Klasse ScopedGuard in C++ erstellt."
type: docs
weight: 24800
url: /de/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Eine Fabrikfunktion, die Instanzen der Klasse ScopedGuard erstellt.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ des Funktionsobjekts, das vom konstruierten ScopedGuard-Objekt aufgerufen wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| f | F | Das Funktionsobjekt, das an den Konstruktor der ScopedGuard-Klasse übergeben wird. |

### ReturnValue

Eine neue Instanz der ScopedGuard-Klasse

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
