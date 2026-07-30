---
title: "System::IO::Stream::BeginRead méthode"
linktitle: "BeginRead"
second_title: "Aspose.Font pour C++"
description: "System::IO::Stream::BeginRead méthode. Initialise une opération de lecture asynchrone en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Initie une opération de lecture asynchrone.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Un tampon dans lequel lire |
| décalage | int | Un décalage basé sur 0 dans **buffer** indiquant la position à partir de laquelle commencer à écrire les données lues |
| count | int | Le nombre d'octets à lire |
| rappel | System::AsyncCallback | Un callback à appeler lorsque l'opération se termine |
| état | System::SharedPtr\<System::Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de lecture asynchrone |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de lecture asynchrone initiée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
