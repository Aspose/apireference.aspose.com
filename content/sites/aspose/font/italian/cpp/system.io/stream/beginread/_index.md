---
title: "Metodo System::IO::Stream::BeginRead"
linktitle: "BeginRead"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::Stream::BeginRead. Avvia un'operazione di lettura asincrona in C++."
type: docs
weight: 100
url: /it/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Avvia un'operazione di lettura asincrona.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Un buffer in cui leggere |
| offset | int | Un offset basato su zero in **buffer** che indica la posizione da cui iniziare a scrivere i dati letti. |
| count | int | Il numero di byte da leggere |
| callback | System::AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stato | System::SharedPtr\<System::Object\> | Dati forniti dall'utente usati per identificare in modo univoco ogni operazione di lettura asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di lettura asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
