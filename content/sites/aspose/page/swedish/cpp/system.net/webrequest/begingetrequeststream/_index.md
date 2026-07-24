---
title: "System::Net::WebRequest::BeginGetRequestStream‑metoden"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page för C++"
description: "System::Net::WebRequest::BeginGetRequestStream‑metoden. Initierar en asynkron operation för att hämta en ström för att skriva data till resursen i C++."
type: docs
weight: 1000
url: /sv/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


Initierar en asynkron operation för att hämta en ström för att skriva data till resursen.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | AsyncCallback | En återuppringning som ska anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron operation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona operationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
