---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait Methode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait Methode. Konfiguriert einen Awaiter für diese Aufgabe in C++."
type: docs
weight: 300
url: /de/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Konfiguriert einen Awaiter für diesen Task.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continueOnCapturedContext | bool | true, um zu versuchen, die Fortsetzung zurück zum erfassten ursprünglichen Kontext zu marshallen; andernfalls false. |

### ReturnValue

ConfiguredValueTaskAwaitable Ein Objekt, das festlegt, wie Awaiter für diese Aufgabe verhalten.

## Siehe auch

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
