---
title: "System::Net::Sockets::NetworkStream::BeginRead metod"
linktitle: "BeginRead"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::NetworkStream::BeginRead metod. Initierar en asynkron läsoperation i C++."
type: docs
weight: 300
url: /sv/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Initierar en asynkron läsoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Bytearrayen där de lästa byten kommer att skrivas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att läsa. |
| återanrop | AsyncCallback | En återuppringning som ska anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron läsoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona läsoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
