---
title: "System::Nullable::operator+= メソッド"
linktitle: "operator+="
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator+= メソッド。C++ で、指定された Nullable オブジェクトが表す値を右側引数として使用し、現在のオブジェクトが表す値に operator+=() を適用します。"
type: docs
weight: 1300
url: /ja/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


指定された [Nullable](../) オブジェクトが表す値を右側引数として使用し、現在のオブジェクトが表す値に [operator+=()](./) を適用します。

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | [operator+=()](./) の右側引数として使用される、[Nullable](../) オブジェクトが表す値の基底型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 現在のオブジェクトが表す値に適用される [operator+=()](./) の右側引数として使用される、[Nullable](../) オブジェクトが表す値への定数参照 |

### ReturnValue

自身への参照

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


指定された値を右側引数として使用し、現在のオブジェクトが表す値に [operator+=()](./) を適用します。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | [operator+=()](./) の右側値として使用される値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const T1\& | 現在のオブジェクトが表す値に適用される [operator+=()](./) の右側値として使用される値への定数参照 |

### ReturnValue

自身への参照

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


現在のオブジェクトをリセットし、null値を表すようにします。

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

自身のコピー

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
