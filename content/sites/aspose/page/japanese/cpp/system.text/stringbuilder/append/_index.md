---
title: "System::Text::StringBuilder::Append メソッド"
linktitle: "追加"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::StringBuilder::Append メソッド。C++ で文字をビルダーに追加します。"
type: docs
weight: 300
url: /ja/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


文字をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| c | char_t | 文字の値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(char_t, int) method


文字をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| c | char_t | 文字の値。 |
| count | int | 挿入文字を繰り返す回数。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


文字配列をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 追加する文字。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


文字配列のスライスをビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 追加する文字。 |
| startIndex | int | スライスの開始インデックス。 |
| charCount | int | スライスの長さ。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


ビルダーの内容をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ビルダー | const SharedPtr\<StringBuilder\>\& | コンテンツを追加するビルダー。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


オブジェクトの文字列表現をビルダーに追加します。

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../../system/object/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) をシリアライズして追加します。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&) method


文字列をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 追加する [String](../../../system/string/)。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


文字列のスライスをビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 追加する [String](../../../system/string/)。 |
| startIndex | int | スライスの開始インデックス。 |
| charCount | int | スライスの長さ。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(double) method


浮動小数点値をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| df | double | シリアライズして追加する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(E) method


列挙型の値の文字列表現をビルダーに追加します。

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| パラメーター | 説明 |
| --- | --- |
| E | [Enum](../../../system/enum/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| e | E | シリアライズして追加する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(float) method


浮動小数点値をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| f | 単精度浮動小数点数 | シリアライズして追加する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(int) method


整数値をビルダーに追加します。

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int | シリアライズして追加する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(T) method


算術値をビルダーに追加します。

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 算術型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T | シリアライズして追加する値。 |

### ReturnValue

このポインタ。

## 参照

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
