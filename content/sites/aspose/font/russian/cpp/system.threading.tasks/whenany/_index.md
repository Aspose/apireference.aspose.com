---
title: "Метод System::Threading::Tasks::WhenAny"
linktitle: "WhenAny"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Tasks::WhenAny. Создаёт задачу, которая завершится, когда любая из предоставленных задач завершится в C++."
type: docs
weight: 2800
url: /ru/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Создаёт задачу, которая завершится, когда любая из предоставленных задач завершится.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Параметр | Описание |
| --- | --- |
| TResult | Тип результата завершённой задачи. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, которая возвращает первую завершившуюся задачу, когда любая задача завершается.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


Создаёт задачу, которая завершится, когда любая из предоставленных задач завершится.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const ArrayPtr\<TaskPtr\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, представляющая завершение одной из предоставленных задач.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Создаёт задачу, которая завершится, когда любая из предоставленных задач завершится.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Параметр | Описание |
| --- | --- |
| TResult | Тип результата завершённой задачи. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, которая возвращает первую завершившуюся задачу, когда любая задача завершается.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Создаёт задачу, которая завершится, когда любая из предоставленных задач завершится.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, представляющая завершение одной из предоставленных задач.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
