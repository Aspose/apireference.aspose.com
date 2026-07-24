---
title: "System::Net::Sockets::UdpClient::Receive method"
linktitle: "受信"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Receive method. C++ でサーバーから送信されたデータグラムを返します。"
type: docs
weight: 600
url: /ja/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


サーバーから送信されたデータグラムを返します。

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | データが送信されたリモートホストを表す [IPEndPoint](../../../system.net/ipendpoint/) です。 |

### ReturnValue

受信データが割り当てられるバイト配列。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
