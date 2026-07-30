---
title: "System::Net::Sockets::NetworkStream::BeginRead méthode"
linktitle: "BeginRead"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::NetworkStream::BeginRead méthode. Lance une opération de lecture asynchrone en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Initie une opération de lecture asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les octets lus seront écrits. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à lire. |
| rappel | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| état | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de lecture asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de lecture asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
