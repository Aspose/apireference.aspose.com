---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom メソッド"
linktitle: "ReceiveMessageFrom"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom メソッド。指定されたエンドポイントからデータを受信し、C++ の指定されたバイト配列に書き込みます。"
type: docs
weight: 4500
url: /ja/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags\& | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |
| ipPacketInformation | IPPacketInformation\& | パケット情報が割り当てられる出力パラメータです。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags\& | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |
| ipPacketInformation | IPPacketInformation\& | パケット情報が割り当てられる出力パラメータです。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags\& | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |
| ipPacketInformation | IPPacketInformation\& | パケット情報が割り当てられる出力パラメータです。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
