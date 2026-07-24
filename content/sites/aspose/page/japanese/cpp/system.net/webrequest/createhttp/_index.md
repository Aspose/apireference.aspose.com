---
title: "System::Net::WebRequest::CreateHttp メソッド"
linktitle: "CreateHttp"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest::CreateHttp メソッド。指定された URI を使用して C++ で WebRequest クラスの新しいインスタンスを作成します。"
type: docs
weight: 300
url: /ja/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


指定された URI を使用して [WebRequest](../) クラスの新しいインスタンスを作成します。

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| requestUriString | String | 新しい [WebRequest](../) クラスのインスタンスを作成するために使用される URI。 |

### ReturnValue

新しく作成された WebRequest クラスのインスタンスです。
## 備考



指定された URI が [http://](http://) または [https://](https://) 以外のスキームで始まる場合、NotSupportedException がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


指定された URI を使用して [WebRequest](../) クラスの新しいインスタンスを作成します。

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | 新しい [WebRequest](../) クラスのインスタンスを作成するために使用される URI。 |

### ReturnValue

新しく作成された WebRequest クラスのインスタンスです。
## 備考



指定された URI が [http://](http://) または [https://](https://) 以外のスキームで始まる場合、NotSupportedException がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
