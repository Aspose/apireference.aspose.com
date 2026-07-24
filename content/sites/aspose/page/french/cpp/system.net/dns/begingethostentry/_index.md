---
title: "Méthode System::Net::Dns::BeginGetHostEntry"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Net::Dns::BeginGetHostEntry. Lance une opération asynchrone pour créer une nouvelle instance de la classe IPHostEntry en utilisant la chaîne spécifiée contenant un nom d'hôte ou une adresse IP en C++."
type: docs
weight: 300
url: /fr/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Initie une opération asynchrone pour créer une nouvelle instance de IPHostEntry-class en utilisant la chaîne spécifiée qui contient un nom d'hôte ou une adresse IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hostNameOrAddress | String | La chaîne qui contient un nom d'hôte ou une adresse IP. |
| requestCallback | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
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
* Library [Aspose.Page for C++](../../../)
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Initie une opération asynchrone pour créer une nouvelle instance de IPHostEntry-class en utilisant l'adresse IP spécifiée.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| adresse | System::SharedPtr\<IPAddress\> | L'adresse IP. |
| requestCallback | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| stateObject | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
