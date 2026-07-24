---
title: "System::IO::Stream::BeginRead‑metod"
linktitle: "BeginRead"
second_title: "Aspose.Page för C++"
description: "System::IO::Stream::BeginRead‑metod. Initierar en asynkron läsoperation i C++."
type: docs
weight: 100
url: /sv/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Initierar en asynkron läsoperation.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | En buffer att läsa till |
| offset | int | Ett 0‑baserat offset i **buffer** som indikerar positionen från vilken de lästa data ska skrivas. |
| count | int | Antalet byte att läsa |
| återanrop | System::AsyncCallback | En återuppringning som ska anropas när operationen är klar |
| tillstånd | System::SharedPtr\<System::Object\> | Användarlevererad data som används för att unikt identifiera varje asynkron läsoperation |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona läsoperationen

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
