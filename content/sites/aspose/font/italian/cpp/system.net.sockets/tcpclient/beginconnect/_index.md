---
title: "System::Net::Sockets::TcpClient::BeginConnect method"
linktitle: "BeginConnect"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::TcpClient::BeginConnect method. Avvia un'operazione di connessione asincrona in C++."
type: docs
weight: 300
url: /it/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Avvia un'operazione di connessione asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Stringa | Il nome di un host remoto. |
| porta | int32_t | Una porta dell'host remoto. |
| requestCallback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di connessione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di connessione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Avvia un'operazione di connessione asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Gli indirizzi IP di un host remoto. |
| porta | int32_t | Una porta dell'host remoto. |
| requestCallback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di connessione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di connessione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Avvia un'operazione di connessione asincrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indirizzo | System::SharedPtr\<IPAddress\> | L'indirizzo IP di un host remoto. |
| porta | int32_t | Una porta dell'host remoto. |
| requestCallback | AsyncCallback | Una callback che verrà chiamata quando l'operazione è completata. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione di connessione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione di connessione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
