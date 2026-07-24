---
title: "System::Net::Sockets::Socket::EndSend メソッド"
linktitle: "EndSend"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::EndSend メソッド。指定された非同期送信操作が完了するまで待機します（C++）。"
type: docs
weight: 1600
url: /ja/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


指定された非同期送信操作が完了するまで待機します。

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期送信操作を表す[IAsyncResult](../../../system/iasyncresult/) オブジェクト。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


指定された非同期送信操作が完了するまで待機します。

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期送信操作を表す[IAsyncResult](../../../system/iasyncresult/) オブジェクト。 |
| errorCode | SocketError\& | 送信操作が失敗したときにエラーコードが割り当てられる出力パラメータ。 |

### ReturnValue

送信されたバイト数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
