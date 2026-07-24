---
title: "System::Globalization::CompareInfo::Compare メソッド"
linktitle: "Compare"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::CompareInfo::Compare メソッド。文字列を比較します。C++ では Ordinal と OrdinalIgnoreCase モードのみがサポートされています。"
type: docs
weight: 200
url: /ja/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


文字列を比較します。Ordinal と OrdinalIgnoreCase モードのみがサポートされています。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | const String\& | 左辺文字列。 |
| b | const String\& | 右辺文字列。 |
| options | CompareOptions | [String](../../../system/string/) 比較タイプ。 |

### ReturnValue

左辺文字列が右辺文字列より前にある場合は負の値、等しい場合は 0、そうでない場合は正の値を返します。

## 参照

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


文字列を比較します。未実装です。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| string1 | const String\& | 左辺文字列。 |
| string2 | const String\& | 右辺文字列。 |

### ReturnValue

左辺文字列が右辺文字列より前にある場合は負の値、等しい場合は 0、そうでない場合は正の値を返します。

## 参照

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


1 つの文字列の末尾部分と別の文字列の末尾部分を比較します。未実装です。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| string1 | const String\& | 最初の文字列。 |
| offset1 | int | **string1** の文字の開始インデックス。 |
| string2 | const String\& | 2番目の文字列。 |
| offset2 | int | **string2** の文字の開始インデックス。 |

### ReturnValue

最初の文字列セクションが2番目の文字列セクションに先行する場合は負の値、一致する場合は0、その他の場合は正の値です。

## 参照

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


文字列比較メソッドを使用して、1 つの文字列の末尾部分と別の文字列の末尾部分を比較します。未実装です。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| string1 | const String\& | 最初の文字列。 |
| offset1 | int | **string1** の文字の開始インデックス。 |
| string2 | const String\& | 2番目の文字列。 |
| offset2 | int | **string2** の文字の開始インデックス。 |
| options | CompareOptions | [String](../../../system/string/) の比較オプション。 |

### ReturnValue

最初の文字列セクションが2番目の文字列セクションに先行する場合は負の値、一致する場合は0、その他の場合は正の値です。

## 参照

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


1 つの文字列の一部と別の文字列の一部を比較します。未実装です。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| string1 | const String\& | 最初の文字列。 |
| offset1 | int | **string1** の文字の開始インデックス。 |
| length1 | int | 比較する **string1** の文字数。 |
| string2 | const String\& | 2番目の文字列。 |
| offset2 | int | **string2** の文字の開始インデックス。 |
| length2 | int | 比較する **string2** の文字数。 |

### ReturnValue

最初の文字列セクションが2番目の文字列セクションに先行する場合は負の値、一致する場合は0、その他の場合は正の値です。

## 参照

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


文字列比較メソッドを使用して、1 つの文字列の一部と別の文字列の一部を比較します。未実装です。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| string1 | const String\& | 最初の文字列。 |
| offset1 | int | **string1** の文字の開始インデックス。 |
| length1 | int | 比較する **string1** の文字数。 |
| string2 | const String\& | 2番目の文字列。 |
| offset2 | int | **string2** の文字の開始インデックス。 |
| length2 | int | 比較する **string2** の文字数。 |
| options | CompareOptions | [String](../../../system/string/) の比較オプション。 |

### ReturnValue

最初の文字列セクションが2番目の文字列セクションに先行する場合は負の値、一致する場合は0、その他の場合は正の値です。

## 参照

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
