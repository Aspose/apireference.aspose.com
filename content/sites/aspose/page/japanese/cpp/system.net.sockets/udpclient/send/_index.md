---
title: "System::Net::Sockets::UdpClient::Send メソッド"
linktitle: "送信"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Send メソッド。C++ で UDP データグラムをリモート ホストに送信します。"
type: docs
weight: 700
url: /ja/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


リモートホストへ UDP データグラムを送信します。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 送信するための [Byte](../../../system/byte/) 型配列。 |
| バイト | int32_t | データグラム内のバイト数。 |

### ReturnValue

送信されるバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


指定されたリモートホストの指定ポートへ UDP データグラムを送信します。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 送信するための [Byte](../../../system/byte/) 型配列 |
| バイト | int32_t | データグラム内のバイト数。 |
| ホスト名 | String | リモート ホストの名前。 |
| ポート | int32_t | リモート ポート番号。 |

### ReturnValue

送信されるバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


リモートエンドポイントのホストへ UDP データグラムを送信します。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 送信するための [Byte](../../../system/byte/) 型配列 |
| バイト | int32_t | データグラム内のバイト数。 |
| endPoint | System::SharedPtr\<IPEndPoint\> | データグラムを送信するホストとポートを表す [IPEndPoint](../../../system.net/ipendpoint/)。 |

### ReturnValue

送信されるバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
