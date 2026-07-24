---
title: "System::Net::Security::SslStream::BeginWrite metod"
linktitle: "BeginWrite"
second_title: "Aspose.Page för C++"
description: "System::Net::Security::SslStream::BeginWrite metod. Initierar en asynkron skrivoperation i C++."
type: docs
weight: 400
url: /sv/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Initierar en asynkron skrivoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Bytearrayen att skriva data till. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| count | int32_t | Antalet byte att skriva. |
| asyncCallback | AsyncCallback | En återuppringning som ska anropas när operationen är klar. |
| asyncState | System::SharedPtr\<Object\> | Användarlevererad data som används för att unikt identifiera varje asynkron skrivoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona skrivoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
