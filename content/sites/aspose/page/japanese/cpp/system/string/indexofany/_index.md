---
title: "System::String::IndexOfAny メソッド"
linktitle: "IndexOfAny"
second_title: "C++ 用 Aspose.Page"
description: "System::String::IndexOfAny メソッド。C++ における文字の前方検索。"
type: docs
weight: 1600
url: /ja/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


文字の前方検索。

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
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
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


渡された文字のいずれかを文字列全体で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |

### ReturnValue

最初に一致する文字のインデックス、見つからない場合は -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


渡された文字のいずれかを部分文字列で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |
| startindex | int32_t | 検索開始インデックス。 |

### ReturnValue

最初に一致する文字のインデックス、見つからない場合は -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


渡された文字のいずれかを部分文字列で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |
| startindex | int32_t | 検索開始インデックス。 |
| count | int32_t | 検索対象の文字数。 |

### ReturnValue

最初に一致する文字のインデックス、見つからない場合は -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


その結果、this 内で str のすべての文字を検索します。最初の文字が見つかった場合、その位置が返され、見つからなければ次の文字を検索し、以下同様に続きます。

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | [String](../) を検索する文字列。文字の順序は重要です。 |
| startIndex | int | 検索開始位置。 |

### ReturnValue

最初に見つかった文字のインデックス、見つからなければ -1。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
