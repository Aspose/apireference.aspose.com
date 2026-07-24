---
title: "System::Net::Sockets::Socket::BeginSend-Methode"
linktitle: "BeginSend"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::Socket::BeginSend-Methode. Startet eine asynchrone Sendeoperation in C++."
type: docs
weight: 900
url: /de/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Startet einen asynchronen Sendevorgang.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Ein Puffer, aus dem Daten gelesen werden. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn die Operation abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Sendeoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Sendeoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
