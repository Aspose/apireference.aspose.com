---
title: "System::Nullable::operator+= 方法"
linktitle: "operator+="
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator+= 方法。使用指定的 Nullable 对象表示的值作为右侧参数，在 C++ 中对当前对象表示的值应用 operator+=()。"
type: docs
weight: 1300
url: /zh/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


对当前对象表示的值应用 [operator+=()](./)，使用指定的 [Nullable](../) 对象表示的值作为右侧参数。

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | [Nullable](../) 对象的底层类型，其表示的值用作 [operator+=()](./) 的右侧参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 对 [Nullable](../) 对象的常量引用，其表示的值用作对当前对象表示的值应用的 [operator+=()](./) 的右侧参数。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(const T1\&) method


对当前对象表示的值应用 [operator+=()](./)，使用指定的值作为右侧参数。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | [operator+=()](./) 的右侧值所使用的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const T1\& | 对用于对当前对象表示的值应用的 [operator+=()](./) 的右侧值的常量引用。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


重置当前对象，使其表示一个空值。

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

自身的副本

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
