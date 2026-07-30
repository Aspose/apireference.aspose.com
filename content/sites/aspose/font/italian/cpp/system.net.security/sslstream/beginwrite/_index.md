---
title: "System::Net::Security::SslStream::BeginWrite metodo"
linktitle: "BeginWrite"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::SslStream::BeginWrite metodo. Avvia un'operazione di scrittura asincrona in C++."
type: docs
weight: 400
url: /it/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Avvia un'operazione di scrittura asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui scrivere i dati. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| count | int32_t | Il numero di byte da scrivere. |
| asyncCallback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| asyncState | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di scrittura asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di scrittura asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
