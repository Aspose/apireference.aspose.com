---
title: "System::Nullable::operator<= メソッド"
linktitle: "operator<="
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator<= メソッド。C++ で operator<=() を適用して、現在のオブジェクトが表す値が指定された Nullable オブジェクトが表す値以下かどうかを判断します。"
type: docs
weight: 1700
url: /ja/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


現在のオブジェクトが表す値が、指定された[Nullable](../)オブジェクトが表す値以下かどうかを、[operator<=()](./) を適用して判断します。

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる[Nullable](../)オブジェクトの基になる型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 比較対象となる[Nullable](../)オブジェクトへの定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された[Nullable](../)オブジェクトが表す値以下の場合は true、そうでない場合は false

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


現在のオブジェクトが表す値が、指定された値以下かどうかを、[operator<=()](./) を適用して判断します。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const T1\& | 比較対象となる値への定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された値以下の場合は true、そうでない場合は false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


常に false を返します。

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator>= メソッド
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator>= メソッド。C++ で operator>=() を適用して、現在のオブジェクトが表す値が指定された Nullable オブジェクトが表す値以上かどうかを判断します。'
type: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


現在のオブジェクトが表す値が、指定された[Nullable](../)オブジェクトが表す値以上かどうかを、[operator>=()](./) を適用して判断します。

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる[Nullable](../)オブジェクトの基になる型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 比較対象となる[Nullable](../)オブジェクトへの定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された [Nullable](../) オブジェクトが表す値以上である場合は true、そうでなければ - false

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


現在のオブジェクトが表す値に対して [operator>=()](./) を適用し、指定されたオブジェクトが表す値以上かどうかを判定します。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 現在のオブジェクトが表す値と比較する値の基底型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const T1\& | 現在のオブジェクトと比較するためのオブジェクトへの定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定されたオブジェクトが表す値以上である場合は true、そうでなければ - false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


常に false を返します。

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

常に - false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator|= メソッド
リンクタイトル: operator|=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator|= メソッド。C++ で、指定された値を右側引数として使用し、現在のオブジェクトが表す値に operator|=() を適用します。'
type: docs
重み: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


指定された値を右側引数として使用し、現在のオブジェクトが表す値に [operator|=()](./) を適用します。

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | SFINAE を機能させるためのテンプレートパラメータです。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | bool | 右側の値として使用されるブール値は [operator | =()](./) が現在のオブジェクトが表す値に適用されます。 |

### ReturnValue

自身への参照です。

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
