---
title: "System::operator+ メソッド"
linktitle: "operator+"
second_title: "C++ 用 Aspose.Page"
description: "System::operator+ メソッド。C++ における文字列連結。"
type: docs
weight: 27500
url: /ja/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 左 | const char_t | 文字列に連結する文字。 |
| right | const String\& | [String](../string/) を連結する。 |

### ReturnValue

連結された文字列。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


指定された値と、指定された [Decimal](../decimal/) オブジェクトが表す値の合計を表す [Decimal](../decimal/) クラスの新しいインスタンスを返します。

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const T\& | 最初の加数 |
| d | const Decimal\& | 第二の加数を表す [Decimal](../decimal/) オブジェクトへの定数参照 |

### ReturnValue

[Decimal](../decimal/) クラスの新しいインスタンスで、**x** と **d** が表す値の合計を表します。

## 参照

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


null 許容でない値と nullable 値を合計します。

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 左オペランドの型。 |
| T2 | 右オペランドの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| いくつか | const T1\& | 左オペランド。 |
| その他 | const Nullable\<T2\>\& | 右オペランド。 |

### ReturnValue

合計結果。

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


右側デリゲートのすべてのコールバックを左側デリゲートのコールバックリストの末尾に接続します。

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | コールバックが追加されるデリゲートです。 |
| rhv | MulticastDelegate\<T\> | コールバックが追加されているデリゲートです。 |

### ReturnValue

左側の値のコールバックとその後に右側のコールバックを含むデリゲートを返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| パラメーター | 説明 |
| --- | --- |
| T | [String](../string/) リテラル型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 左 | T\& | 文字列に連結するリテラルです。 |
| right | const String\& | [String](../string/) を連結する。 |

### ReturnValue

連結された文字列。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| パラメーター | 説明 |
| --- | --- |
| T | [String](../string/) ポインタ型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| left | T\& | [String](../string/) を文字列に連結するポインタです。 |
| right | const String\& | [String](../string/) を連結する。 |

### ReturnValue

連結された文字列。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
