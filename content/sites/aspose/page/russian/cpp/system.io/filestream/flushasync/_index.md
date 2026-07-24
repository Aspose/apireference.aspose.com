---
title: "System::IO::FileStream::FlushAsync метод"
linktitle: "FlushAsync"
second_title: "Aspose.Page для C++"
description: "System::IO::FileStream::FlushAsync метод. Асинхронно очищает все буферы этого потока, заставляет любые буферизованные данные записаться в базовое устройство и отслеживает запросы отмены в C++."
type: docs
weight: 500
url: /ru/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Асинхронно очищает все буферы этого потока, заставляя любые буферизованные данные записываться в базовое устройство, и отслеживает запросы на отмену.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Токен для отслеживания запросов на отмену. |

### ReturnValue

Задача, представляющая асинхронную операцию очистки.

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
