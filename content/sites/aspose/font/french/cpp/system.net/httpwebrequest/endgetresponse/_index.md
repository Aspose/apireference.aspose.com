---
title: "System::Net::HttpWebRequest::EndGetResponse méthode"
linktitle: "EndGetResponse"
second_title: "Aspose.Font pour C++"
description: "System::Net::HttpWebRequest::EndGetResponse méthode. Attend que la requête asynchrone spécifiée pour la ressource se termine en C++."
type: docs
weight: 700
url: /fr/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Attend que la requête asynchrone spécifiée pour la ressource se termine.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
