---
title: "System::Net::Sockets::Socket::EndSend metod"
linktitle: "EndSend"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::Socket::EndSend metod. Väntar tills den specificerade asynkrona sändningsoperationen är klar i C++."
type: docs
weight: 1600
url: /sv/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Väntar tills den angivna asynkrona sändningsoperationen slutförs.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ett [IAsyncResult](../../../system/iasyncresult/) objekt som representerar en asynkron sändningsoperation. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Väntar tills den angivna asynkrona sändningsoperationen slutförs.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ett [IAsyncResult](../../../system/iasyncresult/) objekt som representerar en asynkron sändningsoperation. |
| errorCode | SocketError\& | Utdata-parametern där felkoden kommer att tilldelas när sändningsoperationen misslyckas. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
