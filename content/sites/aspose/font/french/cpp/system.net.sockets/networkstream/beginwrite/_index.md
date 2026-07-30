---
title: "System::Net::Sockets::NetworkStream::BeginWrite méthode"
linktitle: "BeginWrite"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::Sockets::NetworkStream::BeginWrite. Initialise une opération d'écriture asynchrone en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Initie une opération d'écriture asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Un tampon contenant les données à écrire. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à écrire. |
| rappel | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération d'écriture asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération d'écriture asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
