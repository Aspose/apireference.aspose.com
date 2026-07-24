---
title: "System::String::String コンストラクタ"
linktitle: "String"
second_title: "C++ 用 Aspose.Page"
description: "System::String::String コンストラクタ。デフォルトコンストラクタ。C++ で null と見なされる文字列オブジェクトを作成します。"
type: docs
weight: 100
url: /ja/cpp/system/string/string/
---
## String::String() constructor


デフォルトコンストラクタ。null と見なされる文字列オブジェクトを作成します。

```cpp
System::String::String()
```

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


ムーブコンストラクタ。

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString を [String](../) にラップします。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


文字配列全体を文字列に変換します。

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) を文字列に変換します。 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


文字配列のサブレンジを文字列に変換します。パラメータが配列の範囲外の場合、空の文字列が構築されます。

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | 文字配列。 |
| offset | int | サブ配列の開始インデックス。 |
| len | int | サブ配列の長さ。 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


文字列ポインタと明示的な長さから文字列を構築します。

```cpp
System::String::String(const char *str, int length)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const char * | [String](../) の UTF8 データへのポインタで、リテラルまたは配列の可能性があります。 |
| length | int | 明示的な文字列長 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


文字列ポインタと明示的な長さから文字列を構築します。

```cpp
System::String::String(const char16_t *str, int length)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const char16_t * | [String](../) ポインタ、リテラルまたは配列の可能性があります。 |
| length | int | 明示的な文字列長 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


開始位置から長さを使用して文字列ポインタから文字列を構築します。

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const char16_t * | [String](../) ポインタ、リテラルまたは配列の可能性があります。 |
| 開始 | int | 開始位置。 |
| length | int | [String](../) の長さ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


フィルコンストラクタ。

```cpp
System::String::String(const char16_t ch, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ch | const char16_t | 埋め込み文字。 |
| count | int | 目標長さ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


UnicodeString を [String](../) にラップします。

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString を [String](../) にラップします。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


UTF-8 形式で提示された std::string 文字列から [String](../) を作成します。

```cpp
System::String::String(const std::string &utf8str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| utf8str | const std::string\& | std::string 文字列を [String](../) に変換します。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


utf16 文字列から [String](../) を作成します。

```cpp
System::String::String(const std::u16string &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const std::u16string\& | Utf16 文字列を [String](../) に変換します。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


std::u32string 文字列から [String](../) を作成します。

```cpp
System::String::String(const std::u32string &u32str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| u32str | const std::u32string\& | std::u32string 文字列を [String](../) に変換します。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


widestring から [String](../) を作成します。

```cpp
System::String::String(const std::wstring &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const std::wstring\& | widestring を [String](../) に変換します。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


コピーコンストラクタ。

```cpp
System::String::String(const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | [String](../) をコピーする。 |

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


文字列ポインタに基づいて文字列を構築します。指された文字列を UTF8 の null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | 文字列ポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


文字列ポインタに基づいて文字列を構築します。指された文字列を null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | 文字列ポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


ワイド文字列ポインタに基づいて文字列を構築します。指された文字列を null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | 文字列ポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


nullptr コンストラクタ。他のテンプレートコンストラクタとの優先順位を解決するためにテンプレートとして宣言されています。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| パラメーター | 説明 |
| --- | --- |
| T | nullptr_t である必要があります |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | nullptr |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


ワイド文字列ポインタと明示的な長さから文字列を構築します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。

```cpp
System::String::String(const wchar_t *str, int length)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const wchar_t * | [String](../) ポインタ、リテラルまたは配列の可能性があります。 |
| length | int | 明示的な文字列長 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


フィルコンストラクタ。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ch | const wchar_t | 埋め込み文字。 |
| count | int | 目標長さ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


ムーブコンストラクタ。

```cpp
System::String::String(String &&str) noexcept
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String\&& | [String](../) からデータをムーブする。 |

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


文字列リテラルに基づいて文字列を構築します。リテラルを UTF8 の null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T\& | [String](../) リテラルポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


文字列リテラルに基づいて文字列を構築します。リテラルを null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T\& | [String](../) リテラルポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


ワイド文字列リテラルに基づいて文字列を構築します。リテラルを null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T\& | [String](../) リテラルポインタ。 |

## 参照

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
