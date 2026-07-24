---
title: "System::BitConverter::ToString メソッド"
linktitle: "ToString"
second_title: "C++ 用 Aspose.Page"
description: "System::BitConverter::ToString メソッド。指定されたバイト配列のすべての値を16進数文字列に変換します。16進表記で使用する文字の大文字小文字や、隣接するバイトペア間に挿入する区切り文字は、C++ の対応する引数で指定します。"
type: docs
weight: 1200
url: /ja/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


指定されたバイト配列のすべての値を16進数文字列表現に変換します。16進表記で使用する文字の大文字小文字や、隣接するバイトのペア間に挿入される区切り文字は、対応する引数で指定できます。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 変換するバイトを含む [Array](../../array/) |
| 大文字 | bool | 結果の16進表記で使用する文字の大文字小文字を指定します |
| 区切り文字 | const String\& | 結果文字列で隣接するバイトペア間に挿入される区切り文字列 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## 参照

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


指定されたインデックスから開始して、指定されたバイト配列の値を16進数文字列表現に変換します。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 変換するバイトを含む [Array](../../array/) |
| startIndex | int | 変換を開始する指定配列内のインデックス |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 参照

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


指定されたバイト配列の値の範囲を16進数文字列表現に変換します。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 変換するバイトを含む [Array](../../array/) |
| startIndex | int | 変換対象のバイト配列要素の範囲が開始する指定配列内のインデックス |
| length | int | 変換対象のバイト配列要素の範囲の長さ |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 参照

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
