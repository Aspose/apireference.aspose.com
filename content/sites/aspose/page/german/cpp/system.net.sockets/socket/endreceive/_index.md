---
title: "System::Net::Sockets::Socket::EndReceive Methode"
linktitle: "EndReceive"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::Socket::EndReceive-Methode. Wartet, bis die angegebene asynchrone Empfangsoperation in C++ abgeschlossen ist."
type: docs
weight: 1500
url: /de/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Wartet, bis die angegebene asynchrone Empfangsoperation abgeschlossen ist.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das eine asynchrone Empfangsoperation darstellt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Wartet, bis die angegebene asynchrone Empfangsoperation abgeschlossen ist.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das eine asynchrone Empfangsoperation darstellt. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn der Empfangsvorgang fehlschlägt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
