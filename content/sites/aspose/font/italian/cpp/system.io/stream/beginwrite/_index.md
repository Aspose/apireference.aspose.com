---
title: "System::IO::Stream::BeginWrite metodo"
linktitle: "BeginWrite"
second_title: "Aspose.Font per C++"
description: "System::IO::Stream::BeginWrite metodo. Avvia un'operazione di scrittura asincrona in C++."
type: docs
weight: 200
url: /it/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Avvia un'operazione di scrittura asincrona.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Un buffer contenente i dati da scrivere |
| offset | int | Un offset basato su zero in **buffer** che indica la posizione da cui iniziano i dati da scrivere |
| count | int | Il numero di byte da scrivere |
| callback | System::AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stato | System::SharedPtr\<System::Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di scrittura asincrona |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di scrittura asincrona avviata

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
