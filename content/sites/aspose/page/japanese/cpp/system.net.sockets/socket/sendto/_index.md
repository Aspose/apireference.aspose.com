---
title: "System::Net::Sockets::Socket::SendTo メソッド"
linktitle: "SendTo"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::SendTo メソッド。指定されたデータを指定されたエンドポイントに送信します（C++）。"
type: docs
weight: 4700
url: /ja/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| size | int32_t | 指定された配列のバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| size | int32_t | 指定された配列のバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| size | int32_t | 指定された配列のバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


指定されたデータを指定されたエンドポイントに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| remoteEP | System::SharedPtr\<EndPoint\> | リモートエンドポイント。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
