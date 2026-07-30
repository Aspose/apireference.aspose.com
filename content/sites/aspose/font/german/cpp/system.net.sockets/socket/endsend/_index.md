---
title: "System::Net::Sockets::Socket::EndSend method"
linktitle: "EndSend"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::EndSend-Methode. Wartet, bis die angegebene asynchrone Sendeoperation in C++ abgeschlossen ist."
type: docs
weight: 1600
url: /de/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Wartet, bis der angegebene asynchrone Sendevorgang abgeschlossen ist.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das eine asynchrone Sendeoperation darstellt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Wartet, bis der angegebene asynchrone Sendevorgang abgeschlossen ist.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das eine asynchrone Sendeoperation darstellt. |
| errorCode | SocketError\& | Der Ausgabewert, dem der Fehlercode zugewiesen wird, wenn die Sendeoperation fehlschlägt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
