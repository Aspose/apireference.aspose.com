---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket-Methode"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket-Methode. Initiert eine asynchrone Akzeptieroperation in C++."
type: docs
weight: 500
url: /de/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


Startet einen asynchronen Accept‑Vorgang.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Verbindungsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)‑Objekt, das die initiierte asynchrone Annahmeoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
