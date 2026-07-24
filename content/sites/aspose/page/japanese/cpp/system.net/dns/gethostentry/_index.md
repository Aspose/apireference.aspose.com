---
title: "System::Net::Dns::GetHostEntry メソッド"
linktitle: "GetHostEntry"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::GetHostEntry メソッド。指定された文字列（ホスト名または IP アドレスを含む）を使用して C++ で新しい IPHostEntry クラスのインスタンスを作成します。"
type: docs
weight: 1200
url: /ja/cpp/system.net/dns/gethostentry/
---
## Dns::GetHostEntry(String) method


指定されたホスト名またはIPアドレスを含む文字列を使用して、新しい IPHostEntry-class インスタンスを作成します。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(String hostNameOrAddress)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| hostNameOrAddress | String | ホスト名またはIPアドレスを含む文字列です。 |

### ReturnValue

新しく作成された IPHostEntry-class インスタンスです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [String](../../../system/string/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## Dns::GetHostEntry(System::SharedPtr\<IPAddress\>) method


指定されたIPアドレスを使用して、新しい IPHostEntry-class インスタンスを作成します。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(System::SharedPtr<IPAddress> address)
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
