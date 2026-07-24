---
title: "System::Xml::XmlNameTable::Get メソッド"
linktitle: "取得"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNameTable::Get メソッド。派生クラスでオーバーライドされた場合、指定された配列内の文字範囲と同じ文字を含むアトミック化された文字列を C++ で取得します。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


派生クラスでオーバーライドされた場合、指定された配列内の文字範囲と同じ文字を含むアトム化された文字列を取得します。

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const ArrayPtr\<char16_t\>\& | 検索する名前を含む文字配列です。 |
| offset | int32_t | 名前の最初の文字を指定する、配列内のゼロベースインデックスです。 |
| length | int32_t | 名前の文字数です。 |

### ReturnValue

文字列がまだアトミック化されていない場合は **nullptr**、それ以外はアトミック化された文字列です。**length** がゼロの場合、[String::Empty](../../../system/string/empty/) が返されます。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


派生クラスでオーバーライドされた場合、指定された文字列と同じ値を持つアトム化された文字列を取得します。

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const String\& | 検索する名前。 |

### ReturnValue

文字列がまだアトム化されていない場合は、アトム化された文字列または **nullptr**。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
