---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom metode"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom metode. Menerima data dari endpoint yang ditentukan dan menuliskannya ke byte array yang ditentukan dalam C++."
type: docs
weight: 4500
url: /id/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags\& | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |
| ipPacketInformation | IPPacketInformation\& | Parameter output di mana informasi tentang paket akan ditetapkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags\& | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |
| ipPacketInformation | IPPacketInformation\& | Parameter output di mana informasi tentang paket akan ditetapkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags\& | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |
| ipPacketInformation | IPPacketInformation\& | Parameter output di mana informasi tentang paket akan ditetapkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
