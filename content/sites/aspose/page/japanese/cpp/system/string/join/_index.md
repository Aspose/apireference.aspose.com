---
title: "System::String::Join メソッド"
linktitle: "Join"
second_title: "C++ 用 Aspose.Page"
description: "System::String::Join メソッド。C++ で文字列を区切りとして配列を結合します。"
type: docs
weight: 7300
url: /ja/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


文字列を区切り文字として配列を結合します。

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separator | const String\& | [String](../) を配列要素間に挿入して結合します。 |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | 結合する部品の [Array](../../array/)。 |

### ReturnValue

[String](../) representing joint elements.

## 参照

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


文字列を区切り文字として配列を結合します。

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separator | const String\& | [String](../) を配列要素間に挿入して結合します。 |
| parts | const ArrayPtr\<String\>\& | 結合する部品の [Array](../../array/)。 |
| startIndex | int | 結合を開始する配列の最初のインデックス。 |
| count | int | 結合する配列要素数。-1 は「配列の末尾まで」を意味します。 |

### ReturnValue

[String](../) representing joint array elements.

## 参照

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


文字列を区切り文字として配列を結合します。

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separator | const String\& | [String](../) を配列要素間に挿入して結合します。 |
| 部品 | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - 部品 列挙可能オブジェクト |

### ReturnValue

[String](../) representing joint elements.

## 参照

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


文字列を区切り文字として配列を結合します。

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separator | const String\& | [String](../) を配列要素間に挿入して結合します。 |
| 部品 | const System::Details::ArrayView\<String\>\& | 結合する部品の ArrayView。 |
| startIndex | int | 結合を開始する配列の最初のインデックス。 |
| count | int | 結合する配列要素数。-1 は「配列の末尾まで」を意味します。 |

### ReturnValue

[String](../) representing joint array elements.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
