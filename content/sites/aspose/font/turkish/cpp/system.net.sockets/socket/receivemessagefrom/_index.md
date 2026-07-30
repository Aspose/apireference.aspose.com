---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom method"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom method. Belirtilen uç noktadan veri alır ve C++'da belirtilen bayt dizisine yazar."
type: docs
weight: 4500
url: /tr/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags\& | Alma davranışı. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Uzak uç nokta. |
| ipPacketInformation | IPPacketInformation\& | Paket hakkında bilginin atanacağı çıktı parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags\& | Alma davranışı. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Uzak uç nokta. |
| ipPacketInformation | IPPacketInformation\& | Paket hakkında bilginin atanacağı çıktı parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags\& | Alma davranışı. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Uzak uç nokta. |
| ipPacketInformation | IPPacketInformation\& | Paket hakkında bilginin atanacağı çıktı parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
