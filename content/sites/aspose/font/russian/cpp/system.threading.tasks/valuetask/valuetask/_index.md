---
title: "System::Threading::Tasks::ValueTask::ValueTask конструктор"
linktitle: "ValueTask"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::ValueTask::ValueTask конструктор. Создаёт пустой, неинициализированный ValueTask в C++."
type: docs
weight: 100
url: /ru/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Создаёт пустой, неинициализированный [ValueTask](../).

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Примечания



Задача не завершена и не содержит результата. Попытка получить результат вызовет исключение.

## См. также

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Создаёт [ValueTask](../) из shared‑pointer к [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| task | const TaskPtr\& | Задача для обёртывания. Может быть null для пустой задачи. |
## Примечания



Эта [ValueTask](../) будет представлять состояние предоставленной задачи.

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
