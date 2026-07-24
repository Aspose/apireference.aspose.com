---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait-Methode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait-Methode. Konfiguriert, wie Await-Operationen auf dieser Ergebnisaufgabe in Bezug auf die Kontextaufnahme in C++ sich verhalten sollen."
type: docs
weight: 200
url: /de/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Konfiguriert, wie Await‑Aufrufe auf dieser Ergebnis‑Task in Bezug auf die Kontextaufnahme sich verhalten sollen.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continueOnCapturedContext | bool | Ob im erfassten Kontext fortgesetzt werden soll |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Hinweise



Dies ermöglicht eine feinkörnige Kontrolle über den Kontextfluss für async/await-Muster

## Siehe auch

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
