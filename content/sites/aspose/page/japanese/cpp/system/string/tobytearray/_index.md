---
title: "System::String::ToByteArray メソッド"
linktitle: "ToByteArray"
second_title: "C++ 用 Aspose.Page"
description: "System::String::ToByteArray メソッド。C++ で文字列または部分文字列をバイト配列に変換します。"
type: docs
weight: 4700
url: /ja/cpp/system/string/tobytearray/
---
## String::ToByteArray method


文字列または部分文字列をバイト配列に変換します。

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startIndex | int32_t | サブ文字列の開始インデックス。 |
| length | int32_t | サブ文字列の長さ。 |
| LE | bool | true の場合はリトルエンディアンで文字をエンコードし、そうでない場合はビッグエンディアンを使用します。 |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
