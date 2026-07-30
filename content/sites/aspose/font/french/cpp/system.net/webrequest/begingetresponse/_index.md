---
title: "Méthode System::Net::WebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::WebRequest::BeginGetResponse. Initialise une requête asynchrone pour la ressource en C++."
type: docs
weight: 1100
url: /fr/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Initie une requête asynchrone pour la ressource.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
