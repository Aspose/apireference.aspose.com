---
title: "System::Net::Sockets::Socket::BeginReceive méthode"
linktitle: "BeginReceive"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::BeginReceive méthode. Initialise une opération d'écriture asynchrone en C++."
type: docs
weight: 800
url: /fr/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Initie une opération d'écriture asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Un tampon où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |
| rappel | AsyncCallback | Un callback qui sera appelé lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de réception asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de réception asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
