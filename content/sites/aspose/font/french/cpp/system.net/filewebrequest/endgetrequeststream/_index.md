---
title: "System::Net::FileWebRequest::EndGetRequestStream méthode"
linktitle: "TerminerObtenirFluxDeRequête"
second_title: "Aspose.Font pour C++"
description: "System::Net::FileWebRequest::EndGetRequestStream méthode. Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine en C++."
type: docs
weight: 500
url: /fr/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération asynchrone pour obtenir un flux. |

### ReturnValue

Le flux pour écrire des données vers la ressource.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
