---
title: "System::Net::Http::Headers::RangeHeaderValue::GetRangeLength メソッド"
linktitle: "GetRangeLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::RangeHeaderValue::GetRangeLength メソッド。指定されたインデックスから渡された文字列を C++ で RangeHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/rangeheadervalue/getrangelength/
---
## RangeHeaderValue::GetRangeLength method


指定されたインデックスから渡された文字列を [RangeHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::RangeHeaderValue::GetRangeLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | System::SharedPtr\<Object\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さを返します。そうでない場合は 0 を返します。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RangeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
