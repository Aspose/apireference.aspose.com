---
title: "System::Nullable::operator<= 方法"
linktitle: "operator<="
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::operator<= 方法。通过在 C++ 中对这些值应用 operator<=()，确定当前对象表示的值是否小于或等于指定的 Nullable 对象表示的值。"
type: docs
weight: 1700
url: /zh/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


确定当前对象表示的值是否通过对这些值应用 [operator<=()](./) 小于或等于指定的 [Nullable](../) 对象表示的值。

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值小于或等于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


确定当前对象表示的值是否通过对这些值应用 [operator<=()](./) 小于或等于指定的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于比较的值的常量引用 |

### ReturnValue

如果当前对象表示的值小于或等于指定的值，则为 true；否则为 false

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


始终返回 false。

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator>= 方法
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator>= 方法。通过在 C++ 中对这些值应用 operator>=()，确定当前对象表示的值是否大于或等于指定的 Nullable 对象表示的值。'
type: docs
权重: 2100
网址: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


确定当前对象表示的值是否通过对这些值应用 [operator>=()](./) 大于或等于指定的 [Nullable](../) 对象表示的值。

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值大于或等于指定的 [Nullable](../) 对象表示的值，则为 True，否则为 false

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


通过对这些值应用 [operator>=()](./) 来确定当前对象表示的值是否大于或等于指定对象表示的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于与当前对象表示的值进行比较的值的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于与当前对象比较的对象的常量引用 |

### ReturnValue

如果当前对象表示的值大于或等于指定对象表示的值，则为 True，否则为 false

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


始终返回 false。

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

始终为 false

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator|= 方法
linktitle: operator|=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator|= 方法。将 operator|=() 应用于当前对象表示的值，使用指定的值作为 C++ 中的右侧参数。'
type: docs
weight: 2200
网址: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


将 [operator|=()](./) 应用于当前对象表示的值，使用指定的值作为右侧参数。

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于使 SFINAE 工作的模板参数。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | bool | 用于作为 [operator 的右侧值的布尔值 | =()](./) 应用于当前对象表示的值。 |

### ReturnValue

对自身的引用。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
