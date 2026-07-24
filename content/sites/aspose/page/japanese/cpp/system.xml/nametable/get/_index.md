---
title: "System::Xml::NameTable::Get method"
linktitle: "取得"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::NameTable::Get method。指定された配列内の文字範囲と同じ文字を含むアトム化された文字列を C++ で返します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


指定された配列の指定範囲の文字と同じ文字を含むアトム化された文字列を返します。

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| キー | const ArrayPtr\<char16_t\>\& | 検索する名前を含む文字配列。 |
| 開始 | int32_t | 名前の最初の文字を指定する、配列内のゼロベースインデックスです。 |
| len | int32_t | 名前の文字数です。 |

### ReturnValue

アトム化された文字列、または文字列がまだアトム化されていない場合は **nullptr** です。**len** が 0 の場合、[String::Empty](../../../system/string/empty/) が返されます。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


指定された値のアトミック化された文字列を返します。

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 検索する名前。 |

### ReturnValue

アトム化された文字列オブジェクト、または文字列がまだアトム化されていない場合は **nullptr** です。

## 参照

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
