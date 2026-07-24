---
title: "System::Net::Sockets::NetworkStream::BeginWrite metod"
linktitle: "BeginWrite"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite metod. Initierar en asynkron skrivoperation i C++."
type: docs
weight: 400
url: /sv/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Initierar en asynkron skrivoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | En buffert som innehåller data som ska skrivas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att skriva. |
| återanrop | AsyncCallback | En återuppringning som ska anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererad data som används för att unikt identifiera varje asynkron skrivoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona skrivoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
