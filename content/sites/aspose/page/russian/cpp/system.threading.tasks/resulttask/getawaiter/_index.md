---
title: "System::Threading::Tasks::ResultTask::GetAwaiter method"
linktitle: "GetAwaiter"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter method. Получает awaiter для этой задачи-результата для использования с Await в C++."
type: docs
weight: 500
url: /ru/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Получает awaiter для этой задачи результата для использования с Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Примечания



При ожидании корутина возобновится, когда значение результата будет доступно.

## См. также

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
