---
title: "System::Net::Sockets::UdpClient::Connect Methode"
linktitle: "Connect"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::UdpClient::Connect Methode. Stellt eine Verbindung zum angegebenen Port am angegebenen Host in C++ her."
type: docs
weight: 300
url: /de/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


Stellt eine Verbindung zum angegebenen Port auf dem angegebenen Host her.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hostname | String | Der Name des entfernten DNS-Hosts, zu dem Sie sich verbinden möchten. |
| port | int32_t | Die lokale Portnummer, von der aus Sie kommunizieren möchten. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


Stellt eine Verbindung mit dem Host an der angegebenen Adresse und dem angegebenen Port her.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | Die [IPAddress](../../../system.net/ipaddress/) des entfernten Hosts, an den Daten gesendet werden sollen. |
| port | int32_t | Die lokale Portnummer, von der aus Sie kommunizieren möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


Stellt eine Verbindung zu einem entfernten Endpunkt her.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | der Endpunkt, an den Sie die UDP-Verbindung binden. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
