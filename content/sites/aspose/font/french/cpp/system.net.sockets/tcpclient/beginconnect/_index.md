---
title: "System::Net::Sockets::TcpClient::BeginConnect méthode"
linktitle: "DémarrerConnexion"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::TcpClient::BeginConnect méthode. Initialise une opération de connexion asynchrone en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initie une opération de connexion asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hôte | String | Un nom d'hôte distant. |
| port | int32_t | Un port de l'hôte distant. |
| rappelRequête | AsyncCallback | Un callback qui sera appelé lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de connexion asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de connexion asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initie une opération de connexion asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| adresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Les adresses IP d'un hôte distant. |
| port | int32_t | Un port de l'hôte distant. |
| rappelRequête | AsyncCallback | Un callback qui sera appelé lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de connexion asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de connexion asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initie une opération de connexion asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| adresse | System::SharedPtr\<IPAddress\> | L'adresse IP d'un hôte distant. |
| port | int32_t | Un port de l'hôte distant. |
| rappelRequête | AsyncCallback | Un callback qui sera appelé lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de connexion asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de connexion asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
