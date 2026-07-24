---
title: "System::operator!= メソッド"
linktitle: "operator!="
second_title: "C++ 用 Aspose.Page"
description: "C++ のクラスで operator!= メソッドを使用する方法です。"
type: docs
weight: 25800
url: /ja/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## 参照

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| パラメーター | 説明 |
| --- | --- |
| Chars | [String](../string/) リテラル型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| left | Chars\& | [String](../string/) 比較用リテラル。 |
| right | const String\& | [String](../string/) を比較 |

### ReturnValue

文字列が一致する場合は false、そうでない場合は true。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) を文字列に変換して比較。 |
| right | const String\& | [String](../string/) を比較 |

### ReturnValue

オブジェクトの文字列表現が文字列と等しい場合は false、そうでない場合は true。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


現在のオブジェクトと指定されたオブジェクトが表す URI が等しくないかどうかを判断します。

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 比較する最初の [Uri](../uri/) オブジェクト |
| uri2 | const SharedPtr\<Uri\>\& | 比較する2番目の [Uri](../uri/) オブジェクト |

### ReturnValue

URI が等しくない場合は true、そうでない場合は false

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


非等価比較は 2 つのスマートポインタを比較します。

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| パラメーター | 説明 |
| --- | --- |
| X | 最初のポインタの指す型。 |
| Y | 2 番目のポインタの指す型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 比較する最初のポインタ。 |
| y | const SmartPtr\<Y\>\& | 比較する2番目のポインタ。 |

### ReturnValue

ポインタが一致する場合は False、そうでない場合は true。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


スマートポインタと単純 (C) ポインタの不等価比較。

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| パラメーター | 説明 |
| --- | --- |
| X | スマートポインタの型。 |
| Y | 単純ポインタの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 比較するスマートポインタ（左）。 |
| y | const Y * | 比較対象のポインタ（右）。 |

### ReturnValue

ポインタが一致する場合は False、そうでない場合は true。

## 参照

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


指定された値が、指定された [Nullable](../nullable/) オブジェクトが表す値と等しくないかどうかを、これらの値に [operator!=()](./) を適用して判定します。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 最初の比較対象値の型 |
| T2 | 第二の比較対象値を表す [Nullable](../nullable/) オブジェクトの基になる型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| いくつか | const T1\& | 最初の比較対象として使用される値への定数参照 |
| other | const Nullable\<T2\>\& | 第二の比較対象として使用される表現された値を持つ [Nullable](../nullable/) オブジェクトへの定数参照 |

### ReturnValue

比較対象が等しくない場合は true、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


スマートポインタと単純（C）ポインタとの等価比較。

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| パラメーター | 説明 |
| --- | --- |
| X | 単純ポインタの型。 |
| Y | スマートポインタの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const X * | 比較対象のポインタ（右）。 |
| y | const SmartPtr\<Y\>\& | 比較するスマートポインタ（左）。 |

### ReturnValue

ポインタが一致する場合は False、そうでない場合は true。

## 参照

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


スマートポインタが null でないかチェックします。

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| パラメーター | 説明 |
| --- | --- |
| X | ポインタが指す型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | チェック対象のポインタ。 |

### ReturnValue

ポインタが null の場合は false、そうでない場合は true。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


指定された [Nullable](../nullable/) オブジェクトが null と等しくない値を表すかどうかを判定します。

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | std::nullptr_t | テスト対象の [Nullable](../nullable/) オブジェクトへの定数参照 |

### ReturnValue

指定されたオブジェクトが非 null の値を表す場合は true、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


文字列が null かどうかをチェックします。

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | std::nullptr_t | チェック対象の [String](../string/) |

### ReturnValue

文字列が null の場合は false、そうでない場合は true。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


スマートポインタが null でないかチェックします。

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| パラメーター | 説明 |
| --- | --- |
| X | ポインタが指す型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | std::nullptr_t | チェック対象のポインタ。 |

### ReturnValue

ポインタが null の場合は false、そうでない場合は true。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| パラメーター | 説明 |
| --- | --- |
| T | [String](../string/) ポインタ型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| left | T\& | [String](../string/) 比較用ポインタ。 |
| right | const String\& | [String](../string/) を比較 |

### ReturnValue

文字列が一致する場合は false、そうでない場合は true。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
