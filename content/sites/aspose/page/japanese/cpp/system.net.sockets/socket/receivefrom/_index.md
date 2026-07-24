---
title: "System::Net::Sockets::Socket::ReceiveFrom メソッド"
linktitle: "ReceiveFrom"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::ReceiveFrom メソッド。指定されたエンドポイントからデータを受信し、C++ で指定されたバイト配列に書き込みます。"
type: docs
weight: 4400
url: /ja/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | リモートエンドポイント。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
