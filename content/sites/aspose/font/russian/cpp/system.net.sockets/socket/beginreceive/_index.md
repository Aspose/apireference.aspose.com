---
title: "System::Net::Sockets::Socket::BeginReceive метод"
linktitle: "BeginReceive"
second_title: "Aspose.Font для C++"
description: "System::Net::Sockets::Socket::BeginReceive метод. Инициирует асинхронную операцию записи в C++."
type: docs
weight: 800
url: /ru/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Инициирует асинхронную операцию записи.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Буфер, в который будут помещены полученные данные. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байтов в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение при получении. |
| обратный вызов | AsyncCallback | Обратный вызов, который будет выполнен, когда операция завершится. |
| состояние | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной идентификации каждой асинхронной операции получения. |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию получения.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
