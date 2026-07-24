---
title: "System::Threading::Tasks::ResultValueTask::get_Result метод"
linktitle: "get_Result"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result метод. Получает результат завершённой задачи в C++."
type: docs
weight: 900
url: /ru/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Получает результат завершённой задачи.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T Значение результата.
## Примечания



Если задача поддерживается [ResultTask<T>](../../resulttask/), этот метод будет ожидать результат и кэшировать его. Последующие вызовы вернут кэшированное значение без ожидания.

## См. также

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
