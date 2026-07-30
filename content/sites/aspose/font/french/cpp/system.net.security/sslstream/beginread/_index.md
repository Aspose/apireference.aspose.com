---
title: "System::Net::Security::SslStream::BeginRead méthode"
linktitle: "BeginRead"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::SslStream::BeginRead méthode. Lance une opération de lecture asynchrone en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Initie une opération de lecture asynchrone.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets à partir duquel lire les données. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| count | int32_t | Le nombre d'octets à lire. |
| asyncCallback | AsyncCallback | Un rappel à appeler lorsque l'opération se termine. |
| asyncState | System::SharedPtr\<Object\> | Données fournies par l'utilisateur utilisées pour identifier de manière unique chaque opération de lecture asynchrone. |

### ReturnValue

Un objet [IAsyncResult](../../../system/iasyncresult/) représentant l'opération de lecture asynchrone initiée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
