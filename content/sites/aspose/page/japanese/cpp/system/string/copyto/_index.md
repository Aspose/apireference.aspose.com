---
title: "System::String::CopyTo メソッド"
linktitle: "CopyTo"
second_title: "C++ 用 Aspose.Page"
description: "System::String::CopyTo メソッド。文字列の文字を既存の配列要素にコピーします。C++ ではサイズ変更は行われません。"
type: docs
weight: 800
url: /ja/cpp/system/string/copyto/
---
## String::CopyTo method


文字列の文字を既存の配列要素にコピーします。サイズ変更は行われません。

```cpp
void System::String::CopyTo(int sourceIndex, const ArrayPtr<char_t> &destination, int destinationIndex, int count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| sourceIndex | int | 読み取り開始位置となる文字列内インデックス。 |
| destination | const ArrayPtr\<char_t\>\& | 宛先配列。 |
| destinationIndex | int | 書き込み開始位置となる配列内インデックス。 |
| count | int | コピーする文字数。 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
