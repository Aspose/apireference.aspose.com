---
title: "System::Nullable::operator< 方法"
linktitle: "operator<"
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::operator< 方法。确定当前对象表示的值是否小于指定的 Nullable 对象表示的值，方法是对这些值应用 operator<() 于 C++。"
type: docs
weight: 1600
url: /zh/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


确定当前对象表示的值是否小于指定的 [Nullable](../) 对象表示的值，方法是对这些值应用 [operator<()](./)。

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值小于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


通过对这些值应用 [operator<()](./) 来确定当前对象表示的值是否小于指定的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于比较的值的常量引用 |

### ReturnValue

如果当前对象表示的值小于指定的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


始终返回 false。

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
标题: System::Nullable::operator> 方法
链接标题: operator>
second_title: Aspose.Page for C++
描述: 'System::Nullable::operator> 方法。确定当前对象表示的值是否大于指定的 Nullable 对象表示的值，方法是对这些值应用 operator>() 于 C++。'
type: docs
权重: 2000
网址: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


确定当前对象表示的值是否大于指定的 [Nullable](../) 对象表示的值，方法是对这些值应用 [operator>()](./)。

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值大于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


通过对这些值应用 [operator>()](./) 来确定当前对象表示的值是否大于指定的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于比较的值的常量引用 |

### ReturnValue

True 如果当前对象表示的值大于指定的值，则为 true；否则为 false

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


始终返回 false。

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
