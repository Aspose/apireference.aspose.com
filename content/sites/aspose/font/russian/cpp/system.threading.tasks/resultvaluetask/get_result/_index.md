---
title: "Метод System::Threading::Tasks::ResultValueTask::get_Result"
linktitle: "get_Result"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Tasks::ResultValueTask::get_Result. Возвращает результат завершённой задачи в C++."
type: docs
weight: 900
url: /ru/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Получает результат завершённой задачи.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result()
```


### ReturnValue

T Значение результата.
## Примечания



Если задача поддерживается объектом [ResultTask<T>](../../resulttask/), этот метод будет ожидать результат и кэшировать его. Последующие вызовы вернут кэшированное значение без ожидания.

## См. также

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
