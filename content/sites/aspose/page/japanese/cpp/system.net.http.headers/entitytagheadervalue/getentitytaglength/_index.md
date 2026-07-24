---
title: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength メソッド"
linktitle: "GetEntityTagLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength メソッド。指定されたインデックスから渡された文字列を C++ の EntityTagHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/entitytagheadervalue/getentitytaglength/
---
## EntityTagHeaderValue::GetEntityTagLength method


指定されたインデックスから渡された文字列を [EntityTagHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength(String input, int32_t startIndex, System::SharedPtr<EntityTagHeaderValue> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | System::SharedPtr\<EntityTagHeaderValue\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さ、該当しない場合は 0 です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EntityTagHeaderValue](../)
* Class [EntityTagHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
