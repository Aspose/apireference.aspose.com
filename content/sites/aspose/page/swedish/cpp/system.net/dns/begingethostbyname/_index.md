---
title: "System::Net::Dns::BeginGetHostByName-metoden"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page för C++"
description: "System::Net::Dns::BeginGetHostByName-metoden. Initierar en asynkron operation för att skapa en ny IPHostEntry-class-instans med det angivna värdnamnet i C++."
type: docs
weight: 200
url: /sv/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Initierar en asynkron operation för att skapa en ny IPHostEntry-class-instans med det angivna värdnamnet.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| hostName | String | Ett värdnamn. |
| requestCallback | AsyncCallback | En återuppringning som ska anropas när operationen är klar. |
| stateObject | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron operation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona operationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
