---
title: "System::Net::Dns::BeginGetHostAddresses méthode"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font pour C++"
description: "System::Net::Dns::BeginGetHostAddresses méthode. Lance une opération asynchrone pour créer une nouvelle instance de la classe IPHostEntry en utilisant la chaîne spécifiée contenant un nom d'hôte ou une adresse IP en C++."
type: docs
weight: 100
url: /fr/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant la chaîne spécifiée qui contient un nom d'hôte ou une adresse IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hostNameOrAddress | String | Une chaîne qui contient un nom d'hôte ou une adresse IP. |
| rappelRequête | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération asynchrone. |

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
