---
title: "Метод System::IO::Stream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Page для C++"
description: "Метод System::IO::Stream::FlushAsync. Асинхронно очищает все буферы этого потока, заставляет любые буферизованные данные записываться во внутреннее устройство и отслеживает запросы на отмену в C++."
type: docs
weight: 900
url: /ru/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Асинхронно очищает все буферы этого потока, заставляя любые буферизованные данные записываться в базовое устройство, и отслеживает запросы на отмену.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Задача, представляющая асинхронную операцию очистки.

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Асинхронно очищает все буферы этого потока, заставляя любые буферизованные данные записываться в базовое устройство, и отслеживает запросы на отмену.

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
* Library [Aspose.Page for C++](../../../)
