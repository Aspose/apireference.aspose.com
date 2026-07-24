---
title: "System::Net::Dns::EndGetHostAddresses methode"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page voor C++"
description: "System::Net::Dns::EndGetHostAddresses methode. Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑object te maken voltooid is in C++."
type: docs
weight: 500
url: /nl/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken voltooid is.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone bewerking vertegenwoordigt. |

### ReturnValue

Een nieuw aangemaakt IPHostEntry-class‑object.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
