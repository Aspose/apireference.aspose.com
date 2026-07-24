---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CookieCollection::InternalAdd メソッド。指定されたクッキーを C++ でコレクションに追加します。"
type: docs
weight: 1000
url: /ja/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


指定されたクッキーをコレクションに追加します。

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| クッキー | System::SharedPtr\<Cookie\> | 追加するクッキー。 |
| isStrict | bool | 指定されたクッキーが古いものを置き換える必要がある場合は true、そうでない場合は false です。 |

### ReturnValue

指定されたクッキーが古いものを置き換えた場合は 0、そうでない場合は 1 です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
