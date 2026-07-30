---
title: "System::Nullable::Nullable 构造函数"
linktitle: "Nullable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::Nullable 构造函数。构造一个在 C++ 中表示空值的实例。"
type: docs
weight: 100
url: /zh/cpp/system/nullable/nullable/
---
## Nullable::Nullable() constructor


构造表示 null 值的实例。

```cpp
System::Nullable<T>::Nullable()
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::Nullable(const Nullable\<T1\>\&) constructor


构造一个实例，该实例表示由指定的 [Nullable](../) 对象表示的值。指定的可空对象可能表示的值类型与构造实例的底层类型不同，在这种情况下，表示的值会转换为类型 T 的值。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const Nullable<T1> &value)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 指定的 [Nullable](../) 对象表示的值的类型 |

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::Nullable(const T1\&) constructor


构造一个 [Nullable](../) 类的实例，该实例表示已转换（如有必要）为底层类型 T 值的指定值。

```cpp
template<typename T1> System::Nullable<T>::Nullable(const T1 &value)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 指定值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const T1\& | 新构造的 [Nullable](../) 对象将要表示的值的常量引用 |

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::Nullable(std::nullptr_t) constructor


构造表示 null 的实例。

```cpp
System::Nullable<T>::Nullable(std::nullptr_t)
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
