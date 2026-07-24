---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength メソッド"
linktitle: "GetMediaTypeLength"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength メソッド。指定されたインデックスから渡された文字列を C++ で MediaTypeHeaderValue クラスのインスタンスに変換します。"
type: docs
weight: 1000
url: /ja/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


指定されたインデックスから渡された文字列を [MediaTypeHeaderValue](../) クラスのインスタンスに変換します。

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | String | 解析する文字列。 |
| startIndex | int32_t | 解析の開始位置。 |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | [MediaTypeHeaderValue](../) クラスのインスタンスを作成するために使用されるデリゲートです。 |
| parsedValue | System::SharedPtr\\<MediaTypeHeaderValue\\>\\& | 解析されたオブジェクトが割り当てられるインスタンスです。 |

### ReturnValue

解析されたサブ文字列の長さを返します。そうでない場合は 0 を返します。

## 参照

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
