---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait метод"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait метод. Настраивает поведение ожиданий этой задачи результата относительно захвата контекста в C++."
type: docs
weight: 200
url: /ru/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Настраивает, как ожидания на этой задаче результата должны вести себя относительно захвата контекста.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| continueOnCapturedContext | bool | Нужно ли продолжать на захваченном контексте |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Примечания



Это обеспечивает тонкий контроль над потоком контекста для шаблонов async/await

## См. также

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
