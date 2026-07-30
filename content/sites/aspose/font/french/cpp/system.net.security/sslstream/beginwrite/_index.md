---
title: "Méthode System::Net::Security::SslStream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::Security::SslStream::BeginWrite. Initialise une opération d'écriture asynchrone en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Initie une opération d'écriture asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où écrire les données. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| count | int32_t | Le nombre d'octets à écrire. |
| asyncCallback | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| asyncState | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération d'écriture asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération d'écriture asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
