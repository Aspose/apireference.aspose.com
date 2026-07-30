---
title: "Méthode System::Net::Dns::EndResolve"
linktitle: "EndResolve"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::Dns::EndResolve. Attend que l'opération asynchrone spécifiée pour créer une nouvelle instance de la classe IPHostEntry se termine en C++."
type: docs
weight: 800
url: /fr/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération asynchrone. |

### ReturnValue

Une instance IPHostEntry-class nouvellement créée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
