---
title: "System::Net::Sockets::NetworkStream::EndRead méthode"
linktitle: "EndRead"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::NetworkStream::EndRead méthode. Attend que l'opération de lecture asynchrone spécifiée se termine en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération de lecture asynchrone |

### ReturnValue

Le nombre d'octets lus pendant l'opération de lecture représentée par **asyncResult**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
