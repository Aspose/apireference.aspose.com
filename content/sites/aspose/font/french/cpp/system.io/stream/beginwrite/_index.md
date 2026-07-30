---
title: "Méthode System::IO::Stream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::Stream::BeginWrite. Initialise une opération d'écriture asynchrone en C++."
type: docs
weight: 200
url: /fr/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Initie une opération d'écriture asynchrone.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Un tampon contenant les données à écrire |
| décalage | int | Un décalage à base zéro dans **buffer** indiquant la position à partir de laquelle les données à écrire commencent. |
| count | int | Le nombre d'octets à écrire |
| rappel | System::AsyncCallback | Un callback à appeler lorsque l'opération se termine |
| état | System::SharedPtr\<System::Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération d'écriture asynchrone |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération d'écriture asynchrone initiée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
