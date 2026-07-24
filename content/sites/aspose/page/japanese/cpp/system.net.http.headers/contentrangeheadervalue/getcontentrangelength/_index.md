---
title: "System::Net::Http::Headers::ContentRangeHeaderValue::GetContentRangeLength method"
linktitle: "GetContentRangeLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ContentRangeHeaderValue::GetContentRangeLength method. 指定された位置から渡された文字列を C++ で ContentRangeHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 1200
url: /ja/cpp/system.net.http.headers/contentrangeheadervalue/getcontentrangelength/
---
## ContentRangeHeaderValue::GetContentRangeLength method


指定された位置から渡された文字列を [ContentRangeHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::ContentRangeHeaderValue::GetContentRangeLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | System::SharedPtr\<Object\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さ、該当しない場合は 0 です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ContentRangeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
