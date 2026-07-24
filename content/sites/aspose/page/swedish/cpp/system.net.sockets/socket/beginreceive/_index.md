---
title: "System::Net::Sockets::Socket::BeginReceive metod"
linktitle: "BeginReceive"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::Socket::BeginReceive metod. Initierar en asynkron skrivoperation i C++."
type: docs
weight: 800
url: /sv/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Initierar en asynkron skrivoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | En buffert där de mottagna data kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte i den specificerade arrayen med början från parametern 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |
| återanrop | AsyncCallback | En återanrop som kommer att anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användar-tillhandahållen data som används för att unikt identifiera varje asynkron mottagningsoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/) objekt som representerar den initierade asynkrona mottagningsoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
