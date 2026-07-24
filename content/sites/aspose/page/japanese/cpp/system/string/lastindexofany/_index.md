---
title: "System::String::LastIndexOfAny メソッド"
linktitle: "LastIndexOfAny"
second_title: "C++ 用 Aspose.Page"
description: "System::String::LastIndexOfAny メソッド。文字列全体を後方へ走査し、渡された任意の文字を検索します。最後の文字を anyOf のすべての文字と比較し、次に前の文字と比較する…というように進みます。C++ で最初に一致した位置のインデックスを返します。"
type: docs
weight: 2500
url: /ja/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


渡された文字のいずれかを文字列全体で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |

### ReturnValue

最後に一致した文字のインデックス、見つからなければ -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


渡された文字のいずれかを部分文字列で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |
| startindex | int32_t | 検索開始インデックス。 |

### ReturnValue

最後に一致した文字のインデックス、見つからなければ -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


渡された文字のいずれかを部分文字列で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) の検索対象文字。順序は関係ありません。 |
| startindex | int32_t | 検索開始インデックス。 |
| count | int32_t | 検索対象の文字数。 |

### ReturnValue

最後に一致した文字のインデックス、見つからなければ -1。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
