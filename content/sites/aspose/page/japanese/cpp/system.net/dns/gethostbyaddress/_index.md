---
title: "System::Net::Dns::GetHostByAddress メソッド"
linktitle: "GetHostByAddress"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::GetHostByAddress メソッド。指定された IP アドレスの文字列表現を使用して新しい IPHostEntry クラスのインスタンスを作成します（C++）。"
type: docs
weight: 1000
url: /ja/cpp/system.net/dns/gethostbyaddress/
---
## Dns::GetHostByAddress(String) method


指定されたIPアドレスの文字列表現を使用して、新しい IPHostEntry-class インスタンスを作成します。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostByAddress(String address)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| アドレス | String | IP アドレスの文字列表現です。 |

### ReturnValue

新しく作成された IPHostEntry-class インスタンスです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [String](../../../system/string/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## Dns::GetHostByAddress(System::SharedPtr\<IPAddress\>) method


指定されたIPアドレスを使用して、新しい IPHostEntry-class インスタンスを作成します。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostByAddress(System::SharedPtr<IPAddress> address)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| アドレス | System::SharedPtr\<IPAddress\> | IPアドレスです。 |

### ReturnValue

新しく作成された IPHostEntry-class インスタンスです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IPAddress](../../ipaddress/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
