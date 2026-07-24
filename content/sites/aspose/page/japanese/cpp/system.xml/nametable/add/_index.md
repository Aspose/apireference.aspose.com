---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::NameTable::Add method。指定された文字列をアトム化し、C++ の NameTable に追加します。"
type: docs
weight: 200
url: /ja/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


指定された文字列をアトム化し、[NameTable](../) に追加します。

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| キー | const ArrayPtr\<char16_t\>\& | 追加する文字列を含む文字配列。 |
| 開始 | int32_t | 文字列の最初の文字を指定する、配列内のゼロベースインデックス。 |
| len | int32_t | 文字列の文字数。 |

### ReturnValue

アトム化された文字列、または [NameTable](../) にすでに存在する場合は既存の文字列です。**len** が 0 の場合、[String::Empty](../../../system/string/empty/) が返されます。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


指定された文字列をアトム化し、[NameTable](../) に追加します。

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| キー | const String\& | 追加する文字列。 |

### ReturnValue

アトム化された文字列、または [NameTable](../) にすでに存在する場合は既存の文字列です。

## 参照

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
