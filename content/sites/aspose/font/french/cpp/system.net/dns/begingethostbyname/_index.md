---
title: "System::Net::Dns::BeginGetHostByName méthode"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Font pour C++"
description: "System::Net::Dns::BeginGetHostByName méthode. Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant le nom d'hôte spécifié en C++."
type: docs
weight: 200
url: /fr/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant le nom d'hôte spécifié.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hostName | String | Un nom d'hôte. |
| rappelRequête | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| stateObject | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
