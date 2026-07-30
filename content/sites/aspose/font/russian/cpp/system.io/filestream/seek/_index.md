---
title: "System::IO::FileStream::Seek метод"
linktitle: "Seek"
second_title: "Aspose.Font для C++"
description: "System::IO::FileStream::Seek метод. Устанавливает позицию потока, представленного текущим объектом, в C++."
type: docs
weight: 1600
url: /ru/cpp/system.io/filestream/seek/
---
## FileStream::Seek method


Устанавливает позицию потока, представленного текущим объектом.

```cpp
int64_t System::IO::FileStream::Seek(int64_t offset, SeekOrigin origin) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| смещение | int64_t | Смещение в байтах относительно позиции, указанной параметром **origin**. |
| origin | SeekOrigin | Указывает позицию, от которой, и направление, в котором вычисляется смещение. |

### ReturnValue

Новая позиция потока.

## См. также

* Enum [SeekOrigin](../../seekorigin/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
