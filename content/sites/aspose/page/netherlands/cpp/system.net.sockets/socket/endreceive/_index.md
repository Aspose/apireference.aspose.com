---
title: "System::Net::Sockets::Socket::EndReceive methode"
linktitle: "EndReceive"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::EndReceive-methode. Wacht tot de opgegeven asynchrone ontvangoperatie voltooid is in C++."
type: docs
weight: 1500
url: /nl/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Wacht tot de opgegeven asynchrone ontvangbewerking is voltooid.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone ontvangoperatie vertegenwoordigt. |

### ReturnValue

Het aantal bytes dat wordt ontvangen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Wacht tot de opgegeven asynchrone ontvangbewerking is voltooid.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone ontvangoperatie vertegenwoordigt. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt geplaatst wanneer de ontvangoperatie mislukt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
