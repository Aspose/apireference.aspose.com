---
title: "System::Net::Security::SslStream::EndRead méthode"
linktitle: "EndRead"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::SslStream::EndRead méthode. Attend jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération de lecture asynchrone |

### ReturnValue

Le nombre d'octets lus pendant l'opération de lecture représentée par **asyncResult**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
