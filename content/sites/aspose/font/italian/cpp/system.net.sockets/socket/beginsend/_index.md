---
title: "System::Net::Sockets::Socket::BeginSend metodo"
linktitle: "BeginSend"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::BeginSend metodo. Avvia un'operazione di invio asincrona in C++."
type: docs
weight: 900
url: /it/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Avvia un'operazione di invio asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Un buffer da cui leggere i dati. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |
| callback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di invio asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di invio asincrona avviata.

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
