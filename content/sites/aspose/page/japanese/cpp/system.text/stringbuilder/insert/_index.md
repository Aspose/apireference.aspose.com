---
title: "System::Text::StringBuilder::Insert メソッド"
linktitle: "挿入"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::StringBuilder::Insert メソッド。C++ で builder の固定位置に文字を挿入します。"
type: docs
weight: 1200
url: /ja/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


文字列をビルダーの固定位置に挿入します。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 文字を挿入する位置。 |
| chars | const System::ArrayPtr\<char_t\>\& | スライスを挿入する元の [Array](../../../system/array/)。 |
| startIndex | int | [Array](../../../system/array/) スライスの開始インデックス。 |
| charCount | int | [Array](../../../system/array/) スライスの長さ。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


文字をビルダーの固定位置に挿入します。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startIndex | int | 文字を挿入する位置。 |
| ch | char_t | 挿入する文字。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


文字列をビルダーの固定位置に挿入します。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startIndex | int | 文字を挿入する位置。 |
| str | const String\& | [String](../../../system/string/) を挿入します。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


値をビルダーの固定位置に挿入します。

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| パラメーター | 説明 |
| --- | --- |
| パラメーター | 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startIndex | int | 文字を挿入する位置。 |
| value | T | フォーマットして挿入する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


繰り返し文字列をビルダーの固定位置に挿入します。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | 文字を挿入する位置。 |
| value | const String\& | [String](../../../system/string/) を挿入します。 |
| count | int32_t | **value** 文字列を繰り返す回数。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
