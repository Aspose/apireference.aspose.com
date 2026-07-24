---
title: "Метод System::IO::MemoryStream::TryGetBuffer"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page для C++"
description: "Метод System::IO::MemoryStream::TryGetBuffer. Возвращает массив беззнаковых байтов, из которого был создан этот поток, в C++."
type: docs
weight: 1800
url: /ru/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Возвращает массив беззнаковых байтов, из которого был создан этот поток.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | ArraySegment\\<uint8_t\\>\\& | массив байтов - выходной параметр. Когда метод возвращает true, возвращается сегмент массива байтов, из которого был создан этот поток; когда метод возвращает false, этот параметр устанавливается в значение по умолчанию. |

### ReturnValue

True, если преобразование выполнено успешно.

## См. также

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
