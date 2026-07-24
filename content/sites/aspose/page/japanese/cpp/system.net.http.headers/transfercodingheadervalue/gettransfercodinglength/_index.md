---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength メソッド"
linktitle: "GetTransferCodingLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength メソッド。指定されたインデックスから渡された文字列を C++ の TransferCodingHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 700
url: /ja/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


指定されたインデックスから渡された文字列を [TransferCodingHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | [TransferCodingHeaderValue](../) クラスのインスタンスを作成するために使用されるデリゲートです。 |

### ReturnValue

解析されたサブ文字列の長さを返します。そうでない場合は 0 を返します。

## 参照

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
