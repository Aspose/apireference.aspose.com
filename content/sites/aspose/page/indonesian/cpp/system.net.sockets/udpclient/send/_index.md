---
title: "Metode System::Net::Sockets::UdpClient::Send"
linktitle: "Kirim"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Sockets::UdpClient::Send. Mengirim datagram UDP ke host remote dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Mengirim datagram UDP ke host remote.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Sebuah array bertipe [Byte](../../../system/byte/) untuk dikirim. |
| byte | int32_t | Jumlah byte dalam datagram. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Mengirim datagram UDP ke port yang ditentukan pada host remote yang ditentukan.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Sebuah array bertipe [Byte](../../../system/byte/) untuk dikirim |
| byte | int32_t | Jumlah byte dalam datagram. |
| nama host | String | Nama host remote. |
| port | int32_t | Nomor port remote. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Mengirim datagram UDP ke host pada titik akhir remote.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Sebuah array bertipe [Byte](../../../system/byte/) untuk dikirim |
| byte | int32_t | Jumlah byte dalam datagram. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Sebuah [IPEndPoint](../../../system.net/ipendpoint/) yang mewakili host dan port yang akan dikirimkan datagram. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
