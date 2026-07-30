---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait-Methode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait-Methode. Konfiguriert einen Awaiter für diese Aufgabe in C++."
type: docs
weight: 300
url: /de/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Konfiguriert einen Awaiter für diese Aufgabe.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continueOnCapturedContext | bool | true, um zu versuchen, die Fortsetzung zurück zum erfassten ursprünglichen Kontext zu marshallen; andernfalls false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Ein Objekt, das konfiguriert, wie Awaiter für diese Aufgabe funktionieren.

## Siehe auch

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
