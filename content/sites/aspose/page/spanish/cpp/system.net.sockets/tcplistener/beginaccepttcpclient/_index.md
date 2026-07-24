---
title: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient método"
linktitle: "BeginAcceptTcpClient"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient método. Inicia una operación de aceptación asíncrona en C++."
type: docs
weight: 600
url: /es/cpp/system.net.sockets/tcplistener/beginaccepttcpclient/
---
## TcpListener::BeginAcceptTcpClient method


Inicia una operación de aceptación asíncrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptTcpClient(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| callback | AsyncCallback | Un callback que será llamado cuando la operación se complete. |
| estado | System::SharedPtr\<Object\> | Datos proporcionados por el usuario utilizados para identificar de forma única cada operación de conexión asíncrona. |

### ReturnValue

Un [IAsyncResult](../../../system/iasyncresult/) objeto que representa la operación de aceptación asíncrona iniciada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
