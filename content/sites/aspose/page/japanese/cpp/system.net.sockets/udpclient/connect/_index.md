---
title: "System::Net::Sockets::UdpClient::Connect method"
linktitle: "Connect"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Connect メソッド。指定されたホストの指定されたポートへの接続を C++ で確立します。"
type: docs
weight: 300
url: /ja/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


指定されたホストの指定ポートへの接続を確立します。

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ホスト名 | String | 接続しようとしているリモート DNS ホストの名前。 |
| ポート | int32_t | 通信しようとしているローカルポート番号です。 |

## 参照

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


指定されたアドレスと指定ポートのホストとの接続を確立します。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | データを送信するリモートホストの [IPAddress](../../../system.net/ipaddress/) です。 |
| ポート | int32_t | 通信しようとしているローカルポート番号です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


リモートエンドポイントへの接続を確立します。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | UDP 接続をバインドするエンドポイント。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
