---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket metodo"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket metodo. Avvia un'operazione di accettazione asincrona in C++."
type: docs
weight: 500
url: /it/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


Avvia un'operazione di accept asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | AsyncCallback | Un callback che verrà chiamato quando l'operazione è completata. |
| state | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di connessione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di accettazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
