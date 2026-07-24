---
title: "System::Net::CookieCollection::idx_get メソッド"
linktitle: "idx_get"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CookieCollection::idx_get メソッド。C++ で指定されたインデックスのクッキーをクッキーコレクションから返します。"
type: docs
weight: 800
url: /ja/cpp/system.net/cookiecollection/idx_get/
---
## CookieCollection::idx_get(int32_t) method


指定されたインデックスのクッキーコレクションからクッキーを返します。

```cpp
System::SharedPtr<Cookie> System::Net::CookieCollection::idx_get(int32_t index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | 返す必要があるクッキーのインデックス。 |

### ReturnValue

指定されたインデックスのクッキー。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CookieCollection::idx_get(String) method


指定された名前でクッキーコレクションからクッキーを返します。

```cpp
System::SharedPtr<Cookie> System::Net::CookieCollection::idx_get(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 返す必要があるクッキーの名前。 |

### ReturnValue

指定された名前で見つかった場合はクッキーコレクションからクッキーを取得し、見つからない場合は nullptr を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [String](../../../system/string/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
