---
title: "Metodo System::Net::Sockets::UdpClient::Send"
linktitle: "Invia"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::Sockets::UdpClient::Send. Invia un datagramma UDP a un host remoto in C++."
type: docs
weight: 700
url: /it/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Invia un datagramma UDP a un host remoto.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un array di tipo [Byte](../../../system/byte/) da inviare. |
| byte | int32_t | Il numero di byte nel datagramma. |

### ReturnValue

Il numero di byte che vengono inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Invia un datagramma UDP alla porta specificata sull'host remoto specificato.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un array di tipo [Byte](../../../system/byte/) da inviare |
| byte | int32_t | Il numero di byte nel datagramma. |
| nome host | String | Un nome dell'host remoto. |
| porta | int32_t | Un numero di porta remoto. |

### ReturnValue

Il numero di byte che vengono inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Invia un datagramma UDP all'host all'endpoint remoto.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un array di tipo [Byte](../../../system/byte/) da inviare |
| byte | int32_t | Il numero di byte nel datagramma. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Un [IPEndPoint](../../../system.net/ipendpoint/) che rappresenta l'host e la porta a cui inviare il datagramma. |

### ReturnValue

Il numero di byte che vengono inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
