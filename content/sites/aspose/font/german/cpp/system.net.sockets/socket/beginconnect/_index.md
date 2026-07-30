---
title: "System::Net::Sockets::Socket::BeginConnect method"
linktitle: "BeginConnect"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::BeginConnect-Methode. Startet einen asynchronen Verbindungsaufbau in C++."
type: docs
weight: 700
url: /de/cpp/system.net.sockets/socket/beginconnect/
---
## Socket::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Startet einen asynchronen Verbindungsaufbau.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| host | String | Der Name des entfernten Hosts. |
| port | int32_t | Die Portnummer des entfernten Hosts. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Verbindungsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Verbindungsoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Startet einen asynchronen Verbindungsaufbau.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Die IP-Adressen des entfernten Hosts. |
| port | int32_t | Die Portnummer des entfernten Hosts. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Verbindungsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Verbindungsoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) method


Startet einen asynchronen Verbindungsaufbau.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<EndPoint> remoteEP, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Verbindungsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Verbindungsoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [EndPoint](../../../system.net/endpoint/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Startet einen asynchronen Verbindungsaufbau.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| address | System::SharedPtr\<IPAddress\> | Die IP-Adresse des entfernten Hosts. |
| port | int32_t | Die Portnummer des entfernten Hosts. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Verbindungsoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Verbindungsoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
