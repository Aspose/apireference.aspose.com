---
title: "System::Net::Sockets::Socket::BeginReceive metodo"
linktitle: "BeginReceive"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::BeginReceive metodo. Avvia un'operazione di scrittura asincrona in C++."
type: docs
weight: 800
url: /it/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Avvia un'operazione di scrittura asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Un buffer dove verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| callback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di ricezione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di ricezione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
