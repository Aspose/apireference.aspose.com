---
title: "System::Threading::Tasks::WhenAll method"
linktitle: "WhenAll"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::WhenAll method. Создаёт задачу, которая завершится, когда все предоставленные задачи завершатся в C++."
type: docs
weight: 2400
url: /ru/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Создаёт задачу, которая завершится, когда все предоставленные задачи завершатся.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Параметр | Описание |
| --- | --- |
| TResult | Тип результатов завершённых задач. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, возвращающая массив всех результатов после завершения всех задач.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


Создаёт задачу, которая завершится, когда все предоставленные задачи завершатся.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const ArrayPtr\<TaskPtr\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, представляющая завершение всех предоставленных задач.

## См. также

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Создаёт задачу, которая завершится, когда все предоставленные задачи завершатся.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Параметр | Описание |
| --- | --- |
| TResult | Тип результатов завершённых задач. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, возвращающая массив всех результатов после завершения всех задач.

## См. также

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Создаёт задачу, которая завершится, когда все предоставленные задачи завершатся.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| задачи | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Задачи, ожидание завершения которых требуется. |

### ReturnValue

Задача, представляющая завершение всех предоставленных задач.

## См. также

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
