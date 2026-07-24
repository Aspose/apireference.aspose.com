---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait methode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait methode. Configureert hoe wachtoperaties op deze resulttask zich moeten gedragen met betrekking tot contextvastlegging in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Configureert hoe wachtoperaties op deze resultaattaak zich moeten gedragen met betrekking tot contextvastlegging.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| continueOnCapturedContext | bool | Of er moet worden voortgezet op de vastgelegde context |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Opmerkingen



Dit maakt fijnmazige controle over de contextstroom mogelijk voor async/await‑patronen

## Zie ook

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
