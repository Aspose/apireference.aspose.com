---
title: "System::String::Split メソッド"
linktitle: "分割"
second_title: "C++ 用 Aspose.Page"
description: "System::String::Split メソッド。C++ で文字で文字列を分割します。"
type: docs
weight: 4300
url: /ja/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


文字で文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 区切り文字 | char_t | 文字列を分割する文字。 |
| count | int32_t | 返すサブ文字列の最大数。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


文字で文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 区切り文字 | char_t | 文字列を分割する文字。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


2 つの文字のいずれかで文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separatorA | char_t | 文字列を分割する最初の文字。 |
| separatorB | char_t | 文字列を分割する2番目の文字。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


指定された文字のいずれかで文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) の区切り文字。空の場合、任意の空白文字が区切りとして扱われます。 |
| count | int32_t | 返すサブ文字列の最大数。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


指定された文字のいずれかで文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) の区切り文字。空の場合、任意の空白文字が区切りとして扱われます。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


部分文字列で文字列を分割します。現在、0 または 1 要素の区切り文字配列のみサポートしています。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) の区切り文字列。空の場合、分割は行われません。 |
| count | int | 分割配列の要素数の上限。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


部分文字列で文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) の区切り文字列。空の場合、分割は行われません。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


部分文字列で文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 区切り文字 | const String\& | 区切りとして機能するサブ文字列。空の場合、空白文字が区切りとして機能します。 |
| count | int | 分割配列の要素数の上限。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


部分文字列で文字列を分割します。

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 区切り文字 | const String\& | 区切りとして機能するサブ文字列。空の場合、空白文字が区切りとして機能します。 |
| opt | StringSplitOptions | 分割オプション。 |

### ReturnValue

[Array](../../array/) of substrings.

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
