---
title: "System::IO::Stream::FlushAsync method"
linktitle: "FlushAsync"
second_title: "Aspose.Font для C++"
description: "System::IO::Stream::FlushAsync method. Асинхронно очищает все буферы этого потока, заставляет любые буферизованные данные записываться во внутреннее устройство и отслеживает запросы отмены в C++."
type: docs
weight: 900
url: /ru/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Асинхронно очищает все буферы этого потока, заставляя любые буферизованные данные записываться в подлежащее устройство, и отслеживает запросы на отмену.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Задача, представляющая асинхронную операцию очистки.

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Асинхронно очищает все буферы этого потока, заставляя любые буферизованные данные записываться в подлежащее устройство, и отслеживает запросы на отмену.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Токен для отслеживания запросов на отмену. |

### ReturnValue

Задача, представляющая асинхронную операцию очистки.

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
