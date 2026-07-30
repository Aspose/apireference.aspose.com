---
title: "System::IO::FileStream::ReadAsync метод"
linktitle: "ReadAsync"
second_title: "Aspose.Font для C++"
description: "System::IO::FileStream::ReadAsync метод. Асинхронно читает последовательность байтов из текущего потока, перемещает позицию в потоке на количество прочитанных байтов и отслеживает запросы отмены в C++."
type: docs
weight: 1400
url: /ru/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Асинхронно читает последовательность байтов из текущего потока, перемещает позицию в потоке на количество прочитанных байтов и отслеживает запросы на отмену.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Массив байтов, в который записываются прочитанные байты. |
| смещение | int32_t | Позиция, начинающаяся с 0, в **buffer**, с которой начинать запись. |
| count | int32_t | Количество байтов для чтения. |
| cancellationToken | const Threading::CancellationToken\& | Токен для отслеживания запросов на отмену. |

### ReturnValue

Задача, представляющая асинхронную операцию чтения. Значение параметра TResult содержит общее количество байтов, прочитанных в буфер. Значение результата может быть меньше запрошенного количества байтов, если доступно меньше байтов, чем запрошено, либо может быть 0 (ноль), если достигнут конец потока.

## См. также

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
