---
title: "System::Net::Security::SslStream::BeginRead method"
linktitle: "BeginRead"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::SslStream::BeginRead method. Avvia un'operazione di lettura asincrona in C++."
type: docs
weight: 300
url: /it/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Avvia un'operazione di lettura asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte da cui leggere i dati. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| count | int32_t | Il numero di byte da leggere. |
| asyncCallback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| asyncState | System::SharedPtr\<Object\> | Dati forniti dall'utente usati per identificare univocamente ogni operazione di lettura asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di lettura asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
