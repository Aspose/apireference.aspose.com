---
title: "System::Nullable::Nullable コンストラクタ"
linktitle: "Nullable"
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::Nullable コンストラクタ。C++ で null 値を表すインスタンスを構築します。"
type: docs
weight: 100
url: /ja/cpp/system/nullable/nullable/
---
## Nullable::Nullable() constructor


null 値を表すインスタンスを構築します。

```cpp
System::Nullable<T>::Nullable()
```

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(const Nullable\<T1\>\&) constructor


指定された [Nullable](../) オブジェクトが表す値を表すインスタンスを構築します。指定された nullable オブジェクトは、構築されたインスタンスの基底型と異なる型の値を表す場合があり、その場合は表される値が型 T の値に変換されます。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const Nullable<T1> &value)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 指定された [Nullable](../) オブジェクトが表す値の型 |

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(const T1\&) constructor


[Nullable](../) クラスのインスタンスを構築し、指定された値を基底型 T の値に変換（必要な場合）して表します。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const T1 &value)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 指定された値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T1\& | 新しく構築された [Nullable](../) オブジェクトが表す値への定数参照 |

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(std::nullptr_t) constructor


null を表すインスタンスを構築します。

```cpp
System::Nullable<T>::Nullable(std::nullptr_t)
```

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
