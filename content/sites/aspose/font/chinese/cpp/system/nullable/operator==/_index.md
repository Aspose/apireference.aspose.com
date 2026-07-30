---
title: "System::Nullable::operator== 方法"
linktitle: "operator=="
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator== 方法。确定当前对象表示的值是否等于在 C++ 中指定的 Nullable 对象表示的值。"
type: docs
weight: 1900
url: /zh/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


确定当前对象表示的值是否等于指定的 [Nullable](../) 对象表示的值。

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值等于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


确定当前对象表示的值是否等于指定的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 用于比较的值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于比较的值的常量引用 |

### ReturnValue

如果当前对象表示的值等于指定的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


确定当前对象表示的值是否为 null。

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

如果当前对象表示的值为 null，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
