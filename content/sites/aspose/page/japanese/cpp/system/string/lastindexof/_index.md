---
title: "System::String::LastIndexOf メソッド"
linktitle: "LastIndexOf"
second_title: "C++ 用 Aspose.Page"
description: "System::String::LastIndexOf メソッド。C++ における文字の逆方向検索です。"
type: docs
weight: 2400
url: /ja/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


文字の後方検索。

```cpp
int System::String::LastIndexOf(char_t value) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 検索する文字です。 |

### ReturnValue

最後の文字位置のインデックス、または見つからない場合は -1。

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


文字の後方検索。

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 検索する文字です。 |
| startIndex | int32_t | 検索を開始するインデックス。 |

### ReturnValue

startIndex 以降の最後の文字位置のインデックス、または見つからない場合は -1。

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


文字の後方検索。

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char_t | 検索する文字です。 |
| startIndex | int32_t | 検索を開始するインデックス。 |
| count | int32_t | 検索対象の文字数 |

### ReturnValue

startIndex 以降の最後の文字位置のインデックス、または見つからない場合は -1。

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


部分文字列の後方検索。

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最後に見つかったサブ文字列のインデックス、または見つからない場合は -1。検索文字列が空の場合、常に文字列の長さを返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


部分文字列の後方検索。

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |

### ReturnValue

最後に見つかったサブ文字列のインデックス、または見つからない場合は -1。検索文字列が空の場合、常に文字列の長さを返します。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


部分文字列の後方検索。

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 検索するサブ文字列。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最後に見つかったサブ文字列のインデックス、または見つからない場合は -1。検索文字列が空の場合、常に文字列の長さを返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


部分文字列の後方検索。

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 検索するサブ文字列。 |
| startIndex | int | 検索を開始する元文字列内の位置。 |
| count | int | 検索対象の文字数。 |
| comparisonType | StringComparison | [Comparison](../../comparison/) モード。 |

### ReturnValue

最後に見つかったサブ文字列のインデックス、または見つからない場合は -1。検索文字列が空の場合、常に startIndex+count を返します。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
