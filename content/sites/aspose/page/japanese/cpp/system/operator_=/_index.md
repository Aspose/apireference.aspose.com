---
title: "System::operator<= メソッド"
linktitle: "operator<="
second_title: "C++ 用 Aspose.Page"
description: "System::operator<= メソッド。C++ で operator<=() を適用して、指定された値が指定された Nullable オブジェクトが表す値以下かどうかを判定します。"
type: docs
weight: 31900
url: /ja/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


指定された値が、指定された [Nullable](../nullable/) オブジェクトが表す値以下かどうかを、[operator<=()](./) を適用して判定します。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
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

最初の比較対象が2番目の比較対象以下の場合は true、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


常に false を返します。

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>= メソッド
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::operator>= メソッド。C++ で operator>=() を適用して、指定された値が指定された Nullable オブジェクトが表す値以上かどうかを判定します。'
type: docs
weight: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


指定された値が、指定された [Nullable](../nullable/) オブジェクトが表す値以上かどうかを、[operator>=()](./) を適用して判定します。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
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

最初の比較対象が2番目の比較対象以上の場合は true、そうでない場合は false

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


常に false を返します。

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
