---
title: "System::Net::Sockets::Socket::Receive メソッド"
linktitle: "受信"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::Receive メソッド。ソケットからデータを受信し、C++ で指定されたバイト配列に書き込みます。"
type: docs
weight: 4300
url: /ja/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| errorCode | SocketError\& | 受信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 受信するバイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |

### ReturnValue

受信したバイト数。

## 参照

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| errorCode | SocketError\& | 受信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 受信するバイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |

### ReturnValue

受信したバイト数。

## 参照

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 'offset' インデックスから指定されたバイト配列に割り当てられる受信バイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |
| errorCode | SocketError\& | 受信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| size | int32_t | 受信するバイト数。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の動作。 |

### ReturnValue

受信したバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


ソケットからデータを受信し、指定されたバイト配列群に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 受信したデータが割り当てられるバイト配列。 |

### ReturnValue

受信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


ソケットからデータを受信し、指定されたバイト配列群に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の振る舞い。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


ソケットからデータを受信し、指定されたバイト配列群に書き込みます。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 受信したデータが割り当てられるバイト配列。 |
| socketFlags | SocketFlags | 受信の振る舞い。 |
| errorCode | SocketError\& | 受信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
