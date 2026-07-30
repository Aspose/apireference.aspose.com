---
title: "System::Net::Sockets::NetworkStream::Seek метод"
linktitle: "Seek"
second_title: "Aspose.Font для C++"
description: "System::Net::Sockets::NetworkStream::Seek метод. Устанавливает позицию потока, представленного текущим объектом, в C++."
type: docs
weight: 2000
url: /ru/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


Устанавливает позицию потока, представленного текущим объектом.

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| смещение | int64_t | Смещение в байтах относительно позиции, указанной **origin** |
| origin | IO::SeekOrigin | Указывает позицию, от которой, и направление, в котором вычисляется смещение |

### ReturnValue

Новая позиция потока

## См. также

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
