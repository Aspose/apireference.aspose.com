---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem метод"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font для C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem метод. Добавляет элемент работы в очередь в C++."
type: docs
weight: 700
url: /ru/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Добавляет задачу в очередь.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | WaitCallback | Функция обратного вызова для выполнения. |
| состояние | const System::SharedPtr\<System::Object\>\& | Аргумент функции обратного вызова. |

### ReturnValue

Всегда возвращает true.

## См. также

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
