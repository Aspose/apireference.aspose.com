---
title: "System::Net::Sockets::UdpClient::Connect metodo"
linktitle: "Connect"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::UdpClient::Connect metodo. Stabilisce una connessione alla porta specificata sull'host specificato in C++."
type: docs
weight: 300
url: /it/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


Stabilisce una connessione alla porta specificata sull'host specificato.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome host | String | Il nome dell'host DNS remoto a cui si intende connettersi. |
| porta | int32_t | Il numero di porta locale da cui intendi comunicare. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


Stabilisce una connessione con l'host all'indirizzo specificato sulla porta specificata.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | L'[IPAddress](../../../system.net/ipaddress/) dell'host remoto a cui inviare i dati. |
| porta | int32_t | Il numero di porta locale da cui intendi comunicare. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


Stabilisce una connessione a un endpoint remoto.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | il punto finale a cui associare la connessione UDP. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
