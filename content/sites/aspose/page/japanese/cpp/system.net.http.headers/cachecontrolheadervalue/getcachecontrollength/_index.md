---
title: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength メソッド"
linktitle: "GetCacheControlLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength メソッド。指定されたインデックスから渡された文字列を CacheControlHeaderValue クラスのインスタンスに変換します（C++）。"
type: docs
weight: 3400
url: /ja/cpp/system.net.http.headers/cachecontrolheadervalue/getcachecontrollength/
---
## CacheControlHeaderValue::GetCacheControlLength method


指定されたインデックスから渡された文字列を [CacheControlHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength(String input, int32_t startIndex, System::SharedPtr<CacheControlHeaderValue> storeValue, System::SharedPtr<CacheControlHeaderValue> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| storeValue | System::SharedPtr\<CacheControlHeaderValue\> | 解析されたオブジェクトに追加しなければならない値です。 |
| parsedValue | System::SharedPtr\<CacheControlHeaderValue\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さ、該当しない場合は 0 です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CacheControlHeaderValue](../)
* Class [CacheControlHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
