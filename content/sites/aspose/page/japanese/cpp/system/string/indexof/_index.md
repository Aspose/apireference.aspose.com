---
title: "System::String::IndexOf メソッド"
linktitle: "IndexOf"
second_title: "C++ 用 Aspose.Page"
description: "System::String::IndexOf メソッド。C++ におけるサブ文字列内での文字の前方検索。"
type: docs
weight: 1500
url: /ja/cpp/system/string/indexof/
---
## String::IndexOf(char_t, int, int) const method


部分文字列内の文字の前方検索。

```cpp
int System::String::IndexOf(char_t c, int startIndex, int count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| c | char_t | 検索する文字です。 |
| startIndex | int | 検索を開始するインデックス。 |
| count | int | 検索対象の文字数。 |

### ReturnValue

startIndex 以降の最初の文字位置のインデックス、見つからない場合は -1。

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(char_t, int) const method


文字の前方検索。

```cpp
int System::String::IndexOf(char_t c, int startIndex=0) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| c | char_t | 検索する文字です。 |
| startIndex | int | 検索を開始するインデックス。 |

### ReturnValue

startIndex 以降の最初の文字位置のインデックス、見つからない場合は -1。

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int) const method


部分文字列の前方検索。

```cpp
int System::String::IndexOf(const String &str, int startIndex, int count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |
| count | int | 検索する文字数。 |

### ReturnValue

最初に見つかったサブ文字列のインデックス、見つからなければ -1。検索文字列が空の場合、常に startIndex を返します。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, System::StringComparison) const method


部分文字列の前方検索。

```cpp
int System::String::IndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最初に見つかったサブ文字列のインデックス、見つからなければ -1。検索文字列が空の場合、常に startIndex を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int) const method


部分文字列の前方検索。

```cpp
int System::String::IndexOf(const String &str, int startIndex=0) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |

### ReturnValue

最初に見つかったサブ文字列のインデックス、見つからなければ -1。検索文字列が空の場合、常に startIndex を返します。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, System::StringComparison) const method


部分文字列の前方検索。

```cpp
int System::String::IndexOf(const String &str, System::StringComparison comparison_type) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最初に見つかったサブ文字列のインデックス、見つからなければ -1。検索文字列が空の場合、常に 0 を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int, System::StringComparison) const method


部分文字列の前方検索。

```cpp
int System::String::IndexOf(const String &value, int startIndex, int count, System::StringComparison comparisonType) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |
| count | int | 検索する文字数。 |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最初に見つかったサブ文字列のインデックス、見つからなければ -1。検索文字列が空の場合、常に startIndex を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
