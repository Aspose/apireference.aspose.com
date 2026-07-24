---
title: "System::Net::Sockets::TcpClient::BeginConnect メソッド"
linktitle: "BeginConnect"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpClient::BeginConnect メソッド。C++ で非同期接続操作を開始します。"
type: docs
weight: 300
url: /ja/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


非同期の接続操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | String | リモートホスト名。 |
| ポート | int32_t | リモートホストのポート。 |
| requestCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期接続操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期接続操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


非同期の接続操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | リモートホストの IP アドレス。 |
| ポート | int32_t | リモートホストのポート。 |
| requestCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期接続操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期接続操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


非同期の接続操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| アドレス | System::SharedPtr\<IPAddress\> | リモートホストの IP アドレス。 |
| ポート | int32_t | リモートホストのポート。 |
| requestCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期接続操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期接続操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
