---
title: "System::Net::IPEndPoint::Create メソッド"
linktitle: "作成"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IPEndPoint::Create メソッド。C++ で指定されたソケットアドレスを使用して EndPoint クラスの新しいインスタンスを作成します。"
type: docs
weight: 200
url: /ja/cpp/system.net/ipendpoint/create/
---
## IPEndPoint::Create method


指定されたソケットアドレスを使用して [EndPoint](../../endpoint/) クラスの新しいインスタンスを作成します。

```cpp
System::SharedPtr<EndPoint> System::Net::IPEndPoint::Create(System::SharedPtr<SocketAddress> socketAddress) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| socketAddress | System::SharedPtr\<SocketAddress\> | 新しいインスタンスを初期化するために使用されるソケットアドレスです。 |

### ReturnValue

新しく作成された EndPoint-class インスタンスです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../endpoint/)
* Class [SocketAddress](../../socketaddress/)
* Class [IPEndPoint](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
