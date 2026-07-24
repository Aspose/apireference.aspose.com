---
title: "System::String::operator+ メソッド"
linktitle: "operator+"
second_title: "C++ 用 Aspose.Page"
description: "System::String::operator+ メソッド。C++ で文字を文字列の末尾に追加します。"
type: docs
weight: 2800
url: /ja/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


文字を文字列の末尾に追加します。

```cpp
String System::String::operator+(char_t x) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | char_t | 追加する文字。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | [String](../) を現在の文字列の末尾に追加します。 |

### ReturnValue

連結された文字列。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| パラメーター | 説明 |
| --- | --- |
| T | 文字列リテラルまたは文字列ポインタ形式のいずれか。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arg | const T\& | 現在の文字列に連結するエンティティ。 |

### ReturnValue

連結された文字列。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


参照型オブジェクトの文字列表現を文字列の末尾に追加します。

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| パラメーター | 説明 |
| --- | --- |
| T | ポインタ型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) を [ToString()](../tostring/) 呼び出しで文字列に変換し、現在の文字列に追加します。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


文字列の末尾に値型オブジェクトの文字列表現を追加します。

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| パラメーター | 説明 |
| --- | --- |
| T | [ToString()](../tostring/) を呼び出すための値型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) を [ToString()](../tostring/) 呼び出しで文字列に変換し、現在の文字列に追加します。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


浮動小数点値の文字列表現を文字列の末尾に追加します。

```cpp
String System::String::operator+(double d) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| d | double | 文字列に変換して追加する値。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


整数値の文字列表現を文字列の末尾に追加します。

```cpp
String System::String::operator+(int i) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int | 文字列に変換して追加する整数値。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


整数値の文字列表現を文字列の末尾に追加します。

```cpp
String System::String::operator+(int64_t v) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| v | int64_t | 文字列に変換して追加する値を追加します。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


ブール値の文字列表現を文字列の末尾に追加します。

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| パラメーター | 説明 |
| --- | --- |
| T | 文字列と連結する値型です。bool である必要があります。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) を文字列に変換して追加する値。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


符号なし整数値の文字列表現を文字列の末尾に追加します。

```cpp
String System::String::operator+(uint32_t i) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | uint32_t | 文字列に変換して追加する値。 |

### ReturnValue

[String](../) concatenation result.

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
