---
title: "System::Nullable::operator= メソッド"
linktitle: "operator="
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator= メソッド。C++ でオブジェクトが現在表す値を指定された値に置き換えます。"
type: docs
weight: 1800
url: /ja/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


オブジェクトが現在表す値を指定された値に置き換えます。

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| パラメーター | 説明 |
| --- | --- |
| この | 現在のオブジェクトが表す新しい値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | 現在のオブジェクトが表す新しい値 |

### ReturnValue

自身への参照

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


オブジェクトが現在表す値を指定された値に置き換えます。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| パラメーター | 説明 |
| --- | --- |
| この | 現在のオブジェクトが表す新しい値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const T1\& | 現在のオブジェクトが表す新しい値 |

### ReturnValue

自身への参照

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


現在のオブジェクトにnullを代入します。

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

null 値を表す[Nullable](../)オブジェクト

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
