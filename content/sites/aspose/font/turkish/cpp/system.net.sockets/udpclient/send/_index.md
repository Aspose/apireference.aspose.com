---
title: "System::Net::Sockets::UdpClient::Send metodu"
linktitle: "Gönder"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::UdpClient::Send metodu. C++'de bir UDP datagramını uzak bir ana bilgisayara gönderir."
type: docs
weight: 700
url: /tr/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Uzak bir ana bilgisayara bir UDP datagramı gönderir.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Gönderilecek bir [Byte](../../../system/byte/) türünde dizi. |
| bayt | int32_t | Datagramdaki bayt sayısı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Belirtilen uzak ana bilgisayardaki belirtilen bağlantı noktasına bir UDP datagramı gönderir.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Gönderilecek [Byte](../../../system/byte/) tipinde bir dizi |
| bayt | int32_t | Datagramdaki bayt sayısı. |
| ana bilgisayar adı | Dize | Uzak ana bilgisayarın adı. |
| bağlantı noktası | int32_t | Uzak bağlantı noktası numarası. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Uzak uç noktadaki ana bilgisayara bir UDP datagramı gönderir.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Gönderilecek [Byte](../../../system/byte/) tipinde bir dizi |
| bayt | int32_t | Datagramdaki bayt sayısı. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Datagramın gönderileceği ana bilgisayar ve bağlantı noktasını temsil eden bir [IPEndPoint](../../../system.net/ipendpoint/). |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
