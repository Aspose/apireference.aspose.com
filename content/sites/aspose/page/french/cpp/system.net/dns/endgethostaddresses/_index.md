---
title: "Méthode System::Net::Dns::EndGetHostAddresses"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Net::Dns::EndGetHostAddresses. Attend que l'opération asynchrone spécifiée pour créer une nouvelle instance de la classe IPHostEntry se termine en C++."
type: docs
weight: 500
url: /fr/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Attend que l'opération asynchrone spécifiée pour créer une nouvelle instance de IPHostEntry-class se termine.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération asynchrone. |

### ReturnValue

Une instance nouvellement créée de la classe IPHostEntry.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
