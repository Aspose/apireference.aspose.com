---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength メソッド"
linktitle: "GetRangeItemListLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength メソッド。指定された位置から渡された文字列を C++ の RangeItemHeaderValue クラスのインスタンスのコレクションに変換します。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


指定された位置から渡された文字列を RangeItemHeaderValue クラスのインスタンスのコレクションに変換します。

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | 解析されたコレクションが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さ、該当しない場合は 0 です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
