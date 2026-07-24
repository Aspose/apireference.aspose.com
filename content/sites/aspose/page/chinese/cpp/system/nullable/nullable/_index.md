---
title: "System::Nullable::Nullable constructor"
linktitle: "Nullable"
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::Nullable constructor. 构造一个表示 null 值的实例（C++）。"
type: docs
weight: 100
url: /zh/cpp/system/nullable/nullable/
---
## Nullable::Nullable() constructor


构造一个表示 null 值的实例。

```cpp
System::Nullable<T>::Nullable()
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(const Nullable\<T1\>\&) constructor


构造一个实例，该实例表示由指定的 [Nullable](../) 对象所表示的值。指定的可空对象可能表示的值类型与构造实例的底层类型不同，在这种情况下，表示的值会被转换为类型 T 的值。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const Nullable<T1> &value)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 指定的 [Nullable](../) 对象所表示的值的类型 |

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(const T1\&) constructor


构造一个 [Nullable](../) 类的实例，该实例表示指定的值，并在必要时将其转换为底层类型 T 的值。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const T1 &value)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 指定值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const T1\& | 对新构造的 [Nullable](../) 对象将要表示的值的常量引用 |

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::Nullable(std::nullptr_t) constructor


构造一个表示 null 的实例。

```cpp
System::Nullable<T>::Nullable(std::nullptr_t)
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
