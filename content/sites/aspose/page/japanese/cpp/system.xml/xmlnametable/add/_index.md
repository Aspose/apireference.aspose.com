---
title: "System::Xml::XmlNameTable::Add メソッド"
linktitle: "Add"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNameTable::Add メソッド。派生クラスでオーバーライドされた場合、指定された文字列をアトミック化し、C++ で XmlNameTable に追加します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


派生クラスでオーバーライドされた場合、指定された文字列をアトミック化し、[XmlNameTable](../) に追加します。

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const ArrayPtr\<char16_t\>\& | 追加する名前を含む文字配列です。 |
| offset | int32_t | 名前の最初の文字を指定する、配列内のゼロベースインデックスです。 |
| length | int32_t | 名前の文字数です。 |

### ReturnValue

新しいアトミック化された文字列、または既に存在する場合は既存の文字列です。length がゼロの場合、[String::Empty](../../../system/string/empty/) が返されます。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


派生クラスでオーバーライドされた場合、指定された文字列をアトミック化し、[XmlNameTable](../) に追加します。

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const String\& | 追加する名前です。 |

### ReturnValue

新しいアトミック化された文字列、または既に存在する場合は既存の文字列です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
