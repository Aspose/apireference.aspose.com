---
title: "System::Net::Sockets::Socket::EndSend methode"
linktitle: "EndSend"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::EndSend methode. Wacht tot de opgegeven asynchrone verzendbewerking voltooid is in C++."
type: docs
weight: 1600
url: /nl/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Wacht tot de opgegeven asynchrone verzendbewerking is voltooid.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone verzendbewerking vertegenwoordigt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Wacht tot de opgegeven asynchrone verzendbewerking is voltooid.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone verzendbewerking vertegenwoordigt. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt toegewezen wanneer de verzendbewerking mislukt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
