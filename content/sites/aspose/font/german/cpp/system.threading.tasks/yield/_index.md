---
title: "System::Threading::Tasks::Yield‑Methode"
linktitle: "Yield"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Yield‑Methode. Erstellt eine await‑fähige Aufgabe, die beim Awaiten in C++ asynchron zurück zum aktuellen Kontext wechselt."
type: docs
weight: 3200
url: /de/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


Erstellt eine await‑fähige Aufgabe, die beim Awaiten asynchron zurück zum aktuellen Kontext wechselt.

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

Ein YieldAwaitable, das await‑bar ist, um die Kontrolle abzugeben.
## Hinweise



Diese Methode ist nützlich, um eine asynchrone Methode zur Abgabe der Kontrolle zu zwingen, sodass andere ausstehende Arbeiten verarbeitet werden können, bevor fortgefahren wird.
## Siehe auch

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
