---
title: "System::Net::Sockets::TcpClient::Connect メソッド"
linktitle: "Connect"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpClient::Connect メソッド。指定されたリモートホストへの接続を確立します（C++）。"
type: docs
weight: 500
url: /ja/cpp/system.net.sockets/tcpclient/connect/
---
## TcpClient::Connect(String, int32_t) method


指定されたリモートホストへの接続を確立します。

```cpp
void System::Net::Sockets::TcpClient::Connect(String hostname, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ホスト名 | String | 接続先のリモートホスト名。 |
| ポート | int32_t | 接続先リモートホストのポート。 |

## 参照

* Class [String](../../../system/string/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) method


指定されたリモートホストへの接続を確立します。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::ArrayPtr<System::SharedPtr<IPAddress>> ipAddresses, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ipAddresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | リモートホストの IP アドレス。 |
| ポート | int32_t | 接続先リモートホストのポート。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


指定されたリモートホストへの接続を確立します。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::SharedPtr<IPAddress> address, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| アドレス | System::SharedPtr\<IPAddress\> | リモートホストの IP アドレス。 |
| ポート | int32_t | 接続先リモートホストのポート。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


指定されたリモートホストへの接続を確立します。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::SharedPtr<IPEndPoint> remoteEP)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\> | 接続先のリモートホスト。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
