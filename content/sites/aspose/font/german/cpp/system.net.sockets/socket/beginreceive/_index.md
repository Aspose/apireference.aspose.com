---
title: "System::Net::Sockets::Socket::BeginReceive-Methode"
linktitle: "BeginReceive"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::BeginReceive-Methode. Startet eine asynchrone Schreiboperation in C++."
type: docs
weight: 800
url: /de/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Startet einen asynchronen Schreibvorgang.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Ein Puffer, dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend beim Parameter 'offset'. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Empfangsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das die gestartete asynchrone Empfangsoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
