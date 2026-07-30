---
title: "System::Net::Dns::EndGetHostAddresses méthode"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font pour C++"
description: "System::Net::Dns::EndGetHostAddresses méthode. Attend que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine en C++."
type: docs
weight: 500
url: /fr/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération asynchrone. |

### ReturnValue

Une instance IPHostEntry-class nouvellement créée.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
