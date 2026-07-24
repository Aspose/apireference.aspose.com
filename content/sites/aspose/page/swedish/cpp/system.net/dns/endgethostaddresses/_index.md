---
title: "System::Net::Dns::EndGetHostAddresses-metoden"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page för C++"
description: "System::Net::Dns::EndGetHostAddresses-metoden. Väntar tills den angivna asynkrona operationen för att skapa en ny IPHostEntry-class-instans slutförs i C++."
type: docs
weight: 500
url: /sv/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Väntar tills den angivna asynkrona operationen för att skapa en ny IPHostEntry-class-instans är klar.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar en asynkron operation. |

### ReturnValue

En nyinstans av IPHostEntry-class.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
