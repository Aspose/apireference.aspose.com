---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait‑metod"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait‑metod. Konfigurerar hur väntan på denna resultat‑task ska bete sig avseende kontextfångst i C++."
type: docs
weight: 200
url: /sv/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Konfigurerar hur await-operationer på denna resultattask ska bete sig avseende kontextfångst.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| continueOnCapturedContext | bool | Om den ska fortsätta på den fångade kontexten |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Anmärkningar



Detta möjliggör finjusterad kontroll över kontextflödet för async/await‑mönster

## Se även

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
