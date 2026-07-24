---
title: "System::Net::Sockets::UdpClient::Connect metod"
linktitle: "Connect"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::UdpClient::Connect metod. Upprättar en anslutning till den angivna porten på den angivna värden i C++."
type: docs
weight: 300
url: /sv/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


Etablerar en anslutning till den angivna porten på den angivna värden.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| värdnamn | String | Namnet på den fjärr‑DNS‑värden som du avser att ansluta till. |
| port | int32_t | Det lokala portnumret från vilket du avser att kommunicera. |

## Se även

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


Etablerar en anslutning med värden på den angivna adressen på den angivna porten.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | Den [IPAddress](../../../system.net/ipaddress/) för den fjärrvärd till vilken data ska skickas. |
| port | int32_t | Det lokala portnumret från vilket du avser att kommunicera. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


Etablerar en anslutning till en fjärrslutpunkt.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| slutpunkt | System::SharedPtr\<IPEndPoint\> | slutpunkten som du binder UDP‑anslutningen till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
