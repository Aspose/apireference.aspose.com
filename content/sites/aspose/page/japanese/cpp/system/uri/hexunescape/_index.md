---
title: "System::Uri::HexUnescape メソッド"
linktitle: "HexUnescape"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri::HexUnescape メソッド。指定された文字の十六進表現を文字に変換します（C++）。"
type: docs
weight: 4000
url: /ja/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


指定された文字の十六進表現を文字に変換します。

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パターン | const String\& | 文字の十六進表現を含む文字列 |
| インデックス | int32_t\& | 文字の十六進表現が開始する **pattern** 内の位置 |

### ReturnValue

位置 **index** の十六進エンコーディングで表される文字です。**index** の文字が十六進エンコードされていない場合は、その文字がそのまま返されます。**index** の値は、返された文字の次の文字を指すようにインクリメントされます。

## 参照

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
