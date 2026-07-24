---
title: "System::Net::Sockets::NetworkStream::BeginRead metodo"
linktitle: "BeginRead"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::NetworkStream::BeginRead metodo. Avvia un'operazione di lettura asincrona in C++."
type: docs
weight: 300
url: /it/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Avvia un'operazione di lettura asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte dove verranno scritti i byte letti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da leggere. |
| callback | AsyncCallback | Una callback da chiamare quando l'operazione è completata. |
| state | System::SharedPtr\<Object\> | Dati forniti dall'utente usati per identificare in modo univoco ogni operazione di lettura asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di lettura asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
