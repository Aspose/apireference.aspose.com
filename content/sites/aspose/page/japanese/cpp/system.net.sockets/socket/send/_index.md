---
title: "System::Net::Sockets::Socket::Send メソッド"
linktitle: "送信"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::Send メソッド。C++ で指定されたデータをソケットに送信します。"
type: docs
weight: 4600
url: /ja/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| errorCode | SocketError\& | 送信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| size | int32_t | 指定されたデータから送信しなければならないバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| errorCode | SocketError\& | 送信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| size | int32_t | 指定されたデータから送信しなければならないバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::ArrayView\<uint8_t\> | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


指定されたデータをソケットに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


指定されたデータをソケットに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| errorCode | SocketError\& | 送信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| size | int32_t | 指定されたデータから送信しなければならないバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::Details::StackArray\<uint8_t, N\>\& | 送信するデータ。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | データを送信しなければならないバイト配列のコレクション。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | データを送信しなければならないバイト配列のコレクション。 |
| socketFlags | SocketFlags | 送信の動作。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


指定されたデータをソケットに送信します。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | データを送信しなければならないバイト配列のコレクション。 |
| socketFlags | SocketFlags | 送信の動作。 |
| errorCode | SocketError\& | 送信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
