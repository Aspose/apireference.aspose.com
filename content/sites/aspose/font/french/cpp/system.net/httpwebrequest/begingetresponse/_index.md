---
title: "System::Net::HttpWebRequest::BeginGetResponse méthode"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font pour C++"
description: "System::Net::HttpWebRequest::BeginGetResponse méthode. Initialise une requête asynchrone pour la ressource en C++."
type: docs
weight: 500
url: /fr/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


Initie une requête asynchrone pour la ressource.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
