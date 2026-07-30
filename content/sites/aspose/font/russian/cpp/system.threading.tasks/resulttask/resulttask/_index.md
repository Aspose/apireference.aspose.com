---
title: "System::Threading::Tasks::ResultTask::ResultTask конструктор"
linktitle: "ResultTask"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::ResultTask::ResultTask конструктор. Внутренняя реализация. Не предназначен для пользовательского кода в C++."
type: docs
weight: 100
url: /ru/cpp/system.threading.tasks/resulttask/resulttask/
---
## ResultTask::ResultTask() constructor


Внутренняя реализация. Не предназначено для пользовательского кода.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask()
```

## Примечания


Внутренний конструктор для создания неинициализированных задач результата
## См. также

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ResultTask(const Func\<T\>\&) constructor


Создаёт [ResultTask](../) с функцией, возвращающей значение.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const Func<T> &function)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| функция | const Func\<T\>\& | Функция, выполняемая асинхронно и возвращающая результат |

## См. также

* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ResultTask(const T\&) constructor


Внутренний конструктор для создания задач результата с указанным результатом.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const T &result)
```

## См. также

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
