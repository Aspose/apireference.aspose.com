---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength メソッド"
linktitle: "GetNameValueListLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength メソッド。指定されたインデックスから渡された文字列を NameValueHeaderValue クラスのインスタンスのコレクションに変換し、C++ で解析されたサブ文字列の長さを返します。"
type: docs
weight: 1000
url: /ja/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


指定されたインデックスから渡された文字列を NameValueHeaderValue クラスのインスタンスのコレクションに変換し、解析されたサブ文字列の長さを返します。

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析対象の文字列です。 |
| startIndex | int32_t | 解析の開始位置です。 |
| 区切り文字 | char16_t | 指定された文字列内の項目を区切るために使用される文字列です。 |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | 解析されたコレクションが代入される出力パラメータです。 |

### ReturnValue

解析されたサブ文字列の長さです。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
