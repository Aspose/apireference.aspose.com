---
title: "System::IO::Stream::EndRead méthode"
linktitle: "EndRead"
second_title: "Aspose.Font pour C++"
description: "System::IO::Stream::EndRead méthode. Attend que l'opération de lecture asynchrone spécifiée se termine en C++."
type: docs
weight: 600
url: /fr/cpp/system.io/stream/endread/
---
## Stream::EndRead method


Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée.

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération de lecture asynchrone |

### ReturnValue

Le nombre d'octets lus pendant l'opération de lecture représentée par **asyncResult**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
