---
title: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength method"
linktitle: "GetAuthenticationLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength メソッド。指定された文字列を解析し、C++ で文字列表現の最後のインデックスを返します。"
type: docs
weight: 800
url: /ja/cpp/system.net.http.headers/authenticationheadervalue/getauthenticationlength/
---
## AuthenticationHeaderValue::GetAuthenticationLength method


指定された文字列を解析し、文字列表現の最後のインデックスを返します。

```cpp
static int32_t System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析すべき文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| parsedValue | System::SharedPtr\<Object\>\& | 解析された値が代入される出力パラメータ。 |

### ReturnValue

解析されたサブ文字列の長さ、該当しない場合は 0 です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AuthenticationHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
