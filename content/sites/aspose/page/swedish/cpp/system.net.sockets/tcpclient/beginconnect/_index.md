---
title: "System::Net::Sockets::TcpClient::BeginConnect metod"
linktitle: "BeginConnect"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::TcpClient::BeginConnect metod. Initierar en asynkron anslutningsoperation i C++."
type: docs
weight: 300
url: /sv/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initierar en asynkron anslutningsoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| host | String | Ett fjärrvärdsnamn. |
| port | int32_t | En port på fjärrvärden. |
| requestCallback | AsyncCallback | En återanrop som kommer att anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron anslutningsoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona anslutningsoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initierar en asynkron anslutningsoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | IP-adresserna för en fjärrvärd. |
| port | int32_t | En port på fjärrvärden. |
| requestCallback | AsyncCallback | En återanrop som kommer att anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron anslutningsoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona anslutningsoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Initierar en asynkron anslutningsoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| adress | System::SharedPtr\<IPAddress\> | IP-adressen för en fjärrvärd. |
| port | int32_t | En port på fjärrvärden. |
| requestCallback | AsyncCallback | En återanrop som kommer att anropas när operationen är klar. |
| tillstånd | System::SharedPtr\<Object\> | Användarlevererade data som används för att unikt identifiera varje asynkron anslutningsoperation. |

### ReturnValue

Ett [IAsyncResult](../../../system/iasyncresult/)‑objekt som representerar den initierade asynkrona anslutningsoperationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
