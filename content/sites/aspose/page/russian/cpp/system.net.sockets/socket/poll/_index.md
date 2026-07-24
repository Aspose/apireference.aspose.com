---
title: "System::Net::Sockets::Socket::Poll метод"
linktitle: "Poll"
second_title: "Aspose.Page для C++"
description: "System::Net::Sockets::Socket::Poll метод. Возвращает статус сокета на основе указанного режима опроса в C++."
type: docs
weight: 4200
url: /ru/cpp/system.net.sockets/socket/poll/
---
## Socket::Poll method


Возвращает статус socket в зависимости от указанного режима опроса.

```cpp
bool System::Net::Sockets::Socket::Poll(int32_t microSeconds, SelectMode mode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| microSeconds | int32_t | Количество времени в миллисекундах, которое следует ждать ответа. |
| mode | SelectMode | Режим опроса. |

### ReturnValue

Статус сокета на основе указанного режима опроса.

## См. также

* Enum [SelectMode](../../selectmode/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
