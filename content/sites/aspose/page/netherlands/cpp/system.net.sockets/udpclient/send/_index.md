---
title: "System::Net::Sockets::UdpClient::Send-methode"
linktitle: "Verzenden"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::UdpClient::Send-methode. Stuur een UDP-datagram naar een externe host in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Verzendt een UDP‑datagram naar een externe host.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Een array van het type [Byte](../../../system/byte/) om te verzenden. |
| bytes | int32_t | Het aantal bytes in het datagram. |

### ReturnValue

Het aantal bytes dat wordt verzonden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Verzendt een UDP‑datagram naar de opgegeven poort op de opgegeven externe host.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Een array van het type [Byte](../../../system/byte/) om te verzenden |
| bytes | int32_t | Het aantal bytes in het datagram. |
| hostnaam | String | Een naam van de externe host. |
| port | int32_t | Een extern poortnummer. |

### ReturnValue

Het aantal bytes dat wordt verzonden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Verzendt een UDP‑datagram naar de host op het externe eindpunt.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Een array van het type [Byte](../../../system/byte/) om te verzenden |
| bytes | int32_t | Het aantal bytes in het datagram. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Een [IPEndPoint](../../../system.net/ipendpoint/) dat de host en poort vertegenwoordigt waarnaar het datagram moet worden verzonden. |

### ReturnValue

Het aantal bytes dat wordt verzonden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
