---
title: "System::Nullable::operator+= 方法"
linktitle: "operator+="
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::operator+= 方法。将 operator+=() 应用于当前对象表示的值，使用指定的 Nullable 对象表示的值作为 C++ 中的右侧参数。"
type: docs
weight: 1300
url: /zh/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


将 [operator+=()](./) 应用于当前对象表示的值，使用指定的 [Nullable](../) 对象表示的值作为右侧参数。

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于作为 [operator+=()](./) 右侧参数的 [Nullable](../) 对象所表示的值的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于作为对当前对象表示的值应用的 [operator+=()](./) 的右侧参数的 [Nullable](../) 对象所表示的值的常量引用 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


将 [operator+=()](./) 应用于当前对象表示的值，使用指定的值作为右侧参数。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于作为 [operator+=()](./) 右侧值的值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const T1\& | 用于作为对当前对象表示的值应用的 [operator+=()](./) 的右侧值的值的常量引用 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


重置当前对象，使其表示为 null 值。

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

自身的副本

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
