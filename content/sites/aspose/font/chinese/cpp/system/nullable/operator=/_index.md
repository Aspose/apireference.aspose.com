---
title: "System::Nullable::operator= 方法"
linktitle: "operator="
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator= 方法。在 C++ 中将对象当前表示的值替换为指定的值。"
type: docs
weight: 1800
url: /zh/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


用指定的值替换对象当前表示的值。

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 当前对象将要表示的新值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | 当前对象将要表示的新值 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


用指定的值替换对象当前表示的值。

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 当前对象将要表示的新值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const T1\& | 当前对象将要表示的新值 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


将空值赋给当前对象。

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

一个表示 null 值的 [Nullable](../) 对象。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
