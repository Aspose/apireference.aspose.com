---
title: "System::operator* メソッド"
linktitle: "operator*"
second_title: "C++ 用 Aspose.Page"
description: "System::operator* メソッド。C++ で、指定された値と指定された Decimal オブジェクトが表す値の乗算結果を表す Decimal クラスの新しいインスタンスを返します。"
type: docs
weight: 27400
url: /ja/cpp/system/operator_/
---
## System::operator* method


指定された値と、指定された [Decimal](../decimal/) オブジェクトが表す値の乗算結果を表す [Decimal](../decimal/) クラスの新しいインスタンスを返します。

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const T\& | 最初の乗数 |
| d | const Decimal\& | 第二の乗数を表す [Decimal](../decimal/) オブジェクト |

### ReturnValue

[Decimal](../decimal/) クラスの新しいインスタンスで、**x** と **d** が表す値の乗算結果を表します。

## 参照

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator< メソッド
リンクタイトル: operator<
second_title: Aspose.Page for C++
description: 'System::operator< メソッド。指定された値が、指定された Nullable オブジェクトによって表される値よりも小さいかどうかを、C++ でこれらの値に operator<() を適用して判断します。'
type: docs
重み: 28600
URL: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


指定された値が、指定された [Nullable](../nullable/) オブジェクトによって表される値よりも小さいかどうかを、[operator<()](./) を適用して判断します。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
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

最初の比較対象が2番目の比較対象より小さい場合は True、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


常に false を返します。

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
タイトル: System::operator> メソッド
リンクタイトル: operator>
second_title: Aspose.Page for C++
description: 'System::operator> メソッド。指定された値が、指定された Nullable オブジェクトによって表される値よりも大きいかどうかを、C++ でこれらの値に operator>() を適用して判断します。'
type: docs
重み: 34100
URL: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


指定された値が、指定された [Nullable](../nullable/) オブジェクトによって表される値よりも大きいかどうかを、[operator>()](./) を適用して判断します。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
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

最初の比較対象が2番目の比較対象より大きい場合は True、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


常に false を返します。

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
