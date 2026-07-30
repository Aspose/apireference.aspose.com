---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket method"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket method. Avvia un'operazione di accettazione asincrona in C++."
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
| callback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di connessione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di accettazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
