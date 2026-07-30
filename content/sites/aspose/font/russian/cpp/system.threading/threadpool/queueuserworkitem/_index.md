---
title: "Метод System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::ThreadPool::QueueUserWorkItem. Помещает элемент работы в очередь, представленный обратным вызовом без параметров, в C++."
type: docs
weight: 600
url: /ru/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Помещает элемент работы в очередь, который присутствует с обратным вызовом без параметров.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | WaitCallback | Функция обратного вызова, используемая в качестве задания. |

### ReturnValue

Всегда возвращает true.

## См. также

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Помещает элемент работы в очередь, который присутствует с обратным вызовом без параметров.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | WaitCallback | Функция обратного вызова, используемая в качестве задания. |
| состояние | const System::SharedPtr\<System::Object\>\& | Параметр функции задания. |

### ReturnValue

Всегда возвращает true.

## См. также

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
