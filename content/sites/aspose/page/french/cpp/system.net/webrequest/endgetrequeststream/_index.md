---
title: "System::Net::WebRequest::EndGetRequestStream méthode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page pour C++"
description: "System::Net::WebRequest::EndGetRequestStream méthode. Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine en C++."
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
* Library [Aspose.Page for C++](../../../)
