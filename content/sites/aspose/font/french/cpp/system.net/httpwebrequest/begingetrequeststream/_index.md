---
title: "System::Net::HttpWebRequest::BeginGetRequestStream méthode"
linktitle: "CommencerObtenirFluxDeRequête"
second_title: "Aspose.Font pour C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream méthode. Initialise une opération asynchrone pour obtenir un flux afin d'écrire des données vers la ressource en C++."
type: docs
weight: 400
url: /fr/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Initie une opération asynchrone pour obtenir un flux afin d'écrire des données vers la ressource.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
