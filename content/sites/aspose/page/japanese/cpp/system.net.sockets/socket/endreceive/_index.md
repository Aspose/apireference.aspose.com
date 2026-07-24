---
title: "System::Net::Sockets::Socket::EndReceive メソッド"
linktitle: "EndReceive"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::EndReceive メソッド。指定された非同期受信操作が C++ で完了するまで待機します。"
type: docs
weight: 1500
url: /ja/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


指定された非同期受信操作が完了するまで待機します。

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期受信操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |

### ReturnValue

受信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


指定された非同期受信操作が完了するまで待機します。

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期受信操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |
| errorCode | SocketError\& | 受信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

受信したバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
