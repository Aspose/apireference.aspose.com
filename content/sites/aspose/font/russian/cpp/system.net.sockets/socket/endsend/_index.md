---
title: "System::Net::Sockets::Socket::EndSend method"
linktitle: "EndSend"
second_title: "Aspose.Font для C++"
description: "System::Net::Sockets::Socket::EndSend метод. Ожидает завершения указанной асинхронной операции отправки в C++."
type: docs
weight: 1600
url: /ru/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Ожидает завершения указанной асинхронной операции отправки.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию отправки. |

### ReturnValue

Количество отправленных байтов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Ожидает завершения указанной асинхронной операции отправки.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию отправки. |
| errorCode | SocketError\& | Выходной параметр, в который будет записан код ошибки при сбое операции отправки. |

### ReturnValue

Количество отправленных байтов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
