---
title: "System::Net::Http::Headers::NameValueHeaderValue::Find メソッド"
linktitle: "検索"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue::Find メソッド。指定された名前でコレクション内の NameValueHeaderValue-class インスタンスを検索します（C++）。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/namevalueheadervalue/find/
---
## NameValueHeaderValue::Find method


指定された名前でコレクション内の NameValueHeaderValue クラスのインスタンスを検索します。

```cpp
static System::SharedPtr<NameValueHeaderValue> System::Net::Http::Headers::NameValueHeaderValue::Find(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| values | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue-class インスタンスのコレクション。 |
| name | String | 検索する名前。 |

### ReturnValue

見つかった場合の NameValueHeaderValue-class インスタンス、見つからない場合は nullptr。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [ObjectCollection](../../objectcollection/)
* Class [String](../../../system/string/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
