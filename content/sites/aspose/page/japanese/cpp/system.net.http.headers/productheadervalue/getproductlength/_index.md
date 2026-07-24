---
title: "System::Net::Http::Headers::ProductHeaderValue::GetProductLength メソッド"
linktitle: "GetProductLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ProductHeaderValue::GetProductLength メソッド。指定されたインデックスから渡された文字列を C++ の ProductHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 700
url: /ja/cpp/system.net.http.headers/productheadervalue/getproductlength/
---
## ProductHeaderValue::GetProductLength method


指定されたインデックスから渡された文字列を [ProductHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::ProductHeaderValue::GetProductLength(String input, int32_t startIndex, System::SharedPtr<ProductHeaderValue> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | System::SharedPtr\<ProductHeaderValue\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さを返します。そうでない場合は 0 を返します。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ProductHeaderValue](../)
* Class [ProductHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
