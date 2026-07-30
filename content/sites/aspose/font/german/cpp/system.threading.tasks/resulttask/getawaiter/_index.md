---
title: "System::Threading::Tasks::ResultTask::GetAwaiter Methode"
linktitle: "GetAwaiter"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter Methode. Gibt einen Awaiter für diese ResultTask zurück, der in C++ mit Await verwendet werden kann."
type: docs
weight: 600
url: /de/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Liefert einen Awaiter für diesen Ergebnis‑Task zur Verwendung mit Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Hinweise



Beim Await wird die Coroutine mit dem verfügbaren Ergebniswert fortgesetzt

## Siehe auch

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
