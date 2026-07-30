---
title: "System::Net::FileWebRequest::BeginGetResponse méthode"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font pour C++"
description: "System::Net::FileWebRequest::BeginGetResponse méthode. Initie une requête asynchrone pour la ressource en C++."
type: docs
weight: 400
url: /fr/cpp/system.net/filewebrequest/begingetresponse/
---
## FileWebRequest::BeginGetResponse method


Initie une requête asynchrone pour la ressource.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
