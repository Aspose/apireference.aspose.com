---
title: "Méthode System::Net::WebRequest::EndGetRequestStream"
linktitle: "TerminerObtenirFluxDeRequête"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::WebRequest::EndGetRequestStream. Attend que l’opération asynchrone spécifiée pour obtenir un flux se termine en C++."
type: docs
weight: 1200
url: /fr/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
