---
title: "Metodo System::Net::Sockets::NetworkStream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite metodo. Avvia un'operazione di scrittura asincrona in C++."
type: docs
weight: 400
url: /it/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Avvia un'operazione di scrittura asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Un buffer contenente i dati da scrivere. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da scrivere. |
| callback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di scrittura asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di scrittura asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
