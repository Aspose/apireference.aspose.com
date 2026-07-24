---
title: "System::Net::WebRequest::BeginGetResponse metod"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page för C++"
description: "System::Net::WebRequest::BeginGetResponse metod. Initierar en asynkron begäran om resursen i C++."
type: docs
weight: 1100
url: /sv/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Initierar en asynkron begäran om resursen.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
