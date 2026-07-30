---
title: "Méthode System::Net::WebRequest::EndGetResponse"
linktitle: "EndGetResponse"
second_title: "Aspose.Font pour C++"
description: "System::Net::WebRequest::EndGetResponse méthode. Attend jusqu'à ce que la requête asynchrone spécifiée pour la ressource se termine en C++."
type: docs
weight: 1300
url: /fr/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Attend que la requête asynchrone spécifiée pour la ressource se termine.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une requête asynchrone pour la ressource. |

### ReturnValue

La réponse web.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
