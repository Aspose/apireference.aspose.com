---
title: "System::Net::Sockets::UdpClient::Send Methode"
linktitle: "Send"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::UdpClient::Send Methode. Sendet ein UDP-Datagramm an einen entfernten Host in C++."
type: docs
weight: 700
url: /de/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Sendet ein UDP-Datagramm an einen entfernten Host.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ein Array vom Typ [Byte](../../../system/byte/) zum Senden. |
| Bytes | int32_t | Die Anzahl der Bytes im Datagramm. |

### ReturnValue

Die Anzahl der Bytes, die gesendet werden.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Sendet ein UDP-Datagramm an den angegebenen Port auf dem angegebenen entfernten Host.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ein Array vom Typ [Byte](../../../system/byte/) zum Senden |
| Bytes | int32_t | Die Anzahl der Bytes im Datagramm. |
| hostname | String | Ein Name des entfernten Hosts. |
| port | int32_t | Eine entfernte Portnummer. |

### ReturnValue

Die Anzahl der Bytes, die gesendet werden.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Sendet ein UDP-Datagramm an den Host am entfernten Endpunkt.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ein Array vom Typ [Byte](../../../system/byte/) zum Senden |
| Bytes | int32_t | Die Anzahl der Bytes im Datagramm. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Ein [IPEndPoint](../../../system.net/ipendpoint/), das den Host und den Port darstellt, an den das Datagramm gesendet werden soll. |

### ReturnValue

Die Anzahl der Bytes, die gesendet werden.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
