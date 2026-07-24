---
title: "System::Net::FileWebRequest::EndGetRequestStream metod"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page för C++"
description: "System::Net::FileWebRequest::EndGetRequestStream metod. Väntar tills den specificerade asynkrona operationen för att hämta en ström slutförs i C++."
type: docs
weight: 500
url: /sv/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Väntar tills den angivna asynkrona operationen för att hämta en ström är klar.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ett [IAsyncResult](../../../system/iasyncresult/) objekt som representerar en asynkron operation för att hämta en ström. |

### ReturnValue

Strömmen för att skriva data till resursen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
