---
title: "System::Net::HttpWebRequest::BeginGetRequestStream metod"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page för C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream metod. Initierar en asynkron operation för att hämta en ström för att skriva data till resursen i C++."
type: docs
weight: 400
url: /sv/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Initierar en asynkron operation för att hämta en ström för att skriva data till resursen.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
