---
title: "System::Net::Security::SslStream::EndRead method"
linktitle: "EndRead"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::SslStream::EndRead method. Attende fino al completamento dell'operazione di lettura asincrona specificata in C++."
type: docs
weight: 700
url: /it/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Attende finché l'operazione di lettura asincrona specificata non è completata.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di lettura asincrona |

### ReturnValue

Il numero di byte letti durante l'operazione di lettura rappresentata da **asyncResult**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
