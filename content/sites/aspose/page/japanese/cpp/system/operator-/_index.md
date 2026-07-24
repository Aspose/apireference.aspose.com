---
title: "System::operator- メソッド"
linktitle: "operator-"
second_title: "C++ 用 Aspose.Page"
description: "System::operator- メソッド。指定された値から、指定された Decimal オブジェクトが表す値を減算した結果を表す Decimal クラスの新しいインスタンスを返します。"
type: docs
weight: 28100
url: /ja/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


指定された値から、指定された [Decimal](../decimal/) オブジェクトが表す値を減算した結果を表す [Decimal](../decimal/) クラスの新しいインスタンスを返します。

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const T\& | 減算対象の値 |
| d | const Decimal\& | 減算された値を表す [Decimal](../decimal/) オブジェクト |

### ReturnValue

**x** から **d** が表す値を減算した結果の値を表す [Decimal](../decimal/) クラスの新しいインスタンス。

## 参照

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


非 nullable と nullable の値を減算します。

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

減算結果。

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


曜日の2つの日の間の日数を計算します。

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | DayOfWeek | 被減数 |
| b | DayOfWeek | 減数 |

### ReturnValue

平日 **a** と **b** の間の日数; *goes* 後の場合は戻り値が負の数になります ****

## 参照

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


左側デリゲートのコールバックリストの末尾から、右側デリゲートのすべてのコールバックを切断します。

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | コールバックが削除されるデリゲート。 |
| rhv | MulticastDelegate\<T\> | コールバックが削除されるデリゲート。 |

### ReturnValue

左側の値のコールバックを含むが、右側の値のコールバックは含まないデリゲートを返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
