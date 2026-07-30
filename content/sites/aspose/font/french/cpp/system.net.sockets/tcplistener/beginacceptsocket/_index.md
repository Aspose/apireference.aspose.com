---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket méthode"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket méthode. Initialise une opération d'acceptation asynchrone en C++."
type: docs
weight: 500
url: /fr/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


Initie une opération d'acceptation asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | AsyncCallback | Un callback qui sera appelé lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de connexion asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération d'acceptation asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
