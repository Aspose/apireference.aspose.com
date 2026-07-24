---
title: "System::Nullable::operator!= メソッド"
linktitle: "operator!="
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator!= メソッド。C++ で、現在のオブジェクトが表す値が指定された Nullable オブジェクトが表す値と等しくないかどうかを判定します。"
type: docs
weight: 1000
url: /ja/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


現在のオブジェクトが表す値が、指定された[Nullable](../)オブジェクトが表す値と等しくないかどうかを判断します。

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる[Nullable](../)オブジェクトの基になる型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 比較対象となる[Nullable](../)オブジェクトへの定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された[Nullable](../)オブジェクトが表す値と等しくない場合は true、そうでない場合は false

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(const T1\&) const method


現在のオブジェクトが表す値が指定された値と等しくないかどうかを判定します。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const T1\& | 比較対象となる値への定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された値と等しくない場合は true、そうでない場合は false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


現在のオブジェクトが表す値がnullでないかどうかを判定します。

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

現在のオブジェクトが表す値が null でない場合は true、そうでない場合は false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
